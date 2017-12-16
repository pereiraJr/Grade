package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import bo.DisciplinaBO;
import domain.Disciplina;
import fabricas.FabricaDisciplina;
import fabricas.FabricaDisciplinaImpl;

public class DisciplinaBOTest {
	private static FabricaDisciplina fabricaDisciplina;
	private static List<Disciplina> listaDisciplinaSemestre;

	@BeforeClass
	public static void setup() {
		fabricaDisciplina = new FabricaDisciplinaImpl();
		listaDisciplinaSemestre = new ArrayList<>();
	}

	@Test
	public void criarDisciplinaMesmoNomeMesmoSemestre() {
		Disciplina disciplina = fabricaDisciplina.criarDisciplina("Web", 60, 2);
		listaDisciplinaSemestre.add(disciplina);

		assertEquals(false, DisciplinaBO.criarDisciplina(listaDisciplinaSemestre, "Web", 60, 2));

	}

	@Test
	public void criarDisciplinaSucesso() {
		Disciplina disciplina = fabricaDisciplina.criarDisciplina("Web", 60, 2);
		listaDisciplinaSemestre.add(disciplina);
		String nomeDisciplina = "Banco";
		int semestre = 3;
		int cargaHoraria = 60;

		assertEquals(true,
				DisciplinaBO.criarDisciplina(listaDisciplinaSemestre, nomeDisciplina, cargaHoraria, semestre));

	}

}
