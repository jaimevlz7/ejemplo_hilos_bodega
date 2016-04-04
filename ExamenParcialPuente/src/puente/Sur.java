package puente;

public class Sur extends Thread {

	
	
	private Puente puente;
	
	public Sur(Puente p){
		puente = p;
	}
	public void run() {

        while (true) {

        	int tiempo = 1 + (int) (Math.random() * 10);
            System.out.println("Llegara un carro en:" + tiempo + " segundos");
            
            puente.setCantS(1);
            try {
                sleep(tiempo * 1000);
            } catch (InterruptedException e) {
				
            }

            puente.transitar();
            
        }
    }
}
