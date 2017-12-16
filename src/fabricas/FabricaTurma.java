package fabricas;

import domain.Disciplina;
import domain.Professor;
import domain.Turma;

public interface FabricaTurma {
	public Turma criarTurma(String dia, Professor professor, int horario, Disciplina disciplina);
}
