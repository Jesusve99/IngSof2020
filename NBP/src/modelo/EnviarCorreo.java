package modelo;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnviarCorreo {

	private static String origen = "ingsoftwarenbp@gmail.com";
	private String destino;

	public EnviarCorreo(String destino) {
		this.destino = destino;
	}

	public void enviar(String asunto, String mensaje) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setSSLOnConnect(true);
		email.setAuthenticator(new DefaultAuthenticator(origen, "vKa9rl8nd5"));
		email.setSSLOnConnect(true);
		try {
			email.setFrom(origen);
			email.setSubject(asunto);
			email.setMsg(mensaje);
			email.addTo(destino);
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
		System.out.println("Mensaje enviado");
	}
}
