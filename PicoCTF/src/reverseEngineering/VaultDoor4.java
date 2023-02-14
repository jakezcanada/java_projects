package reverseEngineering;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class VaultDoor4 {

	public static void main(String[] args) {
		byte[] myBytes = {
	            106 , 85  , 53  , 116 , 95  , 52  , 95  , 98  ,
	            0x55, 0x6e, 0x43, 0x68, 0x5f, 0x30, 0x66, 0x5f,
	            0142, 0131, 0164, 063 , 0163, 0137, 070 , 060 ,
	            'f' , '8' , 'e' , '1' , 'e' , '0' , '4' , '7' ,
	    };
		String a;
		try {
			a = new String(myBytes,"UTF-8");
			System.out.println(a);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
