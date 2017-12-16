package bo;

import java.util.List;

import domain.Disciplina;
import fabricas.FabricaDisciplina;
import fabricas.FabricaDisciplinaImpl;

public class DisciplinaBO {
	public static boolean criarDisciplina(List<Disciplina> listaDisciplinaSemestre,
			String nomeDisciplina, int cargaHoraria, int semestre) {
		Disciplina disciplinaRetorno;
		boolean flag = false;
		FabricaDisciplina fabricaDisciplina = new FabricaDisciplinaImpl();
		for (Disciplina listaDisciplina : listaDisciplinaSemestre) {
			if (!(listaDisciplina.getSemestre() == semestre
					&& listaDisciplina.getNome().equals(nomeDisciplina))) {
				disciplinaRetorno = fabricaDisciplina.criarDisciplina(nomeDisciplina, cargaHoraria, semestre);
				flag = true;
			}
		}
		return flag;
	}
}
