package app;

import java.util.ArrayList;

import publicaciones.Post;
import publicaciones.Publicacion;
import publicaciones.Story;
import usuarios.Cuenta;
import usuarios.Pagina;
import usuarios.Usuario;
import interfaces.Reportable;
import interfaces.Comentable;

public class Main {

	public static void main(String[] args) {

		// Dos publicaciones
		Post post = new Post(1, "juanp", "Terminamos la Copa Fatima con dos goles", "2026-08-14", "cancha.jpg");
		Story story = new Story(2, "juanp", "Yendo a entrenar", "2026-09-09", 20);

		// Dos usuarios
		Cuenta cuenta = new Cuenta("juanp", "juanp@mail.com", "2023-02-11", false, "Juan Perez", 245);
		Pagina pagina = new Pagina("fatimatec", "info@fatima.edu.ar", "2019-05-01", true, "Instituto Fatima", 3100,
				"Educacion");

		story.darLike();
		post.darLike();
		post.mostrar();
		post.comentar("@mariana_10", "hello");
		post.reportar("infraccion de leyes de seguridad");
		pagina.reportar("infraccion de leyes de la comunidad");
		pagina.comentar("@fabian_123", "morir");

		// Cada familia por separado, sin necesidad de interfaces
		ArrayList<Publicacion> publicaciones = new ArrayList<>();
		publicaciones.add(post);
		publicaciones.add(story);

		ArrayList<Usuario> usuarios = new ArrayList<>();

		usuarios.add(cuenta);
		usuarios.add(pagina);

		System.out.println("=== PUBLICACIONES ===");
		for (Publicacion p : publicaciones) {
			p.mostrar();

		}

		System.out.println("\n=== USUARIOS ===");
		for (Usuario u : usuarios) {
			u.mostrarPerfil();
		}

		cuenta.mostrarPerfil();

		// PROBLEMA: hoy la moderadora tiene que recorrer TODO lo que la gente
		// reporto: hay posts, stories, cuentas y hasta paginas denunciadas.
		// Necesita UNA sola lista con las cuatro cosas mezcladas para procesar
		// las denuncias, pero Publicacion y Usuario no tienen nada en comun.
		//
		// Descomenta y anota el error del compilador:
		//
		ArrayList<Reportable> reportes = new ArrayList<>();
		reportes.add(story);
		reportes.add(pagina);
		reportes.add(post);
		reportes.add(cuenta);

		ArrayList<Comentable> comentarios = new ArrayList<>();

		comentarios.add(pagina);
		comentarios.add(cuenta);
		comentarios.add(post);
		//no puedo hacerlo con story porque no tienen la misma interface

		for (Reportable i : reportes) {
			i.reportar("spam");
		}
	}
}

