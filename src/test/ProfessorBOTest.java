package test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import bo.ProfessorBO;
import domain.Disciplina;
import domain.Professor;
import fabricas.FabricaDisciplina;
import fabricas.FabricaDisciplinaImpl;
import fabricas.FabricaProfessor;
import fabricas.FabricaProfessorImpl;

public class ProfessorBOTest {

	private static FabricaDisciplina fabricaDisciplina;
	private static FabricaProfessor fabricaProfessor;
	private static List<Disciplina> portifolio;

	@BeforeClass
	public static void setup() {
		fabricaDisciplina = new FabricaDisciplinaImpl();
		fabricaProfessor = new FabricaProfessorImpl();
		portifolio = new ArrayList<Disciplina>();
	}
	
	@Before
	public void clean(){
		portifolio.clear();
	}
	
	@Test
	public void atribuirMateriaCargaHorariaMaior() {
		Disciplina banco = fabricaDisciplina.criarDisciplina("Banco", 120, 1);
		portifolio.add(banco);
		Professor mario = fabricaProfessor.criarProfessor("Mario", 90, portifolio);

		assertEquals(false, ProfessorBO.atribuirMateriaProfessor(mario, banco));
	}

	@Test
	public void atribuirMateriaConstaPortifolio() {
		Disciplina banco = fabricaDisciplina.criarDisciplina("Banco", 90, 1);
		portifolio.add(banco);
		Professor mario = fabricaProfessor.criarProfessor("Mario", 90, portifolio);

		assertEquals(true, ProfessorBO.atribuirMateriaProfessor(mario, banco));
	}

	@Test
	public void atribuirMateriaNaoConstaSemPortifolio() {
		Disciplina web = fabricaDisciplina.criarDisciplina("Web", 30, 1);
		Professor mario = fabricaProfessor.criarProfessor("Mario", 90, portifolio);

		assertEquals(false, ProfessorBO.atribuirMateriaProfessor(mario, web));
	}
}
