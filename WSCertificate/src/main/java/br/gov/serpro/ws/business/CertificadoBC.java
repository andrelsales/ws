package br.gov.serpro.ws.business;

import java.security.cert.CertificateException;

import javax.inject.Inject;

import br.gov.serpro.ws.constants.TipoRespostaEnum;
import br.gov.serpro.ws.domain.Resposta;
import br.gov.serpro.ws.domain.TipoResposta;
import br.gov.serpro.ws.facade.IRetorno;
import br.gov.serpro.ws.factory.FabricaRetornoResultado;
import br.gov.serpro.ws.util.CertificadoUtil;
import br.gov.serpro.ws.util.CpfUtil;

public class CertificadoBC {
	
	@Inject
	private CpfUtil cpfUtil;
	

	
	
	public Resposta validarCertificado(String certificado) {
		
		String cpfExtraido =  CertificadoUtil.extrairCPf(certificado);
		
		return Resposta.from(TipoResposta.SUCESSO);
		

//		if (!cpfUtil.cpfValido(cpfExtraido)) {
//			return RespostaEnum.ERRO_CPF_INVALIDO;
//		}
//
//		return RespostaEnum.SUCESSO;	
	
		
	}

}
