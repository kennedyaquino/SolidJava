package br.com.solid.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {
	
	BigDecimal valor();
	LocalDate data();
	BigDecimal valorImpostoDeReanda();

}
