public class Constante {
	public static void main (String[] args) {
		
		int variable  = 18;
		final int CONSTANTE = 18; //Defino constante mediante final.
	
		System.out.println( "variable  : " + variable );
		System.out.println( "constante : " + CONSTANTE );
		
		//Modificamos valores:
		variable++;
		//CONSTANTE++; Es un constante y no se puede variar.
		
		System.out.println( "variable  : " + variable);
		System.out.println( "constante : " + CONSTANTE );

	}		
}
