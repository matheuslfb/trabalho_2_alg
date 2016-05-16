
public class Pilha {

	private static class Node {
		Node next;
		String simbolo;

		Node(String novoSimbolo, Node p) {
			simbolo = novoSimbolo;
			next = p;
		}
	}

	private Node top;
	private int count;
	private int total;

	public Pilha() {
		top = null;
		count = 0;
		total = 0;
	}
	

	public Node top() {
		return top;
	}

	public void push(String simbolo) {
		String n = simbolo;
		Node p = new Node(n, top);
		top = p;
		count++;
		if (total < count)
			total++;
	}

	public void clear() {
		while (!isEmpty()) {
			pop();
		}
	}

	public String pop() {
		String aux = top.simbolo;
		if (isEmpty())
			return "pilha está vazia";
		top = top.next;
		count--;
		return aux;
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		return false;
	}

	public void calcula(String[] valores) {
		double a;
		String c;
		double b;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i].equals(")"))// aqui
			{
				a = Double.parseDouble(pop());
				c = pop();

				while (!c.equals("(")) {
					b = Double.parseDouble(pop());
					switch (c) {
					case ("+"):
						a = a + b;
						break;
					case ("-"):
						a = b - a;
						break;
					case ("*"):
						a = a * b;
						break;
					case ("/"):
						a = b / a;
						break;
					case ("^"):
						a = Math.pow(b, a);
						break;
					}

					push(a+"");
					c = pop();
				}
			} else {
				push(valores[i]);
			}
		}
		// relatório RESULTADO, TAMANHO MAX
		
		
		System.out.println("Expressão: ");
		
		System.out.println("Resultado: " + pop());
		System.out.println("Tamanho maxixmo da pilha: " + max()+"\n");

	}

	/*public String soma(String a, String b) {
		String aux = "";
		aux = aux + (Double.parseDouble(a) + Double.parseDouble(b));
		push(aux);
		return aux;
	}*/

	public int max() {
		return total;
	}

	public int size() {
		return count;
	};

	public String ultimo() {
		return top.simbolo;
	}

}
