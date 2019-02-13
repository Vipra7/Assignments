public class Q3{
	private static Integer i = null;	
	public static void main(String[] args) {
		
		try {
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.out.println("Caught NullPointerException");
			System.out.println(e);
		} 
		try {
			i = 10;
			System.out.println(i.toString());
		} catch(NullPointerException e) {
			System.out.println("Caught NullPointerException");
			System.out.println(e);
		} finally {
			System.out.println("Got through it");
		}
	}	
}