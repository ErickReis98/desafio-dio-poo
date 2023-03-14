import java.time.LocalDate;

import br.com.dio.domain.Bootcamp;
import br.com.dio.domain.Conteudo;
import br.com.dio.domain.Curso;
import br.com.dio.domain.Dev;
import br.com.dio.domain.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conteudo curso1 = new Curso();
		Conteudo curso2 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		((Curso) curso1).setCargaHoraria(8);
		
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição curso JavaScript");
		((Curso) curso2).setCargaHoraria(4);
		
		Conteudo mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		((Mentoria) mentoria).setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		*/
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("Erick");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + dev.getConteudoInscritos());
		dev.progredir();
		dev.progredir();
		System.out.println();
		System.out.println("Conteudos inscritos: " + dev.getConteudoInscritos());
		System.out.println("Conteudos concluidos: " + dev.getConteudosConcluidos());
		System.out.println("XP: " + dev.calcularTotalXp());
		
		
		
		System.out.println("-----------------------------------");
		Dev dev2 = new Dev();
		dev2.setNome("Gustavo");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + dev2.getConteudoInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println();
		System.out.println("Conteudos inscritos: " + dev2.getConteudoInscritos());
		System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}

}
