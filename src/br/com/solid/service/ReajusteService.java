package br.com.solid.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.solid.ValidacaoException;
import br.com.solid.model.Funcionario;

public class ReajusteService {
	
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if(percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste não pode ser superior a 40% do salario");
		}
		
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		
		if(mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser de no minimo 6 meses.");
		}
		
		BigDecimal salarioReajustado = salarioAtual.add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}

}
