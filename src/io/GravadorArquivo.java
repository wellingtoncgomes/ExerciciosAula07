package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravadorArquivo {
	
	  public void gravar(String nomeDoArquivo,String[] arrayDeStrings) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeDoArquivo))) {
	            for (String linha : arrayDeStrings) {
	                writer.write(linha);
	                writer.newLine();
	            }

	            System.out.println("Array gravado no arquivo com sucesso!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
