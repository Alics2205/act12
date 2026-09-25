package usuarios;

import interfaces.Reportable;
import interfaces.Comentable;

// implements Comentable, Reportable
// El "comentario en una cuenta" es lo que se ve en su muro.
public class Cuenta extends Usuario implements Reportable, Comentable {

	private String nombreReal;
	private int cantidadAmigos;

//constructor con parametros 
	public Cuenta(String username, String email, String fechaAlta, boolean verificado, String nombreReal,
			int cantidadAmigos) {
		super(username, email, fechaAlta, verificado);
		this.nombreReal = nombreReal;
		this.cantidadAmigos = cantidadAmigos;
	}

	@Override
	public void mostrarPerfil() {
		String tilde = isVerificado() ? " (V)" : "";
		System.out.println("@" + getUsername() + tilde + " - " + nombreReal + " - " + cantidadAmigos + " amigos");
	}

	public String getNombreReal() {
		return nombreReal;
	}

	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	public int getCantidadAmigos() {
		return cantidadAmigos;
	}

	public void setCantidadAmigos(int cantidadAmigos) {
		this.cantidadAmigos = cantidadAmigos;
	}

	@Override
	public void reportar(String motivo) {
		System.out.println("Reporte recibido en " + getUsername() + " por " + motivo);
	}

	@Override
	public void comentar(String autor, String texto) {
		System.out.println("[COMENT EN MURO DE @" + getUsername() + "] " + autor + ":" + texto );

	}
}
