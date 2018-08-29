package proba.edu;

import java.util.Random;
import java.util.Scanner;

public class Obicna {
       private int visina []=new int [7];
       Random rand=new Random();
       Scanner s=new Scanner(System.in);
       
       
       public int[] getVisina() {
		return visina;
	}


	public void setVisina(int[] visina) {
		this.visina = visina;
	}


	public Random getRand() {
		return rand;
	}


	public void setRand(Random rand) {
		this.rand = rand;
	}


	public Scanner getS() {
		return s;
	}


	public void setS(Scanner s) {
		this.s = s;
	}


	public Obicna() {
		super();
	}


	public Obicna(int[] visina, Random rand, Scanner s) {
		super();
		this.visina = visina;
		this.rand = rand;
		this.s = s;
	}


	public void upis(){
    	   for(int i=0;i<visina.length;i++){
    		   if(i<253){
    		   visina[i]=s.nextInt();
    	   }else{
    		   System.out.println("Unesite odgovarajucu visinu kosarkasa");
    	   }
       }
	}
	public void sortirajRastuci(){
		for(int i=1;i<visina.length;i++){
       	 for(int j=i-1;j>=0;j--){
       		 if(visina[j]>visina[j+1]){
       		 int b=visina[j];
       		 visina[j]=visina[j+1];
       		 visina[j+1]=b;
       		 }
       		
       	 }
       	
	}
		for(int i=0;i<visina.length;i++){
			System.out.println(visina[i]);
		}
		
	}
	public void sortirajOpadajuci(){
		for(int i=1;i<visina.length;i++){
	       	 for(int j=i-1;j>=0;j--){
	       		 if(visina[j]<visina[j+1]){
	       		 int b=visina[j];
	       		 visina[j]=visina[j+1];
	       		 visina[j+1]=b;
	       		 }
	       		
	       	 }
	       	
		}
			for(int i=0;i<visina.length;i++){
				System.out.println(visina[i]);
			}
	}
	public void paran() {
		for(int i=0;i<visina.length;i++){
			if(visina[i]%2==0){
				System.out.println(visina[i]);
			}
		}
	}
}
