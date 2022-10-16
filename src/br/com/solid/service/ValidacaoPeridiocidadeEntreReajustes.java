package br.com.solid.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.solid.ValidacaoException;
import br.com.solid.model.Funcionario;

public class ValidacaoPeridiocidadeEntreReajustes implements ValidacaoReajuste {
	
	@Override
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		
		if(mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser de no minimo 6 meses.");
		}
	}

}
