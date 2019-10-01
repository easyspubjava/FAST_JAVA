package stream.wirter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("writer.txt");
		fw.write('A');
		char[] buf = {'B', 'C', 'D', 'E', 'F'};
		
		fw.write(buf);
		fw.write("æ»≥Á«œººø‰");
		fw.write(buf, 2, 2);
		fw.close();
		
		System.out.println("end");
		
	}

}
