package br.gov.serpro.ws.util;

import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;

import br.gov.frameworkdemoiselle.certificate.CertificateManager;
import br.gov.serpro.ws.domain.Certificado;

public class CertificadoUtil {

	// @Inject
	// private X509Certificate x509Certificate;

	public static String extrairCPf(String certificado64) {		

		try {			
		
			
			byte[] base64 = Base64.getDecoder().decode(certificado64.replaceAll("\\s",""));
			ByteArrayInputStream input = new ByteArrayInputStream(base64);

			
			CertificateFactory certFactory = CertificateFactory.getInstance("X509");
			Certificate certificado509 = certFactory.generateCertificate(input);
			X509Certificate cert509 = (X509Certificate) certificado509;
			
			
			CertificateManager cm = new CertificateManager(cert509);

			Certificado certificado = cm.load(Certificado.class);
			return certificado.getCpf();			
		

		} catch (CertificateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "";
		}

		
	}

}
