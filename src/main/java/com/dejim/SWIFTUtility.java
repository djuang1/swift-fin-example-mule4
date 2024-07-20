package com.dejim;

import com.prowidesoftware.swift.io.parser.SwiftParser;
import com.prowidesoftware.swift.model.SwiftMessage;
import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.model.field.Field20;
import com.prowidesoftware.swift.model.field.Field61;
import com.prowidesoftware.swift.model.mt.AbstractMT;
import com.prowidesoftware.swift.model.mt.mt7xx.MT760;
import com.prowidesoftware.swift.model.mt.mt7xx.MT798;
import com.prowidesoftware.swift.model.mt.mt9xx.MT940;
import com.prowidesoftware.swift.utils.Lib;

import java.io.*;

public class SWIFTUtility {

	public SWIFTUtility() {

	}
	
	public static String SWIFTtoJSON(InputStream fin) throws IOException {
		
		SwiftParser parser = new SwiftParser(Lib.readStream(fin));
		SwiftMessage mt = parser.message();
		
        System.out.println("Sender: " + mt.getSender());
        System.out.println("Receiver: " + mt.getReceiver());
        System.out.println("Type: " + mt.getType());
        
		return mt.toJson();
    }
	
	public static void main(String[] args) throws IOException {

		String filePath = "/Users/djuang/Workspaces/seven-eighteen/swift-fin-example-mule4/src/main/resources/processed/MT537_test.fin";
				
		try (FileInputStream fis = new FileInputStream(new File(filePath))) {
						
			SwiftParser parser = new SwiftParser(Lib.readStream(fis));
			SwiftMessage mt = parser.message();
			
	        System.out.println("Sender: " + mt.getSender());
	        System.out.println("Receiver: " + mt.getReceiver());
	        System.out.println("Type: " + mt.getType());
			
			//System.out.println(mt.toJson());
	        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
