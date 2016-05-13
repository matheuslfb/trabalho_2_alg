
public class Pilha {
	
	private static class Node {
		Node next;
		double num;
		Node(double novoNum , Node p) {
			num = novoNum;
			next = p;
		}
	}	
	
	private Node last;
	private int count;
	private int total;
	
	public Pilha(){
		last = null;
		count = 0;
		total = 0;
	}
	public void push(double num){
		Node p = new Node(num, last);
		last = p;
		count++;
		if(total < count)total++;
	}
	
	
	public void push(int num){
		double n = num;
		Node p = new Node(n, last);
		last = p;
		count++;
		if(total < count)total++;
	}
	
	public double pop(){
		double aux = last.num;
		if(isEmpty())return -1;
		last = last.next;
		count--;		
		return aux;
	}
	public boolean isEmpty(){
		if(last == null)return true;
		return false;
	}
	
	
	public String print(){
		String s = print(last, "[");
		return s;
	}
	
	public String print(Node p, String s){
		if(p == null)return s + "]";
		s += p.num + "";
		return print(p.next, s);
	}
	
	
	public String printR(){
		String s = printR(last, "[");
		s += "]";
		return s;		
	}
	
	
	public String printR(Node p, String s){
		if(p == null)return s;		
		s = printR(p.next, s);
		return s + p.num + "";
	}

	public void soma(){
		push(pop() + pop());		
	}
	
	public void mult(){
		push(pop() * pop());
	}
	
	public void menos(){
		push(pop() - pop());
	}
	
	public void div(){
		push(pop() / pop());
	}
	
	
	//////////RESTO
	public void dup(){
		double aux = pop();
		push(aux);
		push(aux);
	}
	
	public void swap(){
		double aux1 = pop();
		double aux2 = pop();
		push(aux1);
		push(aux2);
	}
	
	public void sin(){
		push(Math.sin( pop() ));
	}
	public void cos(){
		push( Math.cos( pop() ));
	}
	public void atan(){
		push( Math.atan2(pop(), pop()) );
	}
	
	public int max(){
		return total;
	}
	
	public int cont(){ return count;};
	
	
	public double ultimo(){
		return last.num;
	}

}
