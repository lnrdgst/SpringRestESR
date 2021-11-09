package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
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