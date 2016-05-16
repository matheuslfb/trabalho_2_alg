package quase;

public class Pilha2 {
	
	private static class Node {
		Node next;
		String dado;
		Node(String novoDado , Node p) {
			dado = novoDado;
			next = p;
		}
	}	
	private Node top;
	private int count;
	private int maxCount;
	
	public Pilha2()
	{
		top = null;
		count = 0;
		maxCount = 0;
	}
/*	public void push(double dado)
	{
		Node p = new Node(String dado, top);
		top = p;
		count++;
		if(maxCount < count)maxCount++;
	}*/
	public void push(String dado)
	{
		String n = dado;
		Node p = new Node(n, top);
		top = p;
		count++;
		if(maxCount < count)maxCount++;
	}
	public String pop()
	{
		String aux = top.dado;
		if(isEmpty())return "erro";
		top = top.next;
		count--;		
		return aux;
	}
	public boolean isEmpty()
	{
		if(top == null)return true;
		return false;
	}
	public Node top()
	{
		return top;
	}
	public void clear()
	{
		while(!isEmpty())
		{
			pop();
		}
	}
	
	/*public String print(){
		String s = print(top, "[");
		return s;
	}
	public String print(Node p, String s){
		if(p == null)return s + "]";
		s += p.num + " ";
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
		return s + p.num + " ";
	}*/
	
	public void calcula2(String[] valores)
	{
		double a;
		String c;
		for (int i = 0; i < valores.length; i++) {
			if(valores[i].equals(")"))//aqui
			{
				a= Double.parseDouble(pop());
				c= pop();
				
				
				while(!c.equals("("))
				{
					double b = Double.parseDouble(pop());
				switch(c)
				{
				case ("+") :
					a = a+b;
				break;
				case ("-") :
					a = b-a;
				break;
				case ("*") :
					a = a*b;
				break;
				case ("/") :
					a = b/a;
				break;
				case ("^") :
					a = Math.pow(b,a);
				break;
				}
				
				push(a+"");
				c = pop();
				}
			}
			else{
			push(valores[i]);
			}
		}
		//mostrar EXPRESSAO(no relatorio), RESULTADO, TAMANHO MAX
		System.out.println("Valores "+ pop());
		System.out.println("Tamanho max "+ max());
		
	}
	
	public int max(){
		return maxCount;
	}
	
	public int size() 
	{
		return count;
	}

}
