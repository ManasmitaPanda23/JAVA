package file;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadByte {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("");
		int x = 0;
		while ((x = fis.read()) != -1) {
			System.out.println((char) x);

		}
	}
}
