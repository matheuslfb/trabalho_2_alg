import java.util.Scanner;
import java.io.*;

public class App {
	public static void main (String args[])throws IOException{
		Scanner in = new Scanner(new File("src\\expressoes.txt"));
		Pilha pilha = new Pilha();
		
			while(in.hasNext()){
				String simbolo = in.nextLine();
				String[] lista = simbolo.split(" ");
				
				pilha.calcula(lista);
				
			}
			
		
			
		}
}
