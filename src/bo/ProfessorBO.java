package bo;

import java.util.ArrayList;
import java.util.List;

import domain.Disciplina;
import domain.Professor;

public class ProfessorBO {

	public static boolean atribuirMateriaProfessor(Professor professor, Disciplina disciplina) {
		for (Disciplina disciplinasPortifolio : professor.getPortifolioDisciplinas()) {
			if (disciplinasPortifolio.equals(disciplina) && disciplina.getCargaHoraria() <= professor.getLimiteCargaHoraria()) {
				List<Disciplina> disciplinas = new ArrayList<Disciplina>();
				disciplinas.add(disciplina);
				professor.setDisciplinas(disciplinas);
			}
		}
		if (!professor.getDisciplinas().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
