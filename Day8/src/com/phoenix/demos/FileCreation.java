package com.phoenix.demos;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fout=null;
		BufferedOutputStream bout=null;
		ObjectOutputStream oout=null;
		Account act=new Account(1,"Chetan",10000);
		try {
			String data="To be inserted into the file";
			
			fout=new FileOutputStream("textfile");
			bout=new BufferedOutputStream(fout);
			oout=new ObjectOutputStream(bout);
			oout.writeObject(act);
			
			/*dout=new DataOutputStream(bout);
			dout.write(65);*/
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				oout.close();
				bout.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
