package fabricas;

import domain.Disciplina;
import domain.Professor;
import domain.Turma;

public class FabricaTurmaImpl implements FabricaTurma {
	public Turma criarTurma(String dia, Professor professor, int horario, Disciplina disciplina) {
		Turma turma = new Turma();
		turma.setDia(dia);
		turma.setDisciplina(disciplina);
		turma.setHorario(horario);
		turma.setProfessor(professor);
		return turma;
	}
}
