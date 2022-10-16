package br.com.solid.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.solid.ValidacaoException;
import br.com.solid.model.Funcionario;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
	
	@Override
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getDadosPessoais().getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if(percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste não pode ser superior a 40% do salario");
		}
	}
}
