/**
 * 
 */
package teste;
import apoo.basico.os.UBS;
import apoo.file.Filtros;
import apoo.file.MeuArquivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author apenaz
 *
 */
public class Main {

	private static Scanner i;
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		List<UBS> ubss = new ArrayList<UBS>();
		List<UBS> ubsSelecionadasEstado = new ArrayList<UBS>();
		List<UBS> ubsSelecionadas = new ArrayList<UBS>();
		Filtros selecao = new Filtros();
		MeuArquivo arquivo = new MeuArquivo();
		
		i = new Scanner(System.in);
		
		System.out.println("digite o arquivo com as informacoes das ubs:\n");
		Path path = Paths.get(i.nextLine());// cria o objeto Path com base na entrada de usuario
		
		arquivo.openFile(path);
		//descarta o cabeçalho
		arquivo.nextLine();
		while(arquivo.hasNext()){
			String line = arquivo.nextLine();
				ubss.add(new UBS(arquivo.dividedFields(line, ",")));
				//System.out.println(line);
		}
		//System.out.printf("\nacabou de ler tudo\n");
		
		System.out.printf("total de ubs no país: %d: ", ubss.size());
		for (UBS ubs : ubss) {
			if(selecao.estado(ubs, 23)) {
				ubsSelecionadasEstado.add(ubs);
			}
		}
		for (UBS ubs : ubsSelecionadasEstado) {
			if( selecao.telefone(ubs, "Não se aplica") || selecao.estruturaFisica(ubs, 1) || selecao.estruturaFisicaAdaptacao(ubs, 1) || selecao.equipamentos(ubs, 1) || selecao.medicamentos(ubs, 1)){
				ubsSelecionadas.add(ubs);
			}
			
		}
		System.out.printf("numero de ubs encontradas no estado: %d\n", ubsSelecionadasEstado.size());
		System.out.printf("numero de ubs encontradas no estado com alguma deficiencia: %d\n", ubsSelecionadas.size());
		
		for (UBS ubs : ubsSelecionadas) {
			System.out.println(ubs);
		}
		
		arquivo.closeFile();
		
	}//Fim da main
}//Fim da classe Main