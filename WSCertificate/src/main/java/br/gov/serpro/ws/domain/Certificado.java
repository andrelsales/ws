package br.gov.serpro.ws.domain;

import java.util.List;

import br.gov.frameworkdemoiselle.certificate.extension.DefaultExtension;
import br.gov.frameworkdemoiselle.certificate.extension.DefaultExtensionType;
import br.gov.frameworkdemoiselle.certificate.extension.ICPBrasilExtension;
import br.gov.frameworkdemoiselle.certificate.extension.ICPBrasilExtensionType;

public class Certificado {

	@ICPBrasilExtension(type = ICPBrasilExtensionType.CPF)
	private String cpf;

	@ICPBrasilExtension(type = ICPBrasilExtensionType.NOME)
	private String nome;
	
	@ICPBrasilExtension(type = ICPBrasilExtensionType.TIPO_CERTIFICADO)
	private String tipoCertificado;

	@ICPBrasilExtension(type = ICPBrasilExtensionType.NIVEL_CERTIFICADO)
	private String nivelCertificado;
	
    @DefaultExtension(type=DefaultExtensionType.CRL_URL)
    private List<String> crlURL;
    
    @DefaultExtension(type=DefaultExtensionType.CERTIFICATION_AUTHORITY)
    private boolean autoridadeCertificacao;
    
    @DefaultExtension(type=DefaultExtensionType.AUTHORITY_KEY_IDENTIFIER)
    private String idAutoridade;
    
    public String idAutoridade()
    {
    	return idAutoridade;
    }

    public boolean ehautoridadeCertificacao(){
    	return autoridadeCertificacao;
    }

	public String getTipoCertificado() {
		return tipoCertificado;
	}

	public String getNivelCertificado() {
		return nivelCertificado;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}


}