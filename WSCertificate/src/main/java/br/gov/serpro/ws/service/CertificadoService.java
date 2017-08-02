package br.gov.serpro.ws.service;

import java.security.cert.CertificateException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.gov.serpro.ws.business.CertificadoBC;
import br.gov.serpro.ws.constants.TipoRespostaEnum;
import br.gov.serpro.ws.domain.Resposta;
import br.gov.serpro.ws.domain.TipoResposta;
import br.gov.serpro.ws.facade.IRetorno;
import br.gov.serpro.ws.factory.FabricaRetornoResultado;
import br.gov.serpro.ws.util.CertificadoUtil;
import br.gov.serpro.ws.util.CpfUtil;
import com.thoughtworks.xstream.XStream;

@Path("certificado")
public class CertificadoService {
	
	@Inject
	private CertificadoBC certificadoBc;

	@GET
	@Produces("application/json")
	@Path("/teste")
	public Resposta teste() {
		
		return new Resposta(1, "teste1");
	}

	@GET
	@Produces({ "application/json,application/xml"})
	@Path("/validarCertificado/{cpf}")
	public Resposta validarCertificado(@PathParam("cpf") String certificado) {
		
		return certificadoBc.validarCertificado(certificado);

	}

	@POST
	@Produces({ "application/json" })
	@Consumes("text/plain")
	@Path("/validarCertificadoReceita")
	public Resposta validarCertificadoReceita(String certificado) {		

		return certificadoBc.validarCertificado(certificado);

	}


}
