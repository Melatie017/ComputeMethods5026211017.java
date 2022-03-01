import javax.swing.JOptionPane;

public class TestClass5026211017{
public static void main(String[] Args){
	double degreesF;
	int a;
	int b;
	int dice1;
	int dice2;
	
	ComputeMethods5026211017 jalankan = new ComputeMethods5026211017();
	
	degreesF = Double.parseDouble(JOptionPane.showInputDialog("Tuliskan suhu dalam satuan Fahrenheit! (Contoh:45)"));

	a = Integer.parseInt(JOptionPane.showInputDialog("Tuliskan panjang tinggi segitiga dalam satuan cm! (Contoh:6)"));
	b = Integer.parseInt(JOptionPane.showInputDialog("Tuliskan panjang alas segitiga dalam satuan cm! (Contoh:8)"));

	double suhuF = jalankan.fToC(degreesF);
	double simir = jalankan.hypotenuse (a, b);
	dice1 = jalankan.roll();
	dice2 = jalankan.roll();
	int totaldice = dice1 + dice2;

	JOptionPane.showMessageDialog(null, "Temp in celsius is " + suhuF + "\nHypotenuse is " + simir + "\nThe sum of the dice values is " + totaldice);
		
	}
}
