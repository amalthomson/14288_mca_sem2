public class rev {
	public static void main (String[] args) {
		int num=12345;
		int num1=num;
		int rev=0;
		int rem=0;
		
		System.out.println(num1);
		
		while(num>0) {
			rem = num%10;
			rev = (rev*10)+rem;
			num=num/10;
		}
		
		System.out.println("The Reverse of the Number is: " + rev);
	}
}