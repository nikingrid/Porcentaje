
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
		
		this.r=this.p*10/100;
		this.r=this.p-this.r;
		System.out.print("Sigues debiendo " +r);
	}
	
	
}
