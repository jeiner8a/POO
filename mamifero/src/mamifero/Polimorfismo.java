package mamifero;

public class Polimorfismo {

		public static void muevete(Mamifero m) {
			m.mover();
		}


public static void main(String arg[]) {
	gato gatito= new gato();
	Perro perrito= new Perro();
	
	muevete(gatito);
	muevete(perrito);

}
}
