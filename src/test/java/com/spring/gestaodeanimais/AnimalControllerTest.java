package com.spring.gestaodeanimais;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.Model.Animal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class AnimalControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void getAnimalById_NotFound() throws Exception {
		mockMvc.perform(get("/api/animais/999")
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound())
				.andExpect(content().string("Animal não encontrado com o ID: 999"));
	}

	@Test
	public void createAnimal_Success() throws Exception {
		Animal animal = new Animal();
		animal.setNome("Rex");
		animal.setEspecie("Cachorro");
		animal.setRaca("Labrador");
		animal.setIdade(3);
		animal.setSaude("Boa");
		animal.setLocalizacao("Canil 1");

		mockMvc.perform(post("/api/animais")
						.contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsString(animal)))
				.andExpect(status().isCreated())
				.andExpect(jsonPath("$.nome").value("Rex"));
	}

	@Test
	void getId() {
	}

	@Test
	void setId() {
	}

	@Test
	void getNome() {
	}

	@Test
	void setNome() {
	}

	@Test
	void getEspecie() {
	}

	@Test
	void setEspecie() {
	}

	@Test
	void getRaca() {
	}

	@Test
	void setRaca() {
	}

	@Test
	void getIdade() {
	}

	@Test
	void setIdade() {
	}

	@Test
	void getSaude() {
	}

	@Test
	void setSaude() {
	}

	@Test
	void getLocalizacao() {
	}

	@Test
	void setLocalizacao() {
	}

	@Test
	void testSetId() {
	}

	@Test
	void testGetId() {
	}

}
