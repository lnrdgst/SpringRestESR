package com.algaworks.algafood;

import org.springframework.context.annotation.Configuration;

import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	public AtivacaoClienteService ativacaoClienteService(){
		return new AtivacaoClienteService();
	}

}
