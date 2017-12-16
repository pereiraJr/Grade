package domain;

import java.util.List;

public class Turma {

	/*
	 * 1. Nao pode ter 2 turmas no mesmo horario com o mesmo professor 2.
	 * Restricao de Horario do Professor 3. Nao pode ter 2 turmas de disciplinas
	 * do mesmo semestre no mesmo horario 2. Uma disciplina só tem um horario
	 */
	private Professor professor;
	private Disciplina disciplina;
	private int horario;
	private String dia;

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
}
