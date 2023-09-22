public class Main {
	public static void main(String[] args) {
	   int a = 10;
	   int b = 2;
	   
	   System.out.println("Before swapping a b is  " + a +" " +b);
	   a= a+b;
	   b= a-b;
	   a=a-b;
	   
	   System.out.println("after swapa " + a +" "+ b);
     
	}
}

//x = x + y
//STEP 5: y= x - y
//STEP 6: x =x - y