import javax.swing.JOptionPane;

public class ConverterMoedasParaReais {

	public void converterDolaresParaReais(double valorRecebido) {
		double moedaDolar = valorRecebido * 5.19;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Reais");
	}

	public void converterEurosParaReais(double valorRecebido) {
		double moedaEuro = valorRecebido * 5.53;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Reais");
	}

	public void converterLibrasParaReais(double valorRecebido) {
		double moedaLibra = valorRecebido * 6.25;
		moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Reais");
	}

	public void converterPesosArgentinosParaReais(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido * 0.026;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoArgentino + " Reais");
	}

	public void converterPesosChilenosParaReais(double valorRecebido) {
		double moedaPesoChileno = valorRecebido * 0.0064;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoChileno + " Reais");
	}
	
	public void converterIeneJaponesParaReais(double valorRecebido) {
		double moedaIeneJapones = valorRecebido * 0.038;
		moedaIeneJapones = (double) Math.round(moedaIeneJapones * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $" + moedaIeneJapones + " Reais");
		
	}

}
