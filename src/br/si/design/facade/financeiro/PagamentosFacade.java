package br.si.design.facade.financeiro;

import br.si.design.facade.pagseguro.PagSeguro;
import br.si.design.facade.paypal.Paypal;

public class PagamentosFacade {

	private static final int VALOR_MAXIMO_PAGAMENTO_PAGSEGURO = 10000;

	public static void fazerPagamentoCc(long numeroCartao, String titular, double valorCompra) {

		if (valorCompra >= VALOR_MAXIMO_PAGAMENTO_PAGSEGURO) {
			Paypal payPalLib = new Paypal();
			payPalLib.processCreditCard(numeroCartao, titular, valorCompra);

		} else {
			PagSeguro pagSeguroBiblioteca = new PagSeguro();
			pagSeguroBiblioteca.processarCompraCredito(numeroCartao, titular, valorCompra);
		}

	}

	public static void fazerPagamentoCd(long numeroCartao, String titular, double valorCompra) {

		if (valorCompra >= VALOR_MAXIMO_PAGAMENTO_PAGSEGURO) {
			Paypal payPalDebito = new Paypal();
			payPalDebito.processDebit(numeroCartao, titular, valorCompra);

		} else {
			PagSeguro pagSeguroDebito = new PagSeguro();
			pagSeguroDebito.processarCompraDebito(numeroCartao, titular, valorCompra);
		}
	}

	public static void fazerPagamentoPix(String chave, double valorCompra) {

		if (valorCompra >= VALOR_MAXIMO_PAGAMENTO_PAGSEGURO) {
			Paypal payPalPix = new Paypal();
			payPalPix.processPix(chave, valorCompra);
		} else {
			Paypal pagSeguroPix = new Paypal();
			pagSeguroPix.processPix(chave, valorCompra);
		}

	}

}
