import java.time.LocalDate;

import br.com.dio.domain.Curso;
import br.com.dio.domain.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição curso JavaScript");
		curso2.setCargaHoraria(4);
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);
		
	}

}
