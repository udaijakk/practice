package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x="200";
		System.out.println(x+50);
		
		//string to int
		int i=Integer.parseInt(x);
		System.out.println(i+50);
		
		
		//string to double
		String y="156.78";
		double d=Double.parseDouble(y);
		System.out.println(d+100);
		
		//string to boolean
		String z="true";
		boolean b=Boolean.parseBoolean(z);
		System.out.println(b);
		
		
		//int to string conversion
		int j=700;
		System.out.println(j+20);
		
		String s=String.valueOf(j);//200
		System.out.println(s+20);
		
		String u="100a";
		Integer.parseInt(u);//NumberFormatException

	}

}
