package bing.pfor;

import java.io.*;

public class Star1 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n;
	
	Star1(){
		try {
			n = Integer.parseInt(br.readLine());
			String s = "*";
			for(int i =1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(s);
				}System.out.println("");
			}
		} catch (IOException ie) {
			System.out.println(ie);
		}
	}
	public static void main(String[] args) {
		new Star1();
	}
}
