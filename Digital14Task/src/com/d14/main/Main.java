package com.d14.main;

import com.d14.dep.inversion.Write;
import com.d14.impl.FileWriter;
import com.d14.impl.StringWriter;
import com.d14.interfaces.Writer;
import com.d14.util.Util;

public class Main {

	public static void main(String[] args) {

		
		String text = "This is really really stupid!!!";
		
		//this class created to achieve dependency inversion
		Write write = new Write();
		
		//dependency injection of StringWriter class through setter
		write.setWriter(new StringWriter());
		
		//converted string to upper case
		write.writeToWriter(Util.convertUpperCase(text));
		
		//converted string to lower case
		write.writeToWriter(Util.convertLowerCase(text));
		
		//combined the operations of duplicate remover, stupid remover
		//replaces the word stupid with s*****!!! and consecutive duplicated words removed
		write.writeToWriter(Util.duplicateRemover(Util.stupidRemover(text)));
		
		
		
		//dependency injection of FileWriter class through setter
		write.setWriter(new FileWriter());
		
		
		//converted string to upper case
		write.writeToWriter(Util.convertUpperCase(text));
		
		//converted string to lower case
		write.writeToWriter(Util.convertLowerCase(text));
		
		//combined the operations of duplicate remover, stupid remover
		//replaces the word stupid with s*****!!! and consecutive duplicated words removed
		write.writeToWriter(Util.duplicateRemover(Util.stupidRemover(text)));
		

	}

}
