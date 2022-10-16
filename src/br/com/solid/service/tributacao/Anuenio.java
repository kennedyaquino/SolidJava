package br.com.solid.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {
	
	private BigDecimal valor;
	private LocalDate data;

	public Anuenio(BigDecimal valor) {
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

}
