/**
 * 
 */
package apoo.file;

//para abrir e ler arquivo
import java.nio.file.Path;
import java.util.Scanner;
// algumas exceÃ§Ãµes possÃ­veis
import java.io.IOException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;


/**
 * @author apenaz
 *
 */
public class MyFile {

	private static Scanner inputFile;
	private String line = "";
	
	public void openFile(Path path) {//abre o arquivo indicado
		try {
			inputFile = new Scanner(path.toAbsolutePath());
		} catch (IOException ioExceprion) {
			System.err.println("Erro ao abrir arquivo. Encerrando");
			System.exit(1);
		}
	}

	public boolean hasNext() {
		return inputFile.hasNext();
	}

	public String nextLine()//ler a proxima linha do arquivo
	{
		try
		{
			if(inputFile.hasNext()) // se houver mais para ler
			{
				line = inputFile.nextLine();		
			}
			else 
			{
				System.err.println("nao ha mais linhas para leitura");
			}
		}
		catch (NoSuchElementException elementException)
		{
			System.err.println("File improperly formed. Terminating.");
		}
		catch (IllegalStateException stateException)//procurar detalhes
		{
			System.err.println("Error reading from file. Terminating.");
		}
		return line;
	} // fim do metodo nextLine

	public String[] nextLineDividedFields(String separator) {
		line = inputFile.nextLine();
		String[] retorno = line.split(separator);
		return retorno;
	}

	public String[] dividedFields(String line, String separator) {
		String[] retorno = line.split(separator);
		return retorno;
	}

	public void closeFile() {
		if (inputFile != null) {
			inputFile.close();
		}
	}


}