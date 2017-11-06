/**
 * 
 */
package teste;
import apoo.basico.os.UBS;
import apoo.file.MyFile;

import java.util.ArrayList;
import java.util.Iterator;
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
		MyFile saida = new MyFile();
		
		i = new Scanner(System.in);
		
		System.out.println("digite o arquivo com as informções das ubs:\n");
		// cria o objeto Path com base na entrada de usuário
		Path path = Paths.get(i.nextLine());
		
		arquivo.openFile(path);
		while(arquivo.hasNext()) 
		//for( int i=0 ; i<3 ; i++)
		{
			String[] campos = arquivo.nextLineDividedFields(",");
				ubss.add(new UBS(campos));				
		}
		arquivo.closeFile();

		System.out.println("digite o arquivo com a saída das informções das ubs:\n");
		// cria o objeto Path com base na entrada de usuário
		path = Paths.get(i.nextLine());
		saida.openFile(path);
		for (Iterator<UBS> iterator = ubss.iterator(); iterator.hasNext();) {
			UBS ubs = (UBS) iterator.next();
			System.out.println(ubs);
		}
		
	}//Fim da main

}//Fim da classe Main
