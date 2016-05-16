package quase;

import java.util.Scanner;
import java.io.*;

public class App2 {
	public static void main (String args[])throws IOException{
		Scanner in = new Scanner(new File("C:\\Users\\Utilizador\\git\\trabalho_2_alg\\src\\expressoes.txt"));
		Pilha2 pilha = new Pilha2();
		
		while(in.hasNext()){
			String valor = in.next();
			String[] lista = valor.split(" ");
			pilha.calcula2(lista);
			   
		
		}
		}
}
