import java.util.Scanner;
import java.io.*;

public class App {
	public static void main (String args[])throws IOException{
		Scanner in = new Scanner(new File("C:\\Users\\Utilizador\\Desktop\\trabalho pilha\\trabalho pilha\\src\\expressoes"));
		Pilha pilha = new Pilha();
		
			while ( in.hasNext() ) {
	            String temp = in.next();
	            if ( temp.equals( "quit" ) ) System.exit(0);
	            if ( temp.matches( "[0-9]+" ) ) pilha.push( Integer.parseInt( temp ) );
	            if(temp.equals("+")) pilha.soma();
	            if(temp.equals("*")) pilha.mult();
	            if(temp.equals("-")) pilha.menos();
	            if(temp.equals("/")) pilha.div();
	            if(temp.equals("pop")) pilha.pop();
	            if(temp.equals("dup")) pilha.dup();
	            if(temp.equals("swap")) pilha.swap();
	            if(temp.equals("sin")) pilha.sin();
	            if(temp.equals("cos")) pilha.cos();
	            if(temp.equals("atan")) pilha.atan();
			}
			System.out.println(pilha.print());
			System.out.println(pilha.max()+"  - Tamanho máximo da pilha");
			System.out.println(pilha.cont()+"  - Tamanho atual da pilha");
			System.out.println(pilha.ultimo());
		}
}
