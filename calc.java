public class calc {

	public static void main(String[] arg) {
		System.out.println("calc...");
		double first = Integer.valueOf(arg[0]);
		double second = Integer.valueOf(arg[1]);
		
		double sum = first + second;
		System.out.println("sum "+ sum);
		
		double sub = first - second;
		System.out.println("sub "+ sub);
		
		double mult = first * second;
		System.out.println("mult "+ mult);
		
		double div = first / second;
		System.out.println("div "+ div);
		
	}

}