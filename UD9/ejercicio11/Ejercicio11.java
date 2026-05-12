package ejercicio11;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio11 {

	public static void main(String[] args) {
		try {
		File file = new File("record.text");
		RandomAccessFile record = new RandomAccessFile(file, "rw");
		
		record.writeBytes("Nivel:001");
		
		
		record.seek(6);
		record.writeBytes("005");
		
		//Volvemos al principio para leer el resultado
		record.seek(0);
		System.out.println("Resultado: " + record.readLine());
		record.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}

}
}
