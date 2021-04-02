package felipepaulodesouza.utfpr.edu.correcaosolo.maven;

public class Potassagem extends CorrecaoSolo{


	private double metaCtcPotassio;
	private double areaTalhao;	
	
	private double valFontePotassio;
	private double teorFontePotassio;
	private double eficPotassio;
	
	
	public Potassagem() {
		
	}
	
	public double metaPotassio() {
		return (getMetaCtcPotassio()*ctc())/100;

		}
	
	public double apliKHa() {
		return (((((metaPotassio()-getPotassio())*391*2*1.2)*100)/getEficPotassio())*100)/getTeorFontePotassio();

		}
	
	public double apliKAl() {
		return apliKHa()*2.49;

		}
	
	public double custoKAlq() {
		return getValFontePotassio()*(apliKAl()/1000);
		}
	public double custoKHa() {
		return custoKAlq()/2.42;
		}
	
	public double custoTotalKHa() {
		return custoKHa()*getAreaTalhao();
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
