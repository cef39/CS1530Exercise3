public class Exercise3{
	public static void main(String [] args)
	{
		int n = 0;

		if (args.length != 1){
			System.out.println("Please enter one integer argument.");
			System.exit(1);
		}

		try{
			n = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException nfe){
			System.out.println("Please enter an interger");
			System.exit(1);
		}

		int tri = Tri(n);
		int lazy = Lazy(n);

		System.out.println("Tri(n) = " + tri);
		System.out.println("Lazy(n) = " + lazy);

	}

	public static int Lazy(int n){
		return (n*n + n + 2)/2;
	}

	public static int Tri(int n){
		int result = 0;

		for (int i = 1; i <= n; i++)
			result += i;

		return result;
	}
}