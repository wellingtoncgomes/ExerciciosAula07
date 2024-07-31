package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {
	 public void lerEImprimir(String nomeDoArquivo) {
			try (BufferedReader reader = new BufferedReader(new FileReader(nomeDoArquivo))) {
	            String linha;
	            while ((linha = reader.readLine()) != null) {
	                System.out.println(linha);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}