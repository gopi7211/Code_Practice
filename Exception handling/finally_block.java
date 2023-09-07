public class Main {
	public static void main(String[] args) {
		int results = 100;
		
		try{
		    System.out.println(results/0);
		    }
		    catch(ArithmeticException e){
		        System.out.println(e);
		          }
		      finally {
		       System.out.println("Finally block always execute");
		         }
	}
}