package com.d14.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import com.d14.interfaces.Writer;

public class FileWriter implements Writer  {

	@Override
	public void write(String text) {
		try {
		      File myObj = new File("myfile.dat");
		      myObj.createNewFile();
		      BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(myObj,true));
		      writer.write(text+"\n");
		      writer.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}

}
