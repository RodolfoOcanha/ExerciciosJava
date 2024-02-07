package atividadePraticaJava;

public class atividade3 {

	public static void main(String[] args) {
		float salarioBruto = 2000.00f;
		float adcNoturno = 500.00f;
		float horasExtras = 100.00f;
		float desconto = 200.00f;
		float salarioLiq = (salarioBruto + adcNoturno +( horasExtras* 5) - desconto);
		
		System.out.print("Salário Liquido:" + salarioLiq);
			

	}

}
