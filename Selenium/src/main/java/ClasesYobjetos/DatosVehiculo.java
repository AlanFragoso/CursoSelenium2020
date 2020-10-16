package ClasesYobjetos;

public class DatosVehiculo {
	public static void main(String[]args) {
		Vehiculo minivan= new Vehiculo();
		int rango;
		
		minivan.pasajeros= 9;
		minivan.capacidad= 15;
		minivan.kmh= 20;
		
		rango= minivan.capacidad*minivan.kmh;
		
		System.out.println("La minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros ");
	}

}
