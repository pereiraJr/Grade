package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bo.TurmaBO;
import domain.Turma;
import domain.Disciplina;
import domain.Professor;
import fabricas.FabricaTurma;
import fabricas.FabricaTurmaImpl;
import fabricas.FabricaDisciplina;
import fabricas.FabricaDisciplinaImpl;
import fabricas.FabricaProfessor;
import fabricas.FabricaProfessorImpl;

public class TurmaBOTest {

	private static FabricaTurma fabricaTurma;
	private static FabricaDisciplina fabricaDisciplina;
	private static FabricaProfessor fabricaProfessor;
	private static List<Disciplina> portifolio;
	private static List<Turma> listaTurmas;

	@BeforeClass
	public static void setup() {
		fabricaTurma = new FabricaTurmaImpl();
		fabricaDisciplina = new FabricaDisciplinaImpl();
		fabricaProfessor = new FabricaProfessorImpl();
		portifolio = new ArrayList<>();
	}

	@Before
	public void clean() {
		portifolio.clear();
	}
	
	@Test
	public void criarTurmaSucesso(){
		Disciplina web = fabricaDisciplina.criarDisciplina("Web", 30, 1);
		String dia = "Quarta";
		int horario = 1;
		portifolio.add(web);

		Professor mario = fabricaProfessor.criarProfessor("Mario", 90, portifolio);

		Turma bes001 = fabricaTurma.criarTurma(dia, mario, horario, web);
		List<Turma> listTurmas = new ArrayList<>();
		listTurmas.add(bes001);

		assertEquals(true, ((TurmaBO.criarTurma(listTurmas, mario, web, "Segunda", 1))));
	}

	@Test
	public void criarTurmaMateriaForaPortifolio() {
		Disciplina web = fabricaDisciplina.criarDisciplina("Web", 30, 1);
		Disciplina banco = fabricaDisciplina.criarDisciplina("Banco", 30, 1);
		String dia = "Quarta";
		int horario = 1;
		portifolio.add(web);

		Professor mario = fabricaProfessor.criarProfessor("Mario", 90, portifolio);

		Turma bes001 = fabricaTurma.criarTurma(dia, mario, horario, web);
		List<Turma> listTurmas = new ArrayList<>();
		listTurmas.add(bes001);

		assertEquals(false, ((TurmaBO.criarTurma(listTurmas, mario, banco, "Quinta", 2))));

	}

	@Test
	public void criarTurmaExistente() {

		Disciplina web = fabricaDisciplina.criarDisciplina("Web", 30, 1);
		String dia = "Terca";
		int horario = 1;
		portifolio.add(web);

		Professor mario = fabricaProfessor.criarProfessor("Mario", 90, portifolio);

		Turma bes001 = fabricaTurma.criarTurma(dia, mario, horario, web);
		List<Turma> listTurmas = new ArrayList<>();
		listTurmas.add(bes001);
		assertFalse(((TurmaBO.criarTurma(listTurmas, mario, web, dia, horario))));

	}
}
