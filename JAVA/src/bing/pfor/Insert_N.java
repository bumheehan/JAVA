package bing.pfor;
import java.io.*;
public class Insert_N {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	int num;
	
	Insert_N(){
		try {
			num = Integer.parseInt(br.readLine());
			
			for(int i=num;i>0;i--) {
				System.out.println(i);
			}
		}catch(IOException ie) {
			System.out.println("ie : "+ ie);
		}
		
	}
	public static void main(String[] args) {
		new Insert_N();

	}

}
