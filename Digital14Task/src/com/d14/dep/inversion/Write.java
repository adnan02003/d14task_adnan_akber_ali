package com.d14.dep.inversion;

import com.d14.interfaces.Writer;

//this class created to achieve dependency inversion
public class Write {

	private Writer writer;

	public void setWriter(Writer writer) {
		this.writer = writer;
	}
	
	public void writeToWriter(String text) {
		this.writer.write(text);
	}
	
}
