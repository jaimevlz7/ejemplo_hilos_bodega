package puente;



public class Ejecutable {

	public static void main(String main[]){

		Puente p = new Puente();
        Norte n = new Norte(p);
        Sur s = new Sur(p);

        n.start();
        s.start();

    }
	
}
