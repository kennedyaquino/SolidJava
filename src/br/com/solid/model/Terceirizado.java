package br.com.solid.model;


public class Terceirizado {
	
	private String empresa;
	private DadosPessoais dadosPessoais;
	
	public Terceirizado(String empresa, DadosPessoais dadosPessoais) {
		super();
		this.empresa = empresa;
		this.dadosPessoais = dadosPessoais;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public String getEmpresa() {
		return empresa;
	}

}
