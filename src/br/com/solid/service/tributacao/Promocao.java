package br.com.solid.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements Reajuste {
	
	private BigDecimal valor;
	private LocalDate data;
	
	

	public Promocao(BigDecimal valor) {
		this.valor = valor;
		this.data = LocalDate.now();
	}

	@Override
	public BigDecimal valor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public LocalDate data() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public BigDecimal valorImpostoDeReanda() {
		// TODO Auto-generated method stub
		return valor.multiply(new BigDecimal("0.1"));
	}

}
