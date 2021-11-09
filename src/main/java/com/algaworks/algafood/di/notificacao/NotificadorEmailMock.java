package com.algaworks.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NÃO_URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {

	public NotificadorEmailMock() {
		System.out.println("Notificador de Email MOCK");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificação seria enviada para %s através do email %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);
	}

}

/*
 * public NotificadorEmail() { // Exemplo de construtor
 * System.out.println("Construtor chamado"); }
 */