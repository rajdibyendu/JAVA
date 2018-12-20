import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWriteFile {
	static BufferedReader reader;
	static String line;


	public static void main(String[] args){
		File f = new File("‪C:\\Users\\lenovo\\Desktop\\jira.txt");
		String old = "";
		try {
			reader = new BufferedReader(new FileReader(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		try {
			line = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(line);
				
	}
}
