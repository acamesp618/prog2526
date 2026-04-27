package ejercicio11;

public class ejercicio11 {

	public static void main(String[] args) {
		ClubDeLectura club1 = new ClubDeLectura();
		ClubDeLectura club2 = new ClubDeLectura();
		
		club2.agregaLibro("Don Quitoje");
		club2.agregaLibro("El principito");
		club2.agregaLibro("Biblia");
		
		club2.mostrarBiblioteca();
	}

}
