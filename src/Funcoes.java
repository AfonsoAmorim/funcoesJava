import javax.swing.JOptionPane;

public class Funcoes {
	public static void main(String[] args) {
		// calcular gasto com banho do Biel

		taxa(Integer.parseInt(JOptionPane.showInputDialog("Loja 1: ")),
				Integer.parseInt(JOptionPane.showInputDialog("Loja 2: ")));

	}

	static void taxa(double a, double b) {
		if (a < b) {
			System.out.printf("Escolher a Loja1, valor do desconto é R$ " + (a / 100) * 10);
		} else if (b < a) {
			System.out.printf("Escolher a Loja2, valor do desconto é R$ " + (b / 20) * 10);
		} else {
			System.out.println("Escolher a mais próxima de casa!");
		}
		System.out.println();
	}

}
