package atm;
import java.io.*;
import java.lang.*;
import java.util.*;

public class WriteFile 
{	
	private Formatter x;


public void openFile()
{
	try{
		x=new Formatter("atm.txt");
	}
	catch(Exception e)
	{
		System.out.println("you have an error");
	}
}
public void addRecords(String name,int id,int balance,int password)
{
	x.format("%s \n%d %d %d \n", name,id,balance,password);
	
 
	
}
public void closefile()
{
	x.close();
}




}