package teddyonlinejudge;

import java.io.*;    
import java.util.Scanner;    
    
class Main {    
    public static void main(String[] args) throws IOException{    
    
        Scanner sc=new Scanner(new FileReader("data.in"));   
        PrintWriter pw=new PrintWriter("data.out");  
  
    while( sc.hasNextInt() )  
            pw.println( sc.nextInt()+sc.nextInt() );  
  
        pw.close();   
    }    
}  