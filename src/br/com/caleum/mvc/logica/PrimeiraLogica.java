package br.com.caleum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		System.out.println("Executando a l�gica....");
		
		System.out.println("Retornando o nome da p�gina JSP...");
		
		return "primeira-logica.jsp";
	}

	
}
