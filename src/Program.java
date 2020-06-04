import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program {

	public static void main(String[] args) {
		
		/*a classe FileWriter serve para criar um arquivo (caso n exita) e reescrever ou escrever abaixo colocando TRUE como parâmetro,
		 *  neste caso colocaremos as strings do vetor,*/
		
		String[] lines = new String[] {"Bom dia, Boa tarde, Boa noite, "};
		
		String path = "/home/wds/java-u/atividades/9-trabalhando-arquivos-java/3-FileWriter-e-BufferedWriter-escreve-em-arquivos-JAVA/out.txt";
		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path ,true))){
			for (String line : lines) {
			bw.write(line);
			bw.newLine();
			System.out.println("Pronto, olhe a pasta raiz do path");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
