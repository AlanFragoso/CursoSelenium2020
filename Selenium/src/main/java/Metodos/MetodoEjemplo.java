package Metodos;

public class MetodoEjemplo {
	public static void main (String[]args) {
		
		int resultado = suma (2,5);
		System.out.println(resultado);
		
		int resultado2 = suma(1,3,5,"SUMA");
		System.out.println(resultado2);
		
		String marca = carro(1);
		System.out.println(marca);
	}
	
	public static int suma (int a, int b) {
		int c=a+b;
		return c;
	}
	public static int suma (int a, int b, int c, String SUMA) {
		int d=a+b+c;
		System.out.println(SUMA);
		return d;
	}
	public static String carro(int a) {
		String[] cars= {"volvo","ford","nissan","mazda"};
		return cars[a];
	}

}
