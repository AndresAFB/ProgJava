public class TestUnidades {
	public static void main (String[] args){
	
		UnidadesLibreria.cambiarLibrasAKilogramos(23.3);
		
		//Caminata de la semana
		double lunes = UnidadesLibreria.cambiarMillasAMetros(5);
		double martes = UnidadesLibreria.cambiarMillasAMetros(7);
		double miercoles = UnidadesLibreria.cambiarMillasAMetros(5);
		double jueves = UnidadesLibreria.cambiarMillasAMetros(7);
		double viernes = UnidadesLibreria.cambiarMillasAMetros(8);
		double kilometros = (lunes + martes + miercoles + jueves + viernes);
		System.out.println("Kilometros recorridos en la semana: " + kilometros / 1_000);
		
		//Cálculo de la superficie de una finca
		double largo = 555.2; 
		double ancho = 125;
		double superficieMetrosCuadrado = UnidadesLibreria.cambiarYardasAMetros (largo) * UnidadesLibreria.cambiarYardasAMetros(ancho);	
		System.out.println("La superficie de la finca es: " + superficieMetrosCuadrado);
	}
}
