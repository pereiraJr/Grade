package fabricas;

import domain.Disciplina;

public interface FabricaDisciplina {

	public Disciplina criarDisciplina(String nomeDisciplina, int cargaHoraria, int semestre);
}
