/**
 * 
 */
package apoo.file;

import apoo.basico.os.UBS;

/**
 * @author apenaz
 *
 */
public class Filtros {
	
	private String ruim = "Desempenho abaixo da média";
	private String regular = "Desempenho mediano ou  um pouco abaixo da média";
	private String bom = "Desempenho acima da média";
	private String otimo = "Desempenho muito acima da média";

	boolean cod_munic;
	boolean cod_cnes;
	boolean nom_estab;
	boolean dsc_endereco;
	boolean dsc_bairro;
	boolean dsc_cidade;
	boolean dsc_telefone;
	boolean dsc_estrut_fisic_ambiencia;
	boolean dsc_adap_defic_fisic_idosos;
	boolean dsc_equipamentos;
	boolean dsc_medicamentos;

	public Filtros() {

	}

	public boolean codigoMunicipio(UBS ubs, int compara) {
		return ubs.getCod_munic() == compara;
	}
	
	public boolean codigoCnes(UBS ubs, int compara) {
		return ubs.getCod_cnes() == (compara);
	}
	
	public boolean nome(UBS ubs, String compara) {
		return ubs.getNom_estab().equals(compara);
	}
	
	public boolean endereco(UBS ubs, String compara) {
		return ubs.getDsc_endereco().equals(compara);
	}
	
	public boolean bairro(UBS ubs, String compara) {
		return ubs.getDsc_bairro().equals(compara);
	}
	
	public boolean cidade(UBS ubs, String compara) {
		return ubs.getDsc_cidade().equals(compara);
	}
	
	public boolean telefone(UBS ubs, String compara) {
		return ubs.getDsc_telefone().equals(compara);
	}
	
	public boolean estruturaFisica(UBS ubs, int qualidade) {

		String compara;

		switch (qualidade) {
		case 1:
			compara = ruim;
			break;
		case 2:
			compara = regular;
			break;
		case 3:
			compara = bom;
			break;
		case 4:
			compara = otimo;
			break;

		default:
			compara = null;
			System.err.println("Esta não é uma opcao valida!");
		}
		return ubs.getDsc_estrut_fisic_ambiencia().equals(compara);
	}

	public boolean estruturaFisicaAdaptacao(UBS ubs, int qualidade) {

		String compara;

		switch (qualidade) {
		case 1:
			compara = ruim;
			break;
		case 2:
			compara = regular;
			break;
		case 3:
			compara = bom;
			break;
		case 4:
			compara = otimo;
			break;

		default:
			compara = null;
			System.err.println("Esta não é uma opcao valida!");
		}
		return ubs.getDsc_adap_defic_fisic_idosos().equals(compara);
	}
	
	public boolean equipamentos(UBS ubs, int qualidade) {

		String compara;

		switch (qualidade) {
		case 1:
			compara = ruim;
			break;
		case 2:
			compara = regular;
			break;
		case 3:
			compara = bom;
			break;
		case 4:
			compara = otimo;
			break;

		default:
			compara = null;
			System.err.println("Esta não é uma opcao valida!");
		}
		return ubs.getDsc_equipamentos().equals(compara);
	}
	
	public boolean medicamentos(UBS ubs, int qualidade) {

		String compara;

		switch (qualidade) {
		case 1:
			compara = ruim;
			break;
		case 2:
			compara = regular;
			break;
		case 3:
			compara = bom;
			break;
		case 4:
			compara = otimo;
			break;

		default:
			compara = null;
			System.err.println("Esta não é uma opcao valida!");
		}
		return ubs.getDsc_medicamentos().equals(compara);
	}

	public boolean estado(UBS ubs, int compara) {
		boolean retorno;
		int municipio = ubs.getCod_munic();
		if( municipio >= (compara*10000) && municipio < (  (compara+1) * 10000) ) {
			retorno =  true;
		}
		else {
			retorno = false;
		}
		return retorno;
	}
}