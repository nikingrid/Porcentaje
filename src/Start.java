
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r=0;
		
		for (int i=0; i<3; i++) {
			if (i!=1) {
				r+=10;
			} 
			else {
				r+=i;
			}
			
		} 
		System.out.print(r);
	
		/* Explain 
		 * i=0, r+=0 =0
		 * i=1, r+=1 0+1=1
		 * i=2, r+=2 1+2=3
		 * 
		 * i=3, r+=10 3+10=13
		 * i=4, r+=4 13+4=17 
		 */
	}

}
