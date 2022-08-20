package com.d14.impl;

import com.d14.interfaces.Writer;

public class StringWriter implements Writer  {


	private StringWriter stringWriter;
	
	@Override
	public void write(String text) {
		System.out.println(text);
	}


}
