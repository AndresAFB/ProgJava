public class Unidades {
	public static void main (String[] args){
	
		cambiarLibrasAKilogramos(23.3);
		
		//Caminata de la semana
		double lunes = cambiarMillasAMetros(5);
		double martes = cambiarMillasAMetros(7);
		double miercoles = cambiarMillasAMetros(5);
		double jueves = cambiarMillasAMetros(7);
		double viernes = cambiarMillasAMetros(8);
		double kilometros = (lunes + martes + miercoles + jueves + viernes);
		System.out.println("Kilometros recorridos en la semana: " + kilometros / 1_000);
		
		//Cálculo de la superficie de una finca
		double largo = 555.2; 
		double ancho = 125;
		double superficieMetrosCuadrado = cambiarYardasAMetros (largo) * cambiarYardasAMetros(ancho);	
		System.out.println("La superficie de la finca es: " + superficieMetrosCuadrado);
	}
	
	public static void cambiarLibrasAKilogramos (double libras){
		double kilogramos = libras * 0.453592;
		System.out.println(libras + " libras son " + kilogramos + " kg");
	}
	
	public static double cambiarMillasAMetros (double millas) {
		double metros = millas * 1609.34;
		return metros;
	}
	
	public static double cambiarYardasAMetros (double yardas){
		return yardas = yardas * 0.9144;
	}
}
