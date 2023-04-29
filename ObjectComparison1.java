public class ObjectComparison1 {
	public static void main(String args[]) {
		//Comparing double and long objects
		
		Double x =new Double(123.45555);
		
		Long y = new Long(983433);
		
		System.out.println("object are not equal, hence return false : " + x.equals(y));
		
		System.out.println("object are equal, hence return true : " + x.equals(x));
		
	}

}
