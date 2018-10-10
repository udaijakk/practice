package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//array --> to store similar data type values in a array variable
		
		//1.int array
		//lowest bound/index =0
		//highest bound/index= n-1
		
		//one dim array
		//disadvantages of array:
		//1.size is fixed---static array-----to overcome this problem-- we use collections(ArrayList, HashTabble)---dynamic array
		//2.stores only similar datatypes---to overcome this problem--we use object array
		
		
		int i[] = new int[4];
		    i[0]=10;
		    i[1]=20;
		    i[2]=30;
		    i[3]=40;
		    
		    System.out.println(i[0]);
		    System.out.println(i[1]);
		    //System.out.println(i[4]); //arrayindexoutofboundsexception
		    
		    System.out.println(i.length);//size/length of an array
		 
		    //print all the values of array:use for loop
		    for(int j=0; j<i.length; j++) {
		    	System.out.println(i[j]);
		    }
		    
		   //2.double array
		    double d[]=new double[3];
		    	d[0]=15.33;
		    	d[1]=23;
		    	d[2]=405.567;
		    	System.out.println(d[2]);
		    	
		   //3.char array
		    char c[]=new char[3];
		    	c[0]='w';
		    	c[1]=2;
		    	c[2]='&';
		    	System.out.println(c[2]);
		    	
		   //4.boolean array
		    boolean b[]=new boolean[2];
		    	b[0]=true;
		    	b[1]=false;
		    	System.out.println(b[1]);
		    	
		   //5.String array 	
		    String s[]=new String[3];
		    	s[0]="joey";
		    	s[1]="monica and chandler";
		    	s[2]="ross and rachel";
		    	System.out.println(s.length);
		    	System.out.println(s[1]);
		    	
		   //6.object array (object is a class---- to store different datatypes values)
		    Object ob[]=new Object[7];
		    	ob[0]="udai";
		    	ob[1]=25;
		    	ob[2]="1/1/2001";
		    	ob[3]='M';
		    	ob[4]="India";
		    	ob[5]=23.456;
		    	ob[6]=true;
		    	
		    	System.out.println(ob[2]);
		    	System.out.println(ob.length);
		    	System.out.println(ob[6]);

	}

}
