package fabricas;

import java.util.List;

import domain.Disciplina;
import domain.Professor;

public interface FabricaProfessor {

	public Professor criarProfessor(String nome, int cargaHoraria, List<Disciplina> portifolioDisciplina);
}
