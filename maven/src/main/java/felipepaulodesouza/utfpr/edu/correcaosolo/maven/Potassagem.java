package felipepaulodesouza.utfpr.edu.correcaosolo.maven;

public class Potassagem extends CorrecaoSolo{


	private double metaCtcPotassio;
	private double areaTalhao;	
	private double valFontePotassio;
	private double teorFontePotassio;
	private double eficPotassio;
	
	
	public Potassagem() {
		
	}
	//idealPotassio: valor de potássio que se pretende atingir
	public double idealPotassio(
			double metaCtcPotassio,
			double potassio,
			double calcio,
			double magnesio,
			double hidrominio) {
		
		return (metaCtcPotassio*ctc(potassio,calcio,magnesio,hidrominio))/100;

		}
	//quanto aplicar, em toneladas, a quantidade de potássio por Hectare
	public double calcularPotassioPorHectare(
			double metaCtcPotassio,
			double potassio,
			double calcio,
			double magnesio,
			double hidrominio,
			double eficPotassio,
			double teorFontePotassio ) {
		
		return (((((idealPotassio(metaCtcPotassio,potassio,calcio,magnesio,hidrominio)-potassio)*391*2*1.2)*100)/eficPotassio)*100)/teorFontePotassio;

		}
	
	public double calcularPotassioPorAlqueire(
			double metaCtcPotassio,
			double potassio,
			double calcio,
			double magnesio,
			double hidrominio,
			double eficPotassio,
			double teorFontePotassio) {
		
		return calcularPotassioPorHectare(metaCtcPotassio,potassio,calcio,magnesio,hidrominio,eficPotassio,teorFontePotassio)*2.42;

		}
	
	public double custoPotassioPorAlqueire(
			double metaCtcPotassio,
			double potassio,
			double calcio,
			double magnesio,
			double hidrominio,
			double eficPotassio,
			double teorFontePotassio,
			double valFontePotassio) {
		
		return valFontePotassio*(calcularPotassioPorAlqueire(metaCtcPotassio,potassio,calcio,magnesio,hidrominio,eficPotassio,teorFontePotassio)/1000);
		}
	
	public double custoPotassioPorHectare(
			double metaCtcPotassio,
			double potassio,
			double calcio,
			double magnesio,
			double hidrominio,
			double eficPotassio,
			double teorFontePotassio,
			double valFontePotassio) {
		return custoPotassioPorAlqueire(metaCtcPotassio,potassio,calcio,magnesio,hidrominio,eficPotassio,teorFontePotassio,valFontePotassio)/2.42;
		}
	
	public double custoTotalKHa(
			double metaCtcPotassio,
			double potassio,
			double calcio,
			double magnesio,
			double hidrominio,
			double eficPotassio,
			double teorFontePotassio,
			double valFontePotassio,
			double areaTalhao) {
		return custoPotassioPorHectare(metaCtcPotassio,potassio,calcio,magnesio,hidrominio,eficPotassio,teorFontePotassio,valFontePotassio)*areaTalhao;
		}


	


	public double getAreaTalhao() {
		return areaTalhao;
	}


	public void setAreaTalhao(double areaTalhao) {
		this.areaTalhao = areaTalhao;
	}


	public double getValFontePotassio() {
		return valFontePotassio;
	}


	public void setValFontePotassio(double valFontePotassio) {
		this.valFontePotassio = valFontePotassio;
	}


	public double getTeorFontePotassio() {
		return teorFontePotassio;
	}


	public void setTeorFontePotassio(double teorFontePotassio) {
		this.teorFontePotassio = teorFontePotassio;
	}



	public double getMetaCtcPotassio() {
		return metaCtcPotassio;
	}

	public void setMetaCtcPotassio(double metaCtcPotassio) {
		this.metaCtcPotassio = metaCtcPotassio;
	}

	public double getEficPotassio() {
		return eficPotassio;
	}

	public void setEficPotassio(double eficPotassio) {
		this.eficPotassio = eficPotassio;
	}
	
	



}
