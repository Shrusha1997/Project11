package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Run4 
// to write the file
{

	public static void main(String[] args) throws IOException 
	{
	File f = new File("D:\\File handling\\A.text");
	FileWriter Wr = new  FileWriter(f);
	BufferedWriter bw = new BufferedWriter(Wr);
	bw.write("ABCD");
	bw.flush();// to send into file and rewrites

	}

}
