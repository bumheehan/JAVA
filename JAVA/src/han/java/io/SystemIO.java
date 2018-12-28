package han.java.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemIO {
	
	void Test1() {
		InputStream is = System.in;
		try {
			int read = is.read();
			System.out.println(read); 
			System.out.println((char)read);  //한글못읽음 /ASCII
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void Test2() {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		try {
			int read = isr.read();
			System.out.println(read); 
			System.out.println((char)read); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void Test3() {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		while(true) {
			try {
				int read = isr.read();
				System.out.println(read); 
				//System.out.println((char)read); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	void Test4() {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		while(true) {
			try {
				char[] read = new char[1];
				int count = isr.read(read,0,1); 
				System.out.println(read); 
				System.out.println(isr.read());
				System.out.println(isr.read());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemIO sio = new SystemIO();
		//sio.Test1();
		//sio.Test2();
		sio.Test3();//13,10 두개추가반환 
		//sio.Test4();
	}

}
