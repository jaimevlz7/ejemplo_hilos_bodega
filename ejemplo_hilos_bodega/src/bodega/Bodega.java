package bodega;

import java.util.concurrent.Semaphore;

public class Bodega {
	
    public final static int TIPO1 = 1;
    public final static int TIPO2 = 2;
    int capacidadBodega;
    int cantidadTipo1;
    int cantidadTipo2;
    int tipoArticulo;
    int volumen;
    private int tipo1;
    private int tipo2;
    public Semaphore semaforo;

    public Bodega() {
semaforo= new Semaphore(0);
        capacidadBodega = 0;
        cantidadTipo1 = 0;
        cantidadTipo2 = 0;
        tipo1 = 10;
        tipo2 = 15;
        this.volumen = volumen;
        this.tipoArticulo = tipoArticulo;

    }

    public void descargarArticulo(int tipoArticulo) throws InterruptedException {
    	
    	//Realizo validaciones por seguridad.

        if (tipoArticulo == TIPO1) {
            //capacidad maxima 200, si tipo 1, como tipo 1 = 10 en tamaño, por eso menor  190.
            while(capacidadBodega > 190);
            semaforo.acquire();
            capacidadBodega = capacidadBodega + volumenTipo1;
            semaforo.release();
            semaforo.acquire();
            cantidadTipo1++;
            semaforo.release();
        }
        if (tipoArticulo == TIPO2) {            
            //capacidad maxima 200, si tipo 2, como tipo 2 = 15 en tamaño, por eso menor  185.
            while(capacidadBodega > 185);
            semaforo.acquire();
            capacidadBodega = capacidadBodega + tipo2;
            semaforo.release();
            semaforo.acquire();
            cantidadTipo2++;
            semaforo.release();
        }
        System.out.println("Hay" + cantidadTipo1 + "de tipo 1");
        System.out.println("Hay" + cantidadTipo2 + "de tipo 2");
		
    }

    public void crearPaquete() throws InterruptedException {

        while (cantidadTipo1 > 3);
        if (cantidadTipo1 >= 3 && cantidadTipo2 >= 4){
        	semaforo.acquire();
			cantidadTipo1 -= 3;
			semaforo.release();
			semaforo.acquire();
			cantidadTipo2 -= 4;
			semaforo.release();
			System.out.println("Se ha empacado un articulo");
			semaforo.acquire();
			capacidadBodega = capacidadBodega - 3 * tipo1 + 4 * tipo2;
			semaforo.release();
        }
		
    }

}
