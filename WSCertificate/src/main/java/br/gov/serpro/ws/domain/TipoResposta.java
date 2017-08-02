package br.gov.serpro.ws.domain;

public enum TipoResposta {
	
	SUCESSO(1,"OK"),
	ERRO_CPF_INVALIDO(200,"CPF_INVALIDO"),
	ERRO_CPF_NAO_ENCONTRADO(201,"CPF_NAO_ENCONTRADO");
		
    private int status;
    private String mensagem;

	private TipoResposta(int codigo, String mensagem) {
		this.status = codigo;
		this.mensagem = mensagem;
	}
    
    public int getCodigo() {
		return status;
	}

	public String getMensagem() {
		return mensagem;
	}
}
