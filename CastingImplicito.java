public class CastingImplicito {
	public static void main (String[] args) {
	//Casting implicitos
	int x = 6;
	double y = 23;
	
	y *= x * x; //y = 23 * (6 * 6)
	System.out.println("Resultado esperado es: 828\n" + y);
	
	float z = 24; //Se lee como int (4 bytes) y se guarda en float (4 bytes)
	
	z /= x; // z = z / ( x )
	System.out.println("Resultado esperado es: 4\n" + z);
	
	y = 23; z = 24;
	y -= z; // y = y - ( z )
	System.out.println("Resultado esperado es: -1.0\n" + y);
	
	}
}
