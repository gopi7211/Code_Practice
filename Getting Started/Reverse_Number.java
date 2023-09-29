public class Main {
	public static void main(String[] args) {
		int num = 1234;
		int revers =0;
		while(num!=0){
		    
		    int remaind = num % 10;
		    revers = revers*10+remaind;
		    num = num/10;
		    
		    }
		System.out.println(revers);
	}
}