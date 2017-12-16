package bo;

import java.util.List;

import domain.Turma;
import domain.Disciplina;
import domain.Professor;
import fabricas.FabricaTurma;
import fabricas.FabricaTurmaImpl;

public class TurmaBO {

	public static boolean criarTurma(List<Turma> listaTurmas, Professor professor, Disciplina disciplina, String dia,
			int horario) {
		FabricaTurma fabricaTurma = new FabricaTurmaImpl();
		Turma novaTurma = null;
		boolean flag = false;
		for (Turma turmaList : listaTurmas) {
			if (!(turmaList.getProfessor().equals(professor) && turmaList.getHorario() == horario
					&& turmaList.getDia().equals(dia)) && ProfessorBO.atribuirMateriaProfessor(professor, disciplina)) {
				flag = true;
			}
		}
		if (flag) {
			novaTurma = fabricaTurma.criarTurma(dia, professor, horario, disciplina);
		}

		return flag;
	}

}
