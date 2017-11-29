/**
 * 
 */
package apoo.basico.os;

/**
 * @author apenaz
 *
 */
public class UBS {
	double vlr_latitude;
	double vlr_longitude;
	int cod_munic;
	int cod_cnes;
	String nom_estab;
	String dsc_endereco;
	String dsc_bairro;
	String dsc_cidade;
	String dsc_telefone;
	String dsc_estrut_fisic_ambiencia;
	String dsc_adap_defic_fisic_idosos;
	String dsc_equipamentos;
	String dsc_medicamentos;

	public UBS(String[] atributo) {
		try {
			vlr_latitude = Double.parseDouble(atributo[0]);
		} catch (NumberFormatException e) {
			  System.err.println("valor de latitude invalido!");
		}
		try {
			vlr_longitude= Double.parseDouble(atributo[1]);
		} catch (NumberFormatException e) {
			  System.err.println("valor de longitude invalido!");
		}
		try {
			cod_munic= Integer.parseInt(atributo[2]);
		} catch (NumberFormatException e) {
			System.err.println("valor de codigo de municipio invalido!");
		}
		try {
		cod_cnes= Integer.parseInt(atributo[3]);
		} catch (NumberFormatException e) {
			System.err.println("valor de codigo de estabelecimento de saide invalido!");
		}
		nom_estab= atributo[4];
		dsc_endereco= atributo[5];
		dsc_bairro= atributo[6];
		dsc_cidade= atributo[7];
		dsc_telefone= atributo[8];
		dsc_estrut_fisic_ambiencia = atributo[9];
		dsc_adap_defic_fisic_idosos= atributo[10];
		dsc_equipamentos= atributo[11];
		dsc_medicamentos= atributo[12];
	}

	public UBS() {

	}

	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ubs: %s, CNES: %d,\n" + "Endereco:%s, %s, %s\n" + "Telefone: %s", nom_estab, cod_cnes,
				dsc_endereco, dsc_bairro, dsc_cidade, dsc_telefone);
	}

	/**
	 * @return the vlr_latitude
	 */
	public double getVlr_latitude() {
		return vlr_latitude;
	}

	/**
	 * @return the vlr_longitude
	 */
	public double getVlr_longitude() {
		return vlr_longitude;
	}

	/**
	 * @return the cod_munic
	 */
	public int getCod_munic() {
		return cod_munic;
	}

	/**
	 * @return the cod_cnes
	 */
	public int getCod_cnes() {
		return cod_cnes;
	}

	/**
	 * @return the nom_estab
	 */
	public String getNom_estab() {
		return nom_estab;
	}

	/**
	 * @return the dsc_endereco
	 */
	public String getDsc_endereco() {
		return dsc_endereco;
	}

	/**
	 * @return the dsc_bairro
	 */
	public String getDsc_bairro() {
		return dsc_bairro;
	}

	/**
	 * @return the dsc_cidade
	 */
	public String getDsc_cidade() {
		return dsc_cidade;
	}

	/**
	 * @return the dsc_telefone
	 */
	public String getDsc_telefone() {
		return dsc_telefone;
	}

	/**
	 * @return the dsc_estrut_fisic_ambiencia
	 */
	public String getDsc_estrut_fisic_ambiencia() {
		return dsc_estrut_fisic_ambiencia;
	}

	/**
	 * @return the dsc_adap_defic_fisic_idosos
	 */
	public String getDsc_adap_defic_fisic_idosos() {
		return dsc_adap_defic_fisic_idosos;
	}

	/**
	 * @return the dsc_equipamentos
	 */
	public String getDsc_equipamentos() {
		return dsc_equipamentos;
	}

	/**
	 * @return the dsc_medicamentos
	 */
	public String getDsc_medicamentos() {
		return dsc_medicamentos;
	}

	/**
	 * @param vlr_latitude the vlr_latitude to set
	 */
	public void setVlr_latitude(double vlr_latitude) {
		this.vlr_latitude = vlr_latitude;
	}

	/**
	 * @param vlr_longitude the vlr_longitude to set
	 */
	public void setVlr_longitude(double vlr_longitude) {
		this.vlr_longitude = vlr_longitude;
	}

	/**
	 * @param cod_munic the cod_munic to set
	 */
	public void setCod_munic(int cod_munic) {
		this.cod_munic = cod_munic;
	}

	/**
	 * @param cod_cnes the cod_cnes to set
	 */
	public void setCod_cnes(int cod_cnes) {
		this.cod_cnes = cod_cnes;
	}

	/**
	 * @param nom_estab the nom_estab to set
	 */
	public void setNom_estab(String nom_estab) {
		this.nom_estab = nom_estab;
	}

	/**
	 * @param dsc_endereco the dsc_endereco to set
	 */
	public void setDsc_endereco(String dsc_endereco) {
		this.dsc_endereco = dsc_endereco;
	}

	/**
	 * @param dsc_bairro the dsc_bairro to set
	 */
	public void setDsc_bairro(String dsc_bairro) {
		this.dsc_bairro = dsc_bairro;
	}

	/**
	 * @param dsc_cidade the dsc_cidade to set
	 */
	public void setDsc_cidade(String dsc_cidade) {
		this.dsc_cidade = dsc_cidade;
	}

	/**
	 * @param dsc_telefone the dsc_telefone to set
	 */
	public void setDsc_telefone(String dsc_telefone) {
		this.dsc_telefone = dsc_telefone;
	}

	/**
	 * @param dsc_estrut_fisic_ambiencia the dsc_estrut_fisic_ambiencia to set
	 */
	public void setDsc_estrut_fisic_ambiencia(String dsc_estrut_fisic_ambiencia) {
		this.dsc_estrut_fisic_ambiencia = dsc_estrut_fisic_ambiencia;
	}

	/**
	 * @param dsc_adap_defic_fisic_idosos the dsc_adap_defic_fisic_idosos to set
	 */
	public void setDsc_adap_defic_fisic_idosos(String dsc_adap_defic_fisic_idosos) {
		this.dsc_adap_defic_fisic_idosos = dsc_adap_defic_fisic_idosos;
	}

	/**
	 * @param dsc_equipamentos the dsc_equipamentos to set
	 */
	public void setDsc_equipamentos(String dsc_equipamentos) {
		this.dsc_equipamentos = dsc_equipamentos;
	}

	/**
	 * @param dsc_medicamentos the dsc_medicamentos to set
	 */
	public void setDsc_medicamentos(String dsc_medicamentos) {
		this.dsc_medicamentos = dsc_medicamentos;
	}

}
