package br.gov.serpro.ws.facade;

import br.gov.serpro.ws.domain.TipoResposta;

public interface IRetorno {
	
	Object retornaResultado(TipoResposta respostaEnum);

}
