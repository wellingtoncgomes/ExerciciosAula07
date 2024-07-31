package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copiadora {
	
	public void copiar(String arquivoOrigem,String arquivoCopia) {
		try (FileInputStream fis = new FileInputStream(arquivoOrigem);
             FileOutputStream fos = new FileOutputStream(arquivoCopia)) {

            byte[] buffer = new byte[1024];
            int bytesLidos;
            while ((bytesLidos = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesLidos);
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}