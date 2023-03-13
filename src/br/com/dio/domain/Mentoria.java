package br.com.dio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	public Mentoria() {

	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [Titulo: " + getTitulo() + ", Descricao: " + getDescricao() + 
				"Data: " + data + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	

}
