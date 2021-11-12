package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.NÃO_URGENTE)
@Component
public class NotificadorEmail implements Notificador {
	
	
	
	@Autowired
	private NotificadorProperties properties;

	/*
	 * public NotificadorEmail() { System.out.println("Notificador de Email REAL");
	 * }
	 */
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host: " + properties.getHostServidor());
		System.out.println("Porta " + properties.getPortaServidor());
		
		System.out.printf("Notificando %s através do email %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}

/*
 * public NotificadorEmail() { // Exemplo de construtor
 * System.out.println("Construtor chamado"); }
 */