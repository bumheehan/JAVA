package bing.pfor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int a;
	int r;
	
	Multiple(){
		try {
			a = Integer.parseInt(br.readLine());
			for(int i=1;i<10;i++) {
				r = a * i;
				System.out.println(a +" * "+i+" = "+r);
			}
		}catch(IOException ie) {
			System.out.println("ie : "+ie);
		}
		
	}
	public static void main(String[] args) {
		new Multiple();
	}
}
