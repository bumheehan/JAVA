package bing.pfor;

import java.io.*;

public class Star2 {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	int n;
	
	Star2(){
		try {
			n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				String star ="";
				for(int k=n-i-1 ; k>0;k--) {
					star+=" ";
				}
				for(int j=0;j<=i;j++) {
					star+="*";
				}
				System.out.println(star);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	public static void main(String ars[]) {
		new Star2();
	}
}
