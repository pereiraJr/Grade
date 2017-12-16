package load;

import java.util.ArrayList;
import java.util.List;

import domain.Disciplina;
import domain.Professor;
import domain.Turma;
import fabricas.FabricaDisciplina;
import fabricas.FabricaDisciplinaImpl;
import fabricas.FabricaProfessor;
import fabricas.FabricaProfessorImpl;
import fabricas.FabricaTurma;
import fabricas.FabricaTurmaImpl;

public class TurmaTst {
	public static void main(String[] args) {
		FabricaTurma fabricaTurma = new FabricaTurmaImpl();
		FabricaDisciplina fabricaDisciplina = new FabricaDisciplinaImpl();
		FabricaProfessor fabricaProfessor = new FabricaProfessorImpl();

		Disciplina web = fabricaDisciplina.criarDisciplina("Web", 30, 1);
		Disciplina banco = fabricaDisciplina.criarDisciplina("Banco", 30, 1);
		String dia = "Terca";
		int horario = 1;
		List<Disciplina> portifolioMario = new ArrayList<Disciplina>();
		portifolioMario.add(web);

		Professor mario = fabricaProfessor.criarProfessor("Mario", 90, portifolioMario);

		Turma bes001 = fabricaTurma.criarTurma(dia, mario, horario, web);
		
		List<Turma> listAulas = new ArrayList<>();
		listAulas.add(bes001);
		
		System.out.println(bes001.getDisciplina().getNome());
		
		
		
	}
}
