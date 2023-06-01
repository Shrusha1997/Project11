package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// to read the file
public class Run1 {

	public static void main(String[] args) throws IOException 
	{
	File f = new File ("D:\\File handling\\Aa.text");
   FileReader fr=new FileReader(f);// read file from java to D drive
   BufferedReader br=new BufferedReader(fr);//from D drive to java(file)
	System.out.println(br.readLine());
	}
}
