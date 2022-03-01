import java.util.Random;

public class ComputeMethods5026211017{

	//temperature
	public static double fToC(double degreesF){
		double suhuF = (degreesF-32)*5/9;
		return suhuF;
}

	//hypotenuse
	public static double hypotenuse(int a, int b){
		return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
}

	//roll dice
	public static int roll(){
	 	Random dice = new Random();
		int radice = dice.nextInt(6)+1;
		return radice;

	}
}
