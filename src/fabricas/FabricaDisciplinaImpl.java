package fabricas;

import domain.Disciplina;

public class FabricaDisciplinaImpl implements FabricaDisciplina{

	public Disciplina criarDisciplina(String nomeDisciplina, int cargaHoraria, int semestre) {
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(nomeDisciplina);
		disciplina.setCargaHoraria(cargaHoraria);
		disciplina.setSemestre(semestre);

		return disciplina;
	}
}
