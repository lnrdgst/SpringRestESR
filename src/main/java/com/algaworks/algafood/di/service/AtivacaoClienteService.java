package com.algaworks.algafood.di.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	@TipoDoNotificador(NivelUrgencia.NÃO_URGENTE)
	@Autowired(required = false)
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		// dizer para container que o cliente está ativo no momento na linha abaixo
		
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

		//notificador.notificar(cliente, "Seu cadastro no sistema está ativo!"); -- Remover esta linha para aproveitar o event publisher

	}

}
