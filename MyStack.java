package arraysStackQueue;

public class MyStack {
	
	public int top;
	public int MAX;
	
	
	
	public char push(char[] stack, char adding) {
		
		
		if(top==MAX) {
			System.out.println("Stack is full...");
		}
		else {
			stack[top]=adding;
			top++;
		}
		
		
		return 0;
	}
	
	public char pop(char[] stack) {
		
		this.MAX=stack.length;
		this.top=this.MAX;
		
		if(top==0) {
			System.out.println("Stack is empty...");
			return(0);
		}
		else {
			
			System.out.println(stack[top-1]);
			stack[top-1]=' ';
			top--;
			
		}
		return 0;
	}
	
	public String invertido(String cadena) {
		
		//toma cadena como entrada y la invierta usando stack
		
		this.MAX=cadena.length();
		this.top=0;
		
		char[] stack=new char[MAX];
		
		
			for(int j=cadena.length()-1; j>=0; j--) {
				stack[top]=cadena.charAt(j);
				top++;
			}
		
		
		System.out.println(stack);
		return null;
	}
	
	public boolean palindromo(String cadena) {
		
		boolean ans=false;
		
		this.MAX=cadena.length();
		this.top=0;
		
		String initialStr=cadena.replaceAll("\\s","").toLowerCase();
		char[] str=new char[MAX];
		
		//creates new string and reverses the initial one
		
		if(top==MAX) {
			System.out.println("Stack is full...");
		}
		else {
			for(int i=initialStr.length()-1; i>=0; i--) {
				str[top]+=initialStr.charAt(i);
				top++;
			}
		}
		
		//check if they are equal
		
		while (ans==true){
			for(int i=0; i<initialStr.length()-1; i++) {
				if(initialStr.charAt(i)!=str[i]) {
					ans=false;
				}
				else {
					ans=true;
				}
			}
		}
		
		System.out.println(ans);
		return ans;
	}
	
	
	
}
