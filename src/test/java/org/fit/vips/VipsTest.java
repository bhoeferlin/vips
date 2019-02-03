package org.fit.vips;

import java.io.File;

import org.junit.jupiter.api.Test;

public class VipsTest {

    @Test
    public void runSimplePageSegmentation() {
		Vips vips = new Vips();

		String dirName = "evinced-output";
		File theDir = new File(dirName);
		try{
			theDir.mkdir();	
		} 
		catch(SecurityException e){
			System.err.println("Error: " + e.getMessage());
				e.printStackTrace();
				throw new RuntimeException(e);
		}        
		
		vips.enableGraphicsOutput(false);
		vips.setPredefinedDoC(8);
		vips.setOutputFileName("VIPSResult");
		vips.setOutputDirectoryName(dirName);
		vips.startSegmentation("https://developer.mozilla.org/en-US/");	
	}
}
