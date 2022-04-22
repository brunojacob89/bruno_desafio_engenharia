package br.com.loggi.codigodebarras;

import br.com.loggi.ValidacaoException;
import br.com.loggi.produtos.Produto;
import br.com.loggi.regioes.Regiao;
import br.com.loggi.vendedores.Vendedor;

public class Trincas {

	private Regiao origem;
	private Regiao destino;
	private int codLoggi;
	private Vendedor codVendedor;
	private Produto tipoDoProduto;
	
	public Trincas(Regiao origem, Regiao destino, int codLoggi, Vendedor codVendedor, Produto tipoDoProduto) {
		super();
		this.origem = origem;
		this.destino = destino;
		if (codLoggi != 555) {
			throw new ValidacaoException("Codigo Loggi incorreto");
		}
		this.codLoggi = codLoggi;
		this.codVendedor = codVendedor;
		this.tipoDoProduto = tipoDoProduto;
	}

	public Regiao getOrigem() {
		return origem;
	}

	public Regiao getDestino() {
		return destino;
	}

	public int getCodLoggi() {
		return codLoggi;
	}

	public Vendedor getCodVendedor() {
		return codVendedor;
	}

	public Produto getTipoDoProduto() {
		return tipoDoProduto;
	}

	
	
	
}
