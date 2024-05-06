import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOperation{

public void createFile(){
	try{
			File f1 = new File("filedemo.txt");
			if(f1.createNewFile()){
				System.out.println("file created");
				//ReadFile();
			}
			else{
				System.out.println("File is already exist");
				System.out.println("file containt follows");
				ReadFile();
			}
		}
		catch(Exception e){
			System.out.println("error");
			//e.printStackTrace();
		}
	
}

public void ReadFile(){
	try{
		File f1 = new File("filedemo.txt"); 
		Scanner scan = new Scanner(f1);
		while(scan.hasNextLine()){
			String data = scan.nextLine();
			System.out.println(data);
		}
			
	}
	catch(FileNotFoundException e){
		System.out.println("error");
	}
}


public void WriteFile(){
	try{
	
		FileWriter fw = new FileWriter("filedemo.txt");
		fw.write("this is the text");
		fw.close();
		System.out.println("Write sucessfully");
	}
	catch(IOException e){
		System.out.println("error");
	}
}


	public static void main(String args[]){
	
		FileOperation file1 = new FileOperation();
		file1.createFile();
		
		System.out.println("1) create file");
		System.out.println("2) Read file");
		System.out.println("3) write file");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num){
		
			case 1:file1.createFile();
			break;
			
			case 2: file1.ReadFile();
			break;
			
			case 3:file1.WriteFile();
			break;
			
			default :
				System.out.println("invalid chooise");
		
		}
		
	}
}
