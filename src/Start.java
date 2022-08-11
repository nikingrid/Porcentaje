import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operaciones op1= new Operaciones ();
		Operaciones op2= new Operaciones ();
		Operaciones op3= new Operaciones ();
		
		Scanner add=new Scanner(System.in);
		
		System.out.print("Intruduzca préstamo inicial: ");
		op1.setP(add.nextInt());
		op1.porcentaje();
	}

}
