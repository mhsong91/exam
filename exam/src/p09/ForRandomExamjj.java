package p09;

import java.util.Random;

public class ForRandomExamjj {
	int[][] table;
	int oneLength;
	int twoLength;
	int checkNum;
	int numMax;
	
	int[] line;
	
	
	public ForRandomExamjj(int oneLength, int twoLength, int numMax) {		
		table = new int[oneLength][twoLength];
		this.oneLength = oneLength;		
		this.twoLength = twoLength;
		this.numMax = numMax;
		
	}
	
	
	void castLot() {
		Random r = new Random();
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table[i].length; j++) {
				checkNum = r.nextInt(numMax) + 1 ;
				if(isDupl()) {
					j--;					
				}else {					
					table[i][j] = checkNum;
				}
			}			
		}		
	}
	
	
	boolean isDupl() {
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table[i].length; j++) {
				if(checkNum == table[i][j]) {
					return true;					
				}				
			}			
		}return false;		
	}

	
	

	void changing() {
		line = new int[oneLength * twoLength];
		int cnt = 0;
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table[i].length; j++) {				
				line[cnt] = table[i][j];
				cnt++;				
			}
		}
	}
		
	void makeLineUp() {
		int temp = 0;
		for(int i=0; i<line.length-1; i++) {
			for(int j=i+1; j<line.length; j++) {
				if(line[i] < line[j]) {
					temp = line[i];
					line[i] = line[j];
					line[j] = temp;					
				}				
			}
		}		
	}
	
	void reChanging() {		
		int cnt = oneLength*twoLength -1 ;
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table[i].length; j++) {				
				table[i][j] = line[cnt]; 
				cnt--;				
			}
		}
	}
	
	
	void print() {
		
		
		for(int i=0; i<table.length; i++) {
			for(int j=0; j<table[i].length; j++) {
				System.out.print("["+ i + "][" + j + "]" + "=" + table[i][j] + "  ");				
			}System.out.println("");			
			
			
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ForRandomExamjj fre = new ForRandomExamjj(3, 3, 20);
		fre.castLot();
		fre.changing();
		fre.makeLineUp();
		fre.reChanging();
		fre.print();
		
		
		
		
		
		
	}

}
