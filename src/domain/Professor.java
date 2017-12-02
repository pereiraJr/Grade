package domain;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	private String nome;
	List<Disciplina> portifolioDisciplina = new ArrayList<>();
	List<Disciplina> disciplina = new ArrayList<>();

	public List<Disciplina> getPortifolioDisciplina() {
		return portifolioDisciplina;
	}

	public void setPortifolioDisciplina(List<Disciplina> portifolioDisciplina) {
		this.portifolioDisciplina = portifolioDisciplina;
	}

	private int limiteCargaHoraria;

	public int getLimiteCargaHoraria() {
		return limiteCargaHoraria;
	}

	public void setLimiteCargaHoraria(int limiteCargaHoraria) {
		this.limiteCargaHoraria = limiteCargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

}
