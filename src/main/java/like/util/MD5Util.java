package like.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

	public static String Md5Encrypt(String key)
	{
		
		String mdKey="";
		
		try {
			   MessageDigest md = MessageDigest.getInstance("MD5");
			   
			   md.update(key.getBytes());
			   
			   byte b[] = md.digest();
			   
			   int i;
			   
			   StringBuffer buf = new StringBuffer("");
			   
			   for (int offset = 0; offset < b.length; offset++) {
				    i = b[offset];
				    if (i < 0)i += 256;
				    if (i < 16)buf.append("0");
				    buf.append(Integer.toHexString(i));
			   }
			   mdKey = buf.toString();
			  } 
		catch (NoSuchAlgorithmException e) {
			   e.printStackTrace();
			  }
		
		return mdKey;
	}
	
	
	
}
