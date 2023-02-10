package working_arrays;

public class Method {
	
	
public void busquedaArrayI(int valor, int[] name) {
		
		for(int i=0; i<name.length;i++) {
			if(name[i]==valor) {
				System.out.println(true);
				System.out.println("El valor esta en la posicion "+ i + ".");
			}
		}
		
	}
	public void busquedaArrayS(String valor, String[] name) {
		
		for(int i=0; i<name.length; i++) {
			if(name[i]==valor) {
				System.out.println(true);
				System.out.println("El valor esta en la posicion "+ i + ".");
			}
			}
	}
	public void impresionArrayS(String[] name) {
		for(String i : name) {
			System.out.println(i);
		}
	}
	public void impresionArrayI(int[] name) {
		for(int i : name) {
			System.out.println(i);
		}
	}
	public void eliminacionArrayI(int valor, int[] name) {
		//use a for loop and get the index of the value
		/*for(int i:name) {
			if(i==valor) {
				
				name[i]= name[i+1];
				
			}
		}*/
		for(int i=0; i<name.length;i++) {
			if(name[i]==valor) {
				name[i]=name[i+1];
			}
		}
		name[name.length-1]=0;
		
		System.out.println("Valor eliminado");
		
		//last item = 0
	}
}
