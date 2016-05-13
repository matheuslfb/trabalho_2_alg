import java.util.Scanner;
import java.io.*;

public class App {
	public static void main (String args[])throws IOException{
		Scanner in = new Scanner(new File("H:\\git\\trabalho_2_alg\\src\\x1"));
		Pilha pilha = new Pilha();
		
			while(in.hasNext()){
				String simbolo = in.next();
				String[] lista = simbolo.split(" ");
				for(String a : lista){
					pilha.push(a);
				}
				if(simbolo.matches("[0-9]+()")) pilha.push( simbolo );
				if(simbolo.equals("+")) pilha.soma();
	            if(simbolo.equals("*")) pilha.multiplicacao();
	            if(simbolo.equals("-")) pilha.subtracao();
	            if(simbolo.equals("/")) pilha.divisao();
			}
			pilha.printR();
		
			/*while ( in.hasNext() ) {
	            String temp = in.next();
	            temp.split(" ");
	            if ( temp.equals( "quit" ) ) System.exit(0);
	            if ( temp.matches( "[0-9]+" ) ) pilha.push( Integer.parseInt( temp ) );
	            if(temp.equals("+")) pilha.soma();
	            if(temp.equals("*")) pilha.mult();
	            if(temp.equals("-")) pilha.menos();
	            if(temp.equals("/")) pilha.div();
	            if(temp.equals("pop")) pilha.pop();
	            
			}
			System.out.println(pilha.print());
			System.out.println(pilha.max()+"  - Tamanho máximo da pilha");
			System.out.println(pilha.cont()+"  - Tamanho atual da pilha");
			System.out.println(pilha.ultimo());*/
		}
}
