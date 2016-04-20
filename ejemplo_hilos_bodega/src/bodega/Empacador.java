package bodega;
import static java.lang.Thread.sleep;


public class Empacador extends Thread{
    
    Bodega bodega;
    
    public Empacador(Bodega bodega){
        this.bodega=bodega;
    }
    
    public void run(){
		
        while(true){
			int tiempoEntregando = 2;
            System.out.println("El empacador espera por " + tiempoEntregando + " segundos para armar el paquete");

            try {
                sleep(tiempoEntregando*1000);
            } catch (InterruptedException e) {
				
            }
try {
				bodega.crearPaquete();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}            
        }

    }
}
