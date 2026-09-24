package usuarios;
import interfaces.Reportable;
import interfaces.Comentable;

public class Pagina extends Usuario implements Comentable, Reportable
 {

	private String razonSocial;
	private int cantidadSeguidores;
	private String categoria;

	public Pagina(String username, String email, String fechaAlta, boolean verificado, String razonSocial,
			int cantidadSeguidores, String categoria) {
		super(username, email, fechaAlta, verificado);
		this.razonSocial = razonSocial;
		this.cantidadSeguidores = cantidadSeguidores;
		this.categoria = categoria;
	}

	@Override
	public void mostrarPerfil() {
		String tilde = isVerificado() ? " (V)" : "";
		System.out.println("@" + getUsername() + tilde + " - " + razonSocial + " [" + categoria + "] - "
				+ cantidadSeguidores + " seguidores");
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getCantidadSeguidores() {
		return cantidadSeguidores;
	}

	public void setCantidadSeguidores(int c) {
		this.cantidadSeguidores = c;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public void reportar(String motivo) {
		System.out.println("Reporte recibido por "+ motivo);

	}

	@Override
	public void comentar(String autor, String texto) {
		System.out.println("[COMENT EN POST #1] "+autor+": "+texto);
		
	}

}