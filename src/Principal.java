import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Funcao moedas = new Funcao();
		FuncaoTemperatura temperatura = new FuncaoTemperatura();

		while (true) {

			String opcao = JOptionPane
					.showInputDialog(null, "Escolha uma conversão: ", "Menu", JOptionPane.PLAIN_MESSAGE, null,
							new Object[] { "Conversor de Moeda", "Conversor de Temperatura" }, "Escolha")
					.toString();

			switch (opcao) {
			case "Conversor de Moeda":
				String input = JOptionPane.showInputDialog("Insira um valor");
				if (ConferirValor(input)) {
					double valorRecebido = Double.parseDouble(input);
					moedas.converterMoeda(valorRecebido);

					int resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer outra conversão?");
					if (JOptionPane.OK_OPTION == resposta) {
						System.out.println("Escolha opção Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						System.exit(0);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Insira um valor de temperatura: ");

				if (ConferirValor(input)) {
					double valorRecebido = Double.parseDouble(input);
					temperatura.converterTemperatura(valorRecebido);
					int resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer outra conversão?");
					if (JOptionPane.OK_OPTION == resposta) {
						System.out.println("Escolha opção Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						System.exit(0);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			}
		}
	}

	// Checar se o valor digitado é maior que 0 e menor que 0
	public static boolean ConferirValor(String input) {
		try {
			double valor = Double.parseDouble(input);
			if (valor >= 0 || valor < 0)
				;

			return true;
		} catch (NumberFormatException e) {
			System.out.println("Erro:" + e.getMessage());
			return false;
		}
	}
}
