package fabricas;

import java.util.List;

import domain.Disciplina;
import domain.Professor;

public class FabricaProfessorImpl implements FabricaProfessor{

	public Professor criarProfessor(String nome, int cargaHoraria, List<Disciplina> portifolioDisciplina) {
		Professor professor = new Professor();
		professor.setNome(nome);
		professor.setLimiteCargaHoraria(cargaHoraria);
		professor.setPortifolioDisciplinas(portifolioDisciplina);
		return professor;
	}

}
