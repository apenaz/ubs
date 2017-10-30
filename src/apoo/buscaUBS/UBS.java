/**
 * 
 */
package apoo.buscaUBS;

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

	public double getVlr_latitude() {
		return vlr_latitude;
	}

	public void setVlr_latitude(double vlr_latitude) {
		this.vlr_latitude = vlr_latitude;
	}

	public double getVlr_longitude() {
		return vlr_longitude;
	}

	public void setVlr_longitude(double vlr_longitude) {
		this.vlr_longitude = vlr_longitude;
	}

	public int getCod_munic() {
		return cod_munic;
	}

	public void setCod_munic(int cod_munic) {
		this.cod_munic = cod_munic;
	}

	public int getCod_cnes() {
		return cod_cnes;
	}

	public void setCod_cnes(int cod_cnes) {
		this.cod_cnes = cod_cnes;
	}

	public String getNom_estab() {
		return nom_estab;
	}

	public void setNom_estab(String nom_estab) {
		this.nom_estab = nom_estab;
	}

	public String getDsc_endereco() {
		return dsc_endereco;
	}

	public void setDsc_endereco(String dsc_endereco) {
		this.dsc_endereco = dsc_endereco;
	}

	public String getDsc_bairro() {
		return dsc_bairro;
	}

	public void setDsc_bairro(String dsc_bairro) {
		this.dsc_bairro = dsc_bairro;
	}

	public String getDsc_cidade() {
		return dsc_cidade;
	}

	public void setDsc_cidade(String dsc_cidade) {
		this.dsc_cidade = dsc_cidade;
	}

	public String getDsc_telefone() {
		return dsc_telefone;
	}

	public void setDsc_telefone(String dsc_telefone) {
		this.dsc_telefone = dsc_telefone;
	}

	public String getDsc_estrut_fisic_ambiencia() {
		return dsc_estrut_fisic_ambiencia;
	}

	public void setDsc_estrut_fisic_ambiencia(String dsc_estrut_fisic_ambiencia) {
		this.dsc_estrut_fisic_ambiencia = dsc_estrut_fisic_ambiencia;
	}

	public String getDsc_adap_defic_fisic_idosos() {
		return dsc_adap_defic_fisic_idosos;
	}

	public void setDsc_adap_defic_fisic_idosos(String dsc_adap_defic_fisic_idosos) {
		this.dsc_adap_defic_fisic_idosos = dsc_adap_defic_fisic_idosos;
	}

	public String getDsc_equipamentos() {
		return dsc_equipamentos;
	}

	public void setDsc_equipamentos(String dsc_equipamentos) {
		this.dsc_equipamentos = dsc_equipamentos;
	}

	public String getDsc_medicamentos() {
		return dsc_medicamentos;
	}

	public void setDsc_medicamentos(String dsc_medicamentos) {
		this.dsc_medicamentos = dsc_medicamentos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object arg0) {

		return super.equals(arg0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ubs: %s, CNES: %d,\n" + "Endereço:%s, %s, %s\n" + "Telefone: %s", nom_estab, cod_cnes,
				dsc_endereco, dsc_bairro, dsc_cidade, dsc_telefone);
	}

}
