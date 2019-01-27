package Playsmartbabe;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import org.etsi.uri.x01903.v13.impl.GenericTimeStampTypeImpl;

public class base64encodeco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s="encodedeco";
		
		Base64.Encoder encoder= Base64.getMimeEncoder();
		 Decoder decoder= Base64.getMimeDecoder();
		 
		 
		 
		 String estr=encoder.encodeToString(s.getBytes());
		 System.out.println("the encoder is"+estr);
		 
		 
		 
		String dstr=new String(decoder.decode(estr));
		
		System.out.println("the decoder string is "+dstr);
		 
		 
		
	}

}
