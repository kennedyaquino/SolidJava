package br.com.solid.service;

import java.math.BigDecimal;

import br.com.solid.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
