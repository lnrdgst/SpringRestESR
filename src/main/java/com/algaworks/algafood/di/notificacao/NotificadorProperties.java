package com.algaworks.algafood.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {

	/**
	 * Host do servidor de Email
	 */
	private String hostServidor;

	/**
	 * Porta do servidor de Email
	 */
	private Integer portaServidor = 80; // Podemos configurar a porta aqui para ficar como padrão caso não seja
										// especificado no application.properties

	public String getHostServidor() {
		return hostServidor;
	}

	public void setHostServidor(String hostServidor) {
		this.hostServidor = hostServidor;
	}

	public Integer getPortaServidor() {
		return portaServidor;
	}

	public void setPortaServidor(Integer portaServidor) {
		this.portaServidor = portaServidor;
	}

}
