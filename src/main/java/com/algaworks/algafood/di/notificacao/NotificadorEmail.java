package com.algaworks.algafood.di.notificacao;


import com.algaworks.algafood.di.modelo.Cliente;


public class NotificadorEmail implements Notificador {
	
	
	private boolean caixaAlta; // Padrão == false
	private String hostServidorSmtp;
	
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}
	
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		
		if (caixaAlta) {
			mensagem = mensagem.toUpperCase();
			
		}
		
		System.out.printf("Notificando %s através do email %s usando SMTP: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	

}

/*
 * public NotificadorEmail() { // Exemplo de construtor
 * System.out.println("Construtor chamado"); }
 */