package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Qualifier("urgente")// urgente = identificação a ser chamado no AtivacaoClienteService
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		System.out.printf("Notificando %s por SMS através do número %s: %s\n", cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}

/*
 * public NotificadorEmail() { // Exemplo de construtor
 * System.out.println("Construtor chamado"); }
 */