package publicaciones;

import interfaces.Comentable;
import interfaces.Reportable;

public class Post extends Publicacion implements Comentable, Reportable{

    private String imagenUrl;

    public Post(int id, String autor, String contenido, String fechaCreacion,
                String imagenUrl) {
        super(id, autor, contenido, fechaCreacion);
        this.imagenUrl = imagenUrl;
    }

    @Override
    public void mostrar() {
        System.out.println("[POST #" + getId() + "] @" + getAutor()
                + " (" + getFechaCreacion() + ")");
        System.out.println("  " + getContenido());
        if (imagenUrl != null) System.out.println("  img: " + imagenUrl);
        System.out.println("  " + getLikes() + " likes");
    }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }

	@Override
	public void comentar(String autor, String texto) {
		System.out.println("[COMENT EN POST #1] "+autor+": "+texto);
	}

	@Override
	public void reportar(String motivo) {
		System.out.println("Reporte recibido por "+ motivo);
		
	}

}
