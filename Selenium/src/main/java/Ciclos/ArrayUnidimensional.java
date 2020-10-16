package Ciclos;

public class ArrayUnidimensional {
	public static void main (String[]args) {
		
		String []arr;
		
		arr= new String [5];
		
		arr[0]= "rojo";
		arr[1]= "azul";
		arr[2]= "morado";
		arr[3]= "verde";
		arr[4]= "blanco";
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Elemento en el indice " + i + " : " + arr[i]);
		}
}

}
