class GastosFesta {
	public static void main(String[] args) {
		// Natsumi pagou 50 no salão
		// Eu paguei 7.98 de chocolate pra Natsumi

		double docinhos = 10.97;
		double bebidas = 5.46 * 2 + 4.69 * 3 + 34.53 - 5.69;
		double alcolicas = 85.48 + 31.89 - 2* 3.99;
		double pizzas = 44 * 10;
		double salao = 50;

		int beberam = 21;
		int num_pessoas = 26;

		double valor_nao_beberam = (docinhos + bebidas + pizzas + salao) / num_pessoas;
		double valor_beberam = valor_nao_beberam + alcolicas / beberam;

		System.out.println("Quem bebeu deve pagar R$" + String.format("%.2f", valor_beberam) + ".");
		System.out.println("Quem não bebeu deve pagar R$" + String.format("%.2f", valor_nao_beberam) + ".");
		System.out.println("Total esperado: R$" + (docinhos + bebidas + alcolicas + pizzas + salao) + ".");
		System.out.println("Total obtido: R$" + (valor_beberam * beberam + valor_nao_beberam * (num_pessoas - beberam)));
	}
}
