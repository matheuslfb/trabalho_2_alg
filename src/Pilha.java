
public class Pilha {
	
	private static class Node {
		Node next;
		String simbolo;
		Node(String novoSimbolo , Node p) {
			simbolo = novoSimbolo;
			next = p;
		}
	}	
	
	private Node top;
	private int count;
	private int total;
	
	public Pilha(){
		top = null;
		count = 0;
		total = 0;
	}
	/*public void push(double num){
		Node p = new Node(num, last);
		last = p;
		count++;
		if(total < count)total++;
	}*/
	
	public Node top(){		
		return top;
	}
	
	public void push(String simbolo){
		String n = simbolo;
		Node p = new Node(n, top);
		top = p;
		count++;
		if(total < count)total++;
	}
	
	public void clear(){
		while(!isEmpty()){
			pop();
		}		
	}
	
	public String pop(){
		String aux = top.simbolo;
		if(isEmpty())return "pilha está vazia";
		top = top.next;
		count--;		
		return aux;
	}
	public boolean isEmpty(){
		if(top == null)return true;
		return false;
	}
	
	
	public String print(){
		String s = print(top, "[");
		return s;
	}
	
	public String print(Node p, String s){
		if(p == null)return s + "]";
		s += p.simbolo + "";
		return print(p.next, s);
	}
	
	
	public String printR(){
		String s = printR(top, "[");
		s += "]";
		return s;		
	}
	
	
	public String printR(Node p, String s){
		if(p == null)return s;		
		s = printR(p.next, s);
		return s + p.simbolo + "";
	}
	
	public String calcula(){
		String fim = "";
		return calcula(fim);
	}
	private String calcula(String resultado){
		
		String a =pop();
		String b =pop();
		String c=pop();
		
		if(b.equals("+")){
			soma(a, c);
		}
		
		if(b.equals("-")){
			subtracao(c,a);
		}
		
		if(b.equals("/")){
				divisao(c,a);
		}
		
		if(b.equals("*")){
			multiplicacao(c,a);
		}
		if(b.equals("^")){
			potencia(c,a);
		}
		return calcula(resultado);
		
	}

	public String soma(String a, String b){
		String aux = ""; 
		aux =  aux + (Double.parseDouble(a) + Double.parseDouble(b));	
		push(aux);
		return aux;
	}
	
	public String multiplicacao(String a, String b){
		String aux = ""; 
		aux =  aux + (Double.parseDouble(a) * Double.parseDouble(b));	
		push(aux);
		return aux;
	}
	
	public String subtracao(String a, String b){
		String aux = ""; 
		aux =  aux + (Double.parseDouble(a) - Double.parseDouble(b));	
		push(aux);
		return aux;
	}
	
	public String divisao(String a, String b){
		String aux = ""; 
		aux =  aux + (Double.parseDouble(a) / Double.parseDouble(b));
		push(aux);
		return aux;
	}
	
	public String potencia(String a, String b){
		String aux ="";
		aux = aux + (Math.pow(Double.parseDouble(a), Double.parseDouble(b)));
		push(aux);
		return aux;
	}
	
	
	public int max(){
		return total;
	}
	
	public int size(){ return count;};
	
	
	public String ultimo(){
		return top.simbolo;
	}

}
