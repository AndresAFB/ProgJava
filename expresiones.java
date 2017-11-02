public class expresiones {
	public static void main (String[] args){
	int a = 1;
	double d = 1;
	
	a = 46/9;
	System.out.println("El valor de a = 46 / 9 es: " + a );	
	
	a = 46 % 9 + 4 * 4 - 2;
	System.out.println("El valor de a = 46 % 9 + 4 * 4 - 2 es: " + a );
	
	a = 45 + 43 % 5 * (23 * 3 % 2);
	System.out.println("El valor de a = 45 + 43 % 5 * (23 * 3 % 2) es: " + a );
	
	a = 1;
	a %= 3 / a + 3;
	System.out.println("El valor de a %= 3 / a + 3 es: " + a );
	
	d = 4 + d * d + 4;
	System.out.println("El valor de d= 4 + d * d + 4 es: " + d );
	
	a = 1;
	d = 1;
	d += 1.5 * 3 + (++a);
	System.out.println("El valor de d += 1.5 * 3 + (++a) es: " + d );
	
	a = 1;
	d = 1;
	d -= 1.5 * 3 + a++;
	System.out.println("El valor de d -= 1.5 * 3 + a++ es: " + d );
	
	}
}
