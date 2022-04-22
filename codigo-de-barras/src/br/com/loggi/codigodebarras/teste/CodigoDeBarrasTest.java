package br.com.loggi.codigodebarras.teste;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.loggi.ValidacaoException;
import br.com.loggi.codigodebarras.Trincas;
import br.com.loggi.produtos.Bebidas;
import br.com.loggi.produtos.Brinquedos;
import br.com.loggi.produtos.Produto;
import br.com.loggi.produtos.ProdutoEletronicos;
import br.com.loggi.produtos.ProdutoJoias;
import br.com.loggi.produtos.ProdutoLivros;
import br.com.loggi.regioes.Regiao;
import br.com.loggi.regioes.RegiaoCentroOeste;
import br.com.loggi.regioes.RegiaoNordeste;
import br.com.loggi.regioes.RegiaoNorte;
import br.com.loggi.regioes.RegiaoSudeste;
import br.com.loggi.regioes.RegiaoSul;
import br.com.loggi.vendedores.Vendedor;
import br.com.loggi.vendedores.Vendedor123;
import br.com.loggi.vendedores.Vendedor584;
import br.com.loggi.vendedores.Vendedor124;
import br.com.loggi.vendedores.Vendedor874;
import br.com.loggi.vendedores.Vendedor654;
import br.com.loggi.vendedores.Vendedor367;
import br.com.loggi.vendedores.Vendedor845;

public class CodigoDeBarrasTest {

	public static void main(String[] args) {
		
		List<String> codigoDeBarras = carregarCodigoDeBarras();
		List<Trincas> listaTrinca = new ArrayList<>();
		for (String codigoBarra : codigoDeBarras) {
			
			int origem = Integer.parseInt(codigoBarra.substring(0,3)); 
			int destino =Integer.parseInt(codigoBarra.substring(3,6)); 
			int codLoggi =Integer.parseInt(codigoBarra.substring(6,9)); 
			int codVendedor =Integer.parseInt(codigoBarra.substring(9,12)); 
			int codTipoProduto = Integer.parseInt(codigoBarra.substring(12,15)); 
			
			try {
				Regiao regiaoOrigem = obterRegiao(origem);
				Regiao regiaoDestino = obterRegiao(destino);
				Vendedor codigoVendedor = buscaVendedor(codVendedor);
				Produto produto = buscaProduto(codTipoProduto);
				Trincas trinca = new Trincas(regiaoOrigem, regiaoDestino, codLoggi, codigoVendedor, produto);
				 listaTrinca.add(trinca);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				
			}
		}
	}


	private static List<String> carregarCodigoDeBarras() {
		return List.of(
				"288355555123888",
				"335333555584333",
				"223343555124001",
				"002111555874555",
				"111188555654777", 
				"111333555123333",
				"432055555123888",
				"079333555584333",
				"155333555124001",
				"333188555584333",
				"555288555123001",
				"111388555123555",
				"288000555367333",
				"066311555874001",
				"110333555123555",
				"333488555584333",
				"455448555123001",
				"022388555123555",
				"432044555845333",
				"034311555874001"
);
	}
	
	
	public static Regiao obterRegiao(int codigoRegiao) {
		
		if (codigoRegiao <= 99) {
			System.out.println("Regiao Sul");
			return new RegiaoSul(codigoRegiao);
		}
		if (codigoRegiao <= 199) {
			System.out.println("Regiao Sudeste");
			return new RegiaoSudeste(codigoRegiao);
		}
		if (codigoRegiao <= 299) {
			System.out.println("Regiao Centro-Oeste");
			return new RegiaoCentroOeste(codigoRegiao);
		}
		if (codigoRegiao <= 399) {
			System.out.println("Regiao Nordeste");
			return new RegiaoNordeste(codigoRegiao);
		}
		if (codigoRegiao <= 499) {
			System.out.println("Regiao Norte");
			return new RegiaoNorte(codigoRegiao);
		}
		throw new ValidacaoException("Regiao nao encontrada, codigo invalido!");
		
	}
	
	public static Produto buscaProduto(int codigoProduto) {
		if(codigoProduto == 1 ) {
			System.out.println("Joias");
			return new ProdutoJoias(codigoProduto);
		}
		if(codigoProduto == 111 ) {
			System.out.println("Livros");
			return new ProdutoLivros(codigoProduto);
		}
		if(codigoProduto == 333 ) {
			System.out.println("Eletronicos");
			return new ProdutoEletronicos(codigoProduto);
		}
		if(codigoProduto == 555 ) {
			System.out.println("Bebidas");
			return new Bebidas(codigoProduto);
		}
		if(codigoProduto == 888 ) {
			System.out.println("Brinquedos");
			return new Brinquedos(codigoProduto);
		}
		throw new ValidacaoException("Produto não encontrado, codigo invalido!");
	}
	
	public static Vendedor buscaVendedor(int codigoVendedor) {
		
		if(codigoVendedor == 123 ) {
			System.out.println("Vendedor 123");
			return new Vendedor123(codigoVendedor);
		}
		if(codigoVendedor == 584 ) {
			System.out.println("vendedor 584");
			return new Vendedor584(codigoVendedor);
		}
		if(codigoVendedor == 124 ) {
			System.out.println("vendedor 124");
			return new Vendedor124(codigoVendedor);
		}
		if(codigoVendedor == 874 ) {
			System.out.println("Vendedor 874");
			return new Vendedor874(codigoVendedor);
		}
		if(codigoVendedor == 654 ) {
			System.out.println("Vendedor 654");
			return new Vendedor654(codigoVendedor);
		}
		if(codigoVendedor == 367 ) {
			System.out.println("Vendedor 367");
			return new Vendedor367(codigoVendedor);
		}
		if(codigoVendedor == 845 ) {
			System.out.println("Vendedor 845");
			return new Vendedor845(codigoVendedor);
		}
		throw new ValidacaoException("Vendedor não encontrado, codigo invalido!");
	}
	
	}
	

 