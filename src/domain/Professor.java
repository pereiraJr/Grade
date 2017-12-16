package domain;

import java.util.ArrayList;
import java.util.List;

public class Professor {

	private String nome;
	private List<Disciplina> portifolioDisciplinas = new ArrayList<>();
	private List<Disciplina> disciplinas = new ArrayList<>();
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

	public List<Disciplina> getPortifolioDisciplinas() {
		return portifolioDisciplinas;
	}

	public void setPortifolioDisciplinas(List<Disciplina> portifolioDisciplinas) {
		this.portifolioDisciplinas = portifolioDisciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	

}
