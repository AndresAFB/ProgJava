public class CastingExplicito {
	public static void main (String[] args) {
	//Casting implicitos
	int x = 6;
	double y = 2.9;
	
	// x *= y * y; //x = 6 * (2 * 2)
	x = x * (int) y * (int) y;
	System.out.println("Resultado esperado es: 24\n" + x);
	
	float z = 2.4F; //Se lee como int (4 bytes) y se guarda en float (4 bytes)
	x = 6;
	x = x / (int) z; // z /= x
	System.out.println("Resultado esperado es: 3\n" + x);
	}
}
