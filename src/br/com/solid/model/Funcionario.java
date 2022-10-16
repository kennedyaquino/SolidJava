package br.com.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {
	
	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		this.dadosPessoais.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}
	
	public LocalDate getDataUltimoReajuste() {
		return this.dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);
	}
	
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

}
