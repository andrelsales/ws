package br.gov.serpro.ws.facade;

import br.gov.serpro.ws.domain.TipoResposta;

public class RetornoJson implements IRetorno {

	@Override
	public TipoResposta retornaResultado(TipoResposta respostaEnum) {
		
		return respostaEnum;
	}

}
