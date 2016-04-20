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
    private final int volumenTipo1;
    private final int volumenTipo2;
    public Semaphore semaforo;

    public Bodega() {
semaforo= new Semaphore(0);
        capacidadBodega = 0;
        cantidadTipo1 = 0;
        cantidadTipo2 = 0;
        volumenTipo1 = 10;
        volumenTipo2 = 15;
        this.volumen = volumen;
        this.tipoArticulo = tipoArticulo;

    }

    public void descargarArticulo(int tipoArticulo) throws InterruptedException {

        if (tipoArticulo == TIPO1) {
            while(capacidadBodega > 190);
            semaforo.acquire();
            capacidadBodega = capacidadBodega + volumenTipo1;
            semaforo.release();
            semaforo.acquire();
            cantidadTipo1++;
            semaforo.release();
        }
        if (tipoArticulo == TIPO2) {            
            
            while(capacidadBodega > 185);
            semaforo.acquire();
            capacidadBodega = capacidadBodega + volumenTipo2;
            semaforo.release();
            semaforo.acquire();
            cantidadTipo2++;
            semaforo.release();
        }
        System.out.println(cantidadTipo1);
        System.out.println(cantidadTipo2);
		
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
			capacidadBodega = capacidadBodega - 3 * volumenTipo1 + 4 * volumenTipo2;
        semaforo.release();
        }
		
    }

}
