package load;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import domain.Disciplina;
import domain.Professor;
import fabricas.FabricaDisciplina;
import fabricas.FabricaDisciplinaImpl;
import fabricas.FabricaProfessor;
import fabricas.FabricaProfessorImpl;

public class Teste {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();

		FabricaDisciplina fabricaDisciplina = new FabricaDisciplinaImpl();
		FabricaProfessor fabricaProfessor = new FabricaProfessorImpl();

		Disciplina poo = fabricaDisciplina.criarDisciplina("Poo", 110, 1);
		Disciplina banco = fabricaDisciplina.criarDisciplina("Banco", 120, 1);
		Disciplina algoritmo = fabricaDisciplina.criarDisciplina("Algoritmo", 30, 1);
		Disciplina requisitos = fabricaDisciplina.criarDisciplina("Requisitos", 30, 1);
		Disciplina web = fabricaDisciplina.criarDisciplina("Web", 30, 1);

		List<Disciplina> portifolioMario = new ArrayList<Disciplina>();
		portifolioMario.add(web);
		portifolioMario.add(banco);

		List<Disciplina> portifolioDaniel = new ArrayList<Disciplina>();
		portifolioDaniel.add(banco);
		portifolioDaniel.add(requisitos);

		List<Disciplina> portifolioNeiva = new ArrayList<Disciplina>();
		portifolioNeiva.add(poo);
		portifolioNeiva.add(web);

		List<Disciplina> portifolioOsvaldo = new ArrayList<Disciplina>();
		portifolioOsvaldo.add(algoritmo);

		Professor mario = fabricaProfessor.criarProfessor("Mario", 90, portifolioMario);
		Professor neiva = fabricaProfessor.criarProfessor("Neiva", 30, portifolioNeiva);
		Professor jeane = fabricaProfessor.criarProfessor("Jeane", 30, portifolioOsvaldo);
		Professor daniel = fabricaProfessor.criarProfessor("Daniel", 60, portifolioDaniel);
		Professor osvaldo = fabricaProfessor.criarProfessor("Osvaldo", 60, portifolioOsvaldo);

		List<Professor> listaProfessores = new ArrayList<Professor>();
		listaProfessores.add(daniel);
		listaProfessores.add(neiva);
		listaProfessores.add(osvaldo);
		listaProfessores.add(jeane);
		listaProfessores.add(mario);

		List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
		listaDisciplina.add(poo);
		listaDisciplina.add(banco);
		listaDisciplina.add(requisitos);
		listaDisciplina.add(web);
		listaDisciplina.add(algoritmo);

		for (Professor professor : listaProfessores) {
			int i = 0;
			while (professor.getDisciplina().isEmpty() && listaDisciplina.size() > i) {
				if (professor.getLimiteCargaHoraria() >= listaDisciplina.get(i).getCargaHoraria()) {
					professor.getDisciplina().add(listaDisciplina.remove(i));
				} else {
					i++;
				}
			}
		}

		System.out.println("Data de Geração ementa: " + hoje);
		for (Professor professor : listaProfessores) {
			System.out.println("Professor: " + professor.getNome());
			professor.getDisciplina()
			.forEach(disciplina -> System.out.println(disciplina.getNome()));

		}
		
		System.out.println("\n\nDisciplinas Pendentes: ");
		listaDisciplina.stream().forEach(disciplina -> System.out.println(disciplina.getNome()));

		profHoraMaiorQue30(listaProfessores);
				
	}

	private static void profHoraMaiorQue30(List<Professor> listaProfessores) {
		Stream<Professor> contadorStream = listaProfessores.stream();
		List<Professor> list = listaProfessores.stream()
				.filter(professores -> professores.getLimiteCargaHoraria() > 30)
				.collect(Collectors.toList());
		System.out.println("Professores com Cargahoraria maior que 30 : " + contadorStream.count());
	}

	public static boolean verificarPortifolio(List<Disciplina> portifolio, List<Disciplina> disciplinaDisponiveis) {

		for (Disciplina listPortifolio : portifolio) {
			for (Disciplina disciplinas : disciplinaDisponiveis) {
				if (listPortifolio.getNome().equals(disciplinas.getNome())) {
					return true;
				}
			}
		}
		return false;
	}

}
