package felipepaulodesouza.utfpr.edu.correcaosolo.maven;

public class Fosfatagem extends CorrecaoSolo {
	
	private double metaFosforo;
	private double fonteFosforo;
	private double valFonteFosforo;
	private double teorFonteFosforo;
	private static double eficFosforo;
	
	
	public Fosfatagem() {
		
		
	}
	//quanto aplicar, em toneladas, a quantidade de fosforo necessário por Hectare
	
	public double calcularFosforoPorHectare(
			double idealFosforo,
			double fosforo,
			double eficFosforo,
			double teorFonteFosforo) {
		
		return ((((idealFosforo-fosforo)*2.29*2*100))/eficFosforo*100)/teorFonteFosforo;
		
		}
	
	
	public double calcularFosforoPorAlquere(
			double idealFosforo,
			double fosforo,
			double eficFosforo,
			double teorFonteFosforo) {
		
		return calcularFosforoPorHectare(idealFosforo,fosforo, eficFosforo,teorFonteFosforo )*2.42;
		
		}
	
	public double custoFosforoPorAlqueire(
			double idealFosforo,
			double fosforo,
			double eficFosforo,
			double teorFonteFosforo,
			double valFonteFosforo) {
		
		return valFonteFosforo*(calcularFosforoPorAlquere(idealFosforo,fosforo, eficFosforo,teorFonteFosforo)/1000);
		
		}
	
	public double custoFosforoPorHectare(
			double idealFosforo,
			double fosforo,
			double eficFosforo,
			double teorFonteFosforo,
			double valFonteFosforo) {
		
		return custoFosforoPorAlqueire(idealFosforo,fosforo,eficFosforo,teorFonteFosforo,valFonteFosforo)/2.42;
		
		}
	
	public double custoTotalHa(
			double idealFosforo,
			double fosforo,
			double eficFosforo,
			double teorFonteFosforo,
			double valFonteFosforo,
			double areaTalhao) {
		
		return custoFosforoPorHectare(idealFosforo,fosforo,eficFosforo,teorFonteFosforo,valFonteFosforo)*areaTalhao;
		
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
