package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x[][]= new String[3][6];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		
			   x[0][0]="Ross";
			   x[0][1]="chandler";
			   x[0][2]="joey";
			   x[0][3]="Rachel";
			   x[0][4]="Monica";
			   x[0][5]="pheobe";
			   
			   x[1][0]="Ross111";
			   x[1][1]="chandler111";
			   x[01][2]="joey111";
			   x[01][3]="Rachel111";
			   x[01][4]="Monica111";
			   x[01][5]="pheobe111";
			   
			   x[02][0]="Ross222";
			   x[02][1]="chandler222";
			   x[02][2]="joey222";
			   x[02][3]="Rachel222";
			   x[02][4]="Monica222";
			   x[02][5]="pheobe222";
			   
			   System.out.println(x[0][5]);
			   System.out.println(x[01][2]);
			   System.out.println(x[02][3]);
			   
			   
			  // to print all the values of 2d array : use 2 for loops
			   
			   for(int row=0; row<x.length; row++) {
				   for(int col=0; col<x[0].length; col++) {
					   System.out.println(x[row][col]);
			   }
			   }

	}

}
