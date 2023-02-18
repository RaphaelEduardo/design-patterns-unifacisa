package br.si.design.facade.pagseguro;

//isso eh a biblioteca fake do pagseguro
//todo esse codigo aqui eh do pagseguro
public class PagSeguro {

	public void processarCompraCredito(long numero, String usuario, double valor) {
		System.out.println(valor + " aprovado!");
	}
	
	public void processarCompraDebito(long numero, String usuario, double valor) {
		System.out.println(valor + " aprovado!");
	}
	
	public void pagamentoPix(String chave, double valor) {
		System.out.println(valor + " aprovado!");
	}
}
