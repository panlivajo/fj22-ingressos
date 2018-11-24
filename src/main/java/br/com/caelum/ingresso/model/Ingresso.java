package br.com.caelum.ingresso.model;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.descontos.Desconto;

public class Ingresso {

	
	private Sessao sessao;
	
	private BigDecimal preco;
	
	private Lugar lugar;
	
	private TipoDeIngresso tipoDeIngresso;

	/**
	 * @deprecated hibernate only
	 */
	public Ingresso() {
	}
	
	public Ingresso(Sessao sessao, TipoDeIngresso tipoDeIngresso, Desconto tipoDeDesconto) {
		this.sessao = sessao;
		this.tipoDeIngresso = tipoDeIngresso;
		this.preco = this.tipoDeIngresso.aplicaDesconto(sessao.getPreco());

		this.lugar = lugar;
	}
	
	public BigDecimal getPreco() {
		// return preco.setScale(2, RoundingMode.HALF_UP);
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
}
