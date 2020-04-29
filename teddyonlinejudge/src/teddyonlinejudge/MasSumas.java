package teddyonlinejudge;

import java.io.*;
import java.util.Scanner;    
class MasSumas {  
	public static int suma(int a, int b, int c) {
		return a+b+c;
	}
    public static void main(String[] args) throws IOException{    
    
        Scanner sc=new Scanner(new FileReader("data.in"));   
        PrintWriter pw=new PrintWriter("data.out");  
        sc.nextInt();
    while( sc.hasNextInt() ) {
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	pw.println(suma(a, b, c));
    }  
    pw.close();   
    }   
}  
