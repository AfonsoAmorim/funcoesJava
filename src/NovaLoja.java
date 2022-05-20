
public class NovaLoja extends Loja{
	public static void main(String[] args) {
		Loja lojaA = new Loja();
		lojaA.setName("Loja da Maria");
		lojaA.setContato(1195155225);
		
		
		
		System.out.println("Nome da Loja --> " + lojaA.getName());
		System.out.println("Contato --> " + lojaA.getContato());
		
	}
}
