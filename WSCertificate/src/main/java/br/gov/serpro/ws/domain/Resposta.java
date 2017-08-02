package br.gov.serpro.ws.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Resposta implements Serializable{

	/**
	 * Serial version id.
	 */
	public static final long serialVersionUID = 1L;
	
	private int i;
	public String status;

	public Resposta(int i, String status) {
		super();
		this.i = i;
		this.status = status;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public static Resposta from(TipoResposta tipoResposta) {
		return new Resposta(tipoResposta.getCodigo(), tipoResposta.getMensagem());
	}
}
