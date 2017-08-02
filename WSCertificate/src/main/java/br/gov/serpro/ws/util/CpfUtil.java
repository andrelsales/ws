package br.gov.serpro.ws.util;

public class CpfUtil {
	
	public boolean cpfValido(String cpf){
		
		if(Integer.valueOf(cpf) < 10)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
	}

}
