package br.gov.serpro.ws.factory;

import br.gov.serpro.ws.constants.TipoRespostaEnum;
import br.gov.serpro.ws.facade.IRetorno;
import br.gov.serpro.ws.facade.RetornoJson;
import br.gov.serpro.ws.facade.RetornoXml;

public class FabricaRetornoResultado {
	
	public static IRetorno criarRetorno(TipoRespostaEnum tipoResposta)
	{
		if (tipoResposta == TipoRespostaEnum.JSON) {

			return new RetornoJson();
		}
		if (tipoResposta == TipoRespostaEnum.XML) {
			
			return new RetornoXml();

		}
		return null;
		
	}

}
