import javax.swing.JOptionPane;

public class Funcoes{
	public static void main(String[] args) {
		// calcular gasto com banho do Biel

		
		taxa(Integer.parseInt(JOptionPane.showInputDialog("Loja 1: ")),
				Integer.parseInt(JOptionPane.showInputDialog("Loja 2: ")));

	}

	static void taxa(double a, double b) {
		if (a < b) {
			double num = (a / 100) * 10;
			System.out.println("Escolher a Loja1, valor total com desconto é R$ " + (a+num));
		} else if (b < a) {
			double num2 = (b / 20) * 10;
			System.out.println("Escolher a Loja2, valor total com desconto é R$ " +  (b + num2));
		} else {
			System.out.println("Escolher a mais próxima de casa!");
		}
	
	}

}
