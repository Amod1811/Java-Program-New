import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileProgram {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\Dell\\Desktop\\read.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNext()) {
				String data = sc.nextLine();
				System.out.println(data);
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
