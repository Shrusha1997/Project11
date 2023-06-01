package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// to read more than one line
public class Run3 {

	public static void main(String[] args) throws IOException
	{
		File f = new File("D:\\File handling\\Aa.text");
		
     FileReader fr = new FileReader(f);
     BufferedReader br = new BufferedReader(fr);
     String str = "";
     while(str!=null)
     {
    	 str= br.readLine();
    	 if(str!=null)
    	 {
    		 System.out.println(str);
    	 }
     }
    
	}

}
