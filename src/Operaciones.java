
public class Operaciones {

	//variables
	protected int r;
	protected int p;
	
	//constructor
	public Operaciones() {
		this.r=0;
		this.p=20000;
	}
	
	//Getters y setters
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	
	//Metodos
	public void porcentaje() {
		this.p=this.p*10;
		this.r=this.p/100;
	}
	
	
}
