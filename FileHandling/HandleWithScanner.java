import java.io.File;
import java.util.Scanner;

public class HandleWithScanner {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		System.out.print("File: ");
		String name = in.nextLine();
		File file = new File(name);
		try {
			if(file.createNewFile()) {
				System.out.println("File created");
			} else {
				System.out.println("File already exists... try another name or extention");
			}
		} catch (Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}

