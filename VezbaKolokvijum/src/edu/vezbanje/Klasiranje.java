package edu.vezbanje;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

	
public class Klasiranje {
	public static int [] upis(){
		int visina []=new int [7];
		Scanner s=new Scanner(System.in);
		for (int i=0; i< visina.length;i++){
			visina[i]=s.nextInt();
			if(visina[i]<253){
				System.out.println(visina [i]);
				
			}else{
				System.out.println("Uneli ste neodgovarajucu visinu");
			}
		}
		return visina;		
	}	

	public static int [] sortiraj(){
		int visina [] =new int[7];
		for(int i=1;i<visina.length;i++){
			for(int j=i-1;j>=0;j--){
				if(visina[j]>visina[j+1]){
					int b=visina [j];
					visina[j]=visina[j+1];
					b=visina[j+1];
				}
			}
		}
		for(int i=0;i<visina.length;i++){
			System.out.println(visina[i]);
		}
		return visina;	
	}
	
	

	
	public static void main (String[] args){
	
		
	    
      
       
      
	
	}
}
