import static org.junit.Assert.*;

import org.junit.Test;


public class TesteProfessor {

	@Test
	public static void main(String[] args) 
	 {
	 ProfessorFixo prof1 = new ProfessorFixo();
	 
	 ProfessorHorista prof2 = new ProfessorHorista();
	 
	 ProfessorBolsista prof3 = new ProfessorBolsista();
	 
	 prof1.setMatricula(1);
	 prof1.setNome("João");
	 prof1.setSalario(3000);
	 
	 prof2.setMatricula(2);
	 prof2.setNome("Kleber");
	 prof2.setValorHora(50);
	 prof2.setNumHoras(20);

	 prof3.setMatricula(3);
	 prof3.setNome("Damiao");
	 prof3.setValorBolsa(100);
	 
	 
	 System.out.println("Salario Prof 1 = "+prof1.getSalario());
	 System.out.println("Salario Prof 2 = "+prof2.getSalario());
	 System.out.println("Salario Prof 3 = "+prof3.getSalario());
	 }
	}
