package felipepaulodesouza.utfpr.edu.correcaosolo.maven;

public class Fosfatagem extends CorrecaoSolo{
	
	private double metaFosforo;
	private double fonteFosforo;
	private double valFonteFosforo;
	private double teorFonteFosforo;
	private static double eficFosforo;
	
	
	public Fosfatagem() {
		


	}
	public double apliPHa() {
		return ((((getMetaFosforo()-getFosforo())*2.29*2*100))/getEficFosforo()*100)/getTeorFonteFosforo();
		}
	
	
	public double apliPAlq() {
		return apliPHa()*2.42;
		}
	
	public double custoAlq() {
		return getValFonteFosforo()*(apliPAlq()/1000);
		}
	public double custoHa() {
		return custoAlq()/2.42;
		}
	
	public double custoTotalHa() {
		return custoHa()*getAreaTalhao();
		}
	
	
	
	
	
	public double getMetaFosforo() {
		return metaFosforo;
	}
	public void setMetaFosforo(double metaFosforo) {
		this.metaFosforo = metaFosforo;
	}
	

	public double getFonteFosforo() {
		return fonteFosforo;
	}
	public void setFonteFosforo(double fonteFosforo) {
		this.fonteFosforo = fonteFosforo;
	}
	public double getValFonteFosforo() {
		return valFonteFosforo;
	}
	public void setValFonteFosforo(double valFonteFosforo) {
		this.valFonteFosforo = valFonteFosforo;
	}
	public double getTeorFonteFosforo() {
		return teorFonteFosforo;
	}
	public void setTeorFonteFosforo(double teorFonteFosforo) {
		this.teorFonteFosforo = teorFonteFosforo;
	}
	public static double getEficFosforo() {
		return eficFosforo;
	}
	public static void setEficFosforo(double eficFosforo) {
		Fosfatagem.eficFosforo = eficFosforo;
	}
	
	
	
}
