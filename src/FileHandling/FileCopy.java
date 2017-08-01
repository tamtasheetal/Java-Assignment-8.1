package FileHandling;
 //This java file is inside package named package1 inside src folder.
import java.io.*;    
//importing all classes from java's io library.. Because it has File related Classes needed for this Assignment.


public class FileCopy
{
	public static void main(String[] args) throws Exception  
//main function declaration. and because it is static, program execution starts from main function. 
	{
		
		FileInputStream readSrcFile = new FileInputStream("C:\Users\user\vinay\guitar.txt");
		

		FileOutputStream writeSrcFile = new FileOutputStream("C:\\Users\\user\\sheetal\\DestiFile.txt");
		
		byte[] readerArray = new byte[1024];     
//byte array to read from the file.
		int len;    
		
		while((len=readSrcFile.read(readerArray))>0)
		{
			writeSrcFile.write(readerArray, 0, len);  
		}
		
		readSrcFile.close();
		writeSrcFile.close();
		
		System.out.println("File has created.\n\n");    
		System.out.println("Description of a Guitar....\n\n");   
		

		BufferedReader readDestnFile = new BufferedReader(new FileReader("C:\\Users\\user\\sheetal\\DestiFile.txt"));
		//Creating the object of BufferedReader and passed the path of File by FileReader.
		
		String lineReader;             
		//String reference to read the line from the file.
		
		
		while((lineReader = readDestnFile.readLine()) != null)
			//While loop to read from the file and printing on the console.
		{
			System.out.println(lineReader);   
		}
		
		
		readDestnFile.close();
		
	}     
}    
