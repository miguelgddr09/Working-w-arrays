package working_arrays;

public class Main {
	public static void main (String[] args) {
		
		int[] arrayFifteen=new int[15];
		String[] namesArray=new String[20];
		CIRCULO obj[]=new CIRCULO[100];
		
		namesArray[0]="Fransisco";
		arrayFifteen[9]=5;
		
		Method obj1=new Method();
		
		System.out.println("Busquedda de int en array...");
		obj1.busquedaArrayI(5, arrayFifteen);
		System.out.println("Busquedda de Strings en array...");
		obj1.busquedaArrayS("Fransisco", namesArray);
		System.out.println("Mostrando los elementos de un arreglo de Strings....");
		obj1.impresionArrayS(namesArray);
		System.out.println("Mostrando los elementos de un arreglo de ints....");
		obj1.impresionArrayI(arrayFifteen);
		System.out.println("Eliminar elemento de array de ints....");
		obj1.eliminacionArrayI(5, arrayFifteen);
		obj1.impresionArrayI(arrayFifteen);
		System.out.println("Fin....");
	}
	
	
}
