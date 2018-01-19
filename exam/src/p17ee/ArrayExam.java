package p17ee;

import java.util.ArrayList;

public class ArrayExam {
	
		private ArrayList list;
	    ArrayExam(){
	    	list= new ArrayList();
		    }
	    public ArrayList getArrayList(int a, int b) {
	        return list;
	    }
	   
	
	    public static void main(String[] args) {
	    	ArrayExam ae = new ArrayExam();
	    	ArrayList al =new ArrayList() ;
	       for(int i=0;i<10;i++){
	    	   al.add(i);
	    	  ;
	       }
	       System.out.println(al);
	    }
	}


