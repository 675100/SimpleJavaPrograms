package simpleJavaProject;

import java.io.File;

public class ListofFilesandDirectories {
public static void main(String[] args) {
	File path = new File("F:\\C Drive\\IDM 6.27 Build 2\\IDM 6.27 Build 2\\");
	File[] files = path.listFiles();
	for(int i=0;i<files.length;i++)
	{
		if(files[i].isFile())
		{
			System.out.println(files[i] + ":  is a file");
		}
		else if(files[i].isDirectory())
		{
			System.out.println(files[i] + ":  is a Directory");
		}
	}
}
}
