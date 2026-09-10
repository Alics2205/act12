package usuarios;

// implements Comentable, Reportable
// El "comentario en una cuenta" es lo que se ve en su muro.
public class Cuenta extends Usuario {

    private String nombreReal;
    private int cantidadAmigos;

    public Cuenta(String username, String email, String fechaAlta, boolean verificado,
                  String nombreReal, int cantidadAmigos) {
        super(username, email, fechaAlta, verificado);
        this.nombreReal = nombreReal;
        this.cantidadAmigos = cantidadAmigos;
    }

    @Override
    public void mostrarPerfil() {
        String tilde = isVerificado() ? " (V)" : "";
        System.out.println("@" + getUsername() + tilde + " - " + nombreReal
                + " - " + cantidadAmigos + " amigos");
    }

    public String getNombreReal() { return nombreReal; }
    public void setNombreReal(String nombreReal) { this.nombreReal = nombreReal; }
    public int getCantidadAmigos() { return cantidadAmigos; }
    public void setCantidadAmigos(int cantidadAmigos) { this.cantidadAmigos = cantidadAmigos; }

    // aca van los metodos de Comentable y Reportable
}