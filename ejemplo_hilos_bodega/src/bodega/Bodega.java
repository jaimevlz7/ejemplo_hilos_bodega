package bodega;

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

    public Bodega() {

        capacidadBodega = 0;
        cantidadTipo1 = 0;
        cantidadTipo2 = 0;
        volumenTipo1 = 10;
        volumenTipo2 = 15;
        this.volumen = volumen;
        this.tipoArticulo = tipoArticulo;

    }

    public void descargarArticulo(int tipoArticulo) {

        if (tipoArticulo == TIPO1) {
            while(capacidadBodega > 190);
            capacidadBodega = capacidadBodega + volumenTipo1;
            cantidadTipo1++;
        }
        if (tipoArticulo == TIPO2) {            
            
            while(capacidadBodega > 185);
            capacidadBodega = capacidadBodega + volumenTipo2;
            cantidadTipo2++;
        }
        System.out.println(cantidadTipo1);
        System.out.println(cantidadTipo2);
		
    }

    public void crearPaquete() {

        while (cantidadTipo1 > 3);
        if (cantidadTipo1 >= 3 && cantidadTipo2 >= 4){
			cantidadTipo1 -= 3;
			cantidadTipo2 -= 4;
			System.out.println("Se ha empacado un articulo");
			capacidadBodega = capacidadBodega - 3 * volumenTipo1 + 4 * volumenTipo2;
        }
		
    }

}
