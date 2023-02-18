package br.si.design.facade.financeiro;

public class FinanciamentoUnifacisa {

	// private static final int VALOR_MAXIMO_PAGAMENTO_PAGSEGURO = 10000;

	public static void main(String[] args) {
		
		double valorMensalidade = 1200;
		
		PagamentosFacade.fazerPagamentoCc(31231313, "Abella", valorMensalidade);
		PagamentosFacade.fazerPagamentoCd(11111111, "Raphael", valorMensalidade);
		PagamentosFacade.fazerPagamentoPix("raphael@gmail.com", valorMensalidade);
		
		/*
		 * 
		 * if(valorMensalidade >= VALOR_MAXIMO_PAGAMENTO_PAGSEGURO) { Paypal payPalLib =
		 * new Paypal(); payPalLib.processCreditCard(1231232, "Abella",
		 * valorMensalidade);
		 * 
		 * } else { PagSeguro pagSeguroBiblioteca = new PagSeguro();
		 * pagSeguroBiblioteca.processarCompraCredito(1231312, "Abella",
		 * valorMensalidade); }
		 */
	}

}
