package puente;

public class Puente {

	public final static int CAP_MAX = 10;
	private boolean norte;
	private boolean sur;
	private int cantS;
	private int cantN;
	
	public Puente(){
		norte=false;
		sur = false;
		cantS=0;
		cantN=0;
	}
	public void transitar(){
		if(norte ==false && sur == false){
			norte = true;
			transitarNorte();
		}
		if(norte==true){
			norte = false;
			sur = true;		
			transitarSur();
		}else{
			sur = false;
			norte = true;
			transitarNorte();
		}
	}
	private void transitarSur() {
		if(cantS <= CAP_MAX){
			cantS = 0;
		}else{
			cantS-=10;
		}
	}
	private void transitarNorte() {
		if(cantN <= CAP_MAX){
			cantN = 0;
		}else{
			cantN-=10;
		}
	}
	public boolean isNorte() {
		return norte;
	}
	public void setNorte(boolean norte) {
		this.norte = norte;
	}
	public boolean isSur() {
		return sur;
	}
	public void setSur(boolean sur) {
		this.sur = sur;
	}
	public static int getCapMax() {
		return CAP_MAX;
	}
	public void setCantN(int cant) {
		this.cantN+=cant;
	}
	public void setCantS(int cant) {
		this.cantS+=cant;
	}
	
}
