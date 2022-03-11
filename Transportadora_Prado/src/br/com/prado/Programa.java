package br.com.prado;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import br.com.prado.Carro;
import br.com.prado.Caminhão;


public class Programa {
	public static void main(String[] args) throws Exception {
		TestarArrayList();		
	}
	public static void TestarArrayList() throws FileNotFoundException {
    	System.out.println("######### Projeto Transportadora ############");
    	System.out.println();
    	
  Carro carro0 = new Carro (10, 2, 22, 4);
  
    	ArrayList lista = new ArrayList();
    	Scanner scanner = new Scanner(new File("Note.csv"));
    	
    	while(scanner.hasNext()) {
    		String linha = scanner.nextLine();
    		String[] valores = linha.split(","); 
    		
    		System.out.println(linha);
    	}
    	scanner.close();
    	
    	System.out.println();
    	System.out.println("Leitura dos dados armazenados");
    	
    	
    }

}