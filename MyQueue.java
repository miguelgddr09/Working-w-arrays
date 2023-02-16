package arraysStackQueue;

public class MyQueue {

	int MAX;
	int tail;
	
	
	
	public char add(char[] queue, char adding) {
		
		
		if(tail==MAX) {
			System.out.println("Queue is full....");
			}
		else {
			queue[tail]=adding;
			tail++;
		}
		
		return 0;
	}
	
	public char delete(char[] queue) {
		
		this.MAX=queue.length;
		this.tail=this.MAX;
		
		if(tail==0) {	
			System.out.println('#');
		}
		else {
			System.out.println(queue[0]);
			queue[0]=' ';
			for(int i=0; i<MAX-1; i++) {
				
				queue[i]=queue[i+1];
				
			}
			queue[tail-1]=' ';
			tail--;
		}
		
		return 0;
	}
	
}
