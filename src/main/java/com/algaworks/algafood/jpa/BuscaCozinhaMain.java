package com.algaworks.algafood.jpa;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;

public class BuscaCozinhaMain {
	
	public static void main(String [] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha = cadastroCozinha.buscar(1L);
		System.out.printf(cozinha.getNome() + "\n");
		
		/*
		 * Cozinha coz1 = new Cozinha(); coz1.setNome("Árabe");
		 * 
		 * Cozinha coz2 = new Cozinha(); coz2.setNome("Mexicana");
		 * 
		 * coz1 = cadastroCozinha.adicionar(coz1); coz2 =
		 * cadastroCozinha.adicionar(coz2);
		 * 
		 * System.out.printf("%d - %s\n", coz1.getId(), coz1.getNome());
		 * System.out.printf("%d - %s\n", coz2.getId(), coz2.getNome());
		 */
		
				
	}

}
