package br.gov.serpro.ws.facade;

import com.thoughtworks.xstream.XStream;

import br.gov.serpro.ws.domain.TipoResposta;

public class RetornoXml implements IRetorno {

	@Override
	public Object retornaResultado(TipoResposta respostaEnum) {
		XStream xstream = new XStream();
		String xml = xstream.toXML(respostaEnum);
		return xml;
	}

}
