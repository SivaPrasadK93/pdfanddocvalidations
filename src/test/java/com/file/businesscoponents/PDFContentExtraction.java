package com.file.businesscoponents;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFContentExtraction {
	
	public static void main (String args[]) throws IOException{
	
	URL url = new URL("FILEPATH");
	
	//Launch the PATH of the PDF on the browser
	//driver.get(FILE PATH URL);
	
	InputStream is = url.openStream();
	
	BufferedInputStream fileParse = new BufferedInputStream(is);
	
	//PDDocument doc = PDDocument.load(fileParse);
	
	//String pdfContent = new PDFTextStripper().getText(doc);
	
		
		
	}
}
