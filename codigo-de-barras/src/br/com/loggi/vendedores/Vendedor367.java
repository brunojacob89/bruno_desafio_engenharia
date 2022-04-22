package br.com.loggi.vendedores;

import br.com.loggi.ValidacaoException;

public class Vendedor367 extends Vendedor {

	public Vendedor367(int codigo) {
		super(codigo);
		throw new ValidacaoException("Vendedor CNPJ INVALIDO, Impossivel enviar produtos!");
	}

}
