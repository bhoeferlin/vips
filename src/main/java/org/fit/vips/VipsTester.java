/*
 * Tomas Popela, 2012
 * VIPS - Visual Internet Page Segmentation
 * Module - VipsTester.java
 */

package org.fit.vips;

import java.io.File;
import java.net.URL;

/**
 * VIPS API example application.
 * 
 * @author Tomas Popela
 *
 */
public class VipsTester {

	/**
	 * Main function
	 * @param args Internet address of web page.
	 */
	public static void main(String args[])
	{
		// we've just one argument - web address of page
		if (args.length != 1)
		{
			System.err.println("We've just only one argument - web address of page!");
			System.exit(0);
		}

		
		try
		{
			URL url = new URL(args[0]);
			Vips vips = new Vips();

			String dirName = "evinced-output-" + url.getHost().toString();
			File theDir = new File(dirName);
			try {
				theDir.mkdir();
			} catch (SecurityException e) {
				System.err.println("Error: " + e.getMessage());
				e.printStackTrace();
				throw new RuntimeException(e);
			}

			// disable graphics output
			vips.enableGraphicsOutput(false);
			// set permitted degree of coherence
			vips.setPredefinedDoC(8);
			
			vips.setOutputFileName("VIPSResult");
			vips.setOutputDirectoryName(dirName);

			// start segmentation on page
			vips.startSegmentation(url.toString());
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
