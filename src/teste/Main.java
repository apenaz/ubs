/**
 * 
 */
package teste;
import apoo.basico.os.UBS;
import apoo.file.MyFile;

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
		MyFile arquivo = new MyFile();
		
		i = new Scanner(System.in);
		
		System.out.println("digite o arquivo com as informacoes das ubs:\n");
		Path path = Paths.get(i.nextLine());// cria o objeto Path com base na entrada de usuario
		
		arquivo.openFile(path);
		while(arquivo.hasNext()){
			String line = arquivo.nextLine();
				ubss.add(new UBS(arquivo.dividedFields(line, ",")));
				System.out.println(line);
		}
		
		arquivo.closeFile();
		
	}//Fim da main
}//Fim da classe Main