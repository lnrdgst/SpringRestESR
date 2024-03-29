package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.algaworks.algafood.domain.model.Cozinha;

import com.algaworks.algafood.domain.repository.CozinhaRepository;


@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {
	
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	@GetMapping
	public List<Cozinha> listar(){
		return cozinhaRepository.todas();
	}
	
	//@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/{cozinhaId}")
	
	public ResponseEntity<Cozinha> buscar(@PathVariable Long cozinhaId) {
		Cozinha cozinha = cozinhaRepository.porId(cozinhaId);
		
		if (cozinha != null) {
			return ResponseEntity.ok(cozinha);
		}
		
		return ResponseEntity.notFound().build();
		
		//return ResponseEntity.status(HttpStatus.OK).body(cozinha);
		//return ResponseEntity.ok(cozinha);
		
		//HttpHeaders headers = new HttpHeaders();
		//headers.add(HttpHeaders.LOCATION, "http://localhost:8080/cozinhas");
		
		//return ResponseEntity.status(HttpStatus.FOUND).headers(headers).build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void adicionar(@RequestBody Cozinha cozinha) {
		cozinhaRepository.salvar(cozinha);
	}

}
