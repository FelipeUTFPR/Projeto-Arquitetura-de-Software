package felipepaulodesouza.utfpr.edu.correcaosolo.maven;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CorrecaoSolo {
	private double Fosforo;
	private double potassio;
	private double calcio;
	private double magnesio;
	private double enxofre;
	private double aluminio;
	private double hidrominio;
	private double matOrganica;
	private double areaTalhao;
	private int texSolo;
	
	
	public CorrecaoSolo() {
		


	}
	
	
	
	public double somaBase() {
		return getPotassio() + getCalcio() + getMagnesio();
		
		}
	
	public double ctc() {
		return somaBase() + getHidrominio();
		
		}
	
	public double ctck() {
		return potassio/ctc();
		}
	
	public double satBaseV() {
		return (somaBase()/ctc())*100;
		
		}
	
	public double moCento() {
		return getMatOrganica()/10;
		
		}
	public double carbono() {
		return getMatOrganica()/1.72;
		
		}
	
	public void mostrarValores() {
		
		String classSatBase= " ";
		String classCtc = "";
		String classMo = "";
		String classSomBase = "";
		String classSolo="";
		NumberFormat df = new DecimalFormat("###,##0.00");
		
		
		//Classificação SB
		
if(somaBase() < 2.0) {
			
	classSomBase = "Baixo";
			
		}else
			if(satBaseV()>=2.0 && satBaseV()<= 5.0){
				classSomBase = "Médio";
				
			}else
				classSomBase = "Alto";
				
		
		 System.out.println("Soma das Bases:" + df.format(somaBase()) + "cmol/dm³\nClassificação:" + classSomBase+"\n");
		 
		 //Classificação Saturação Base
		
		if(satBaseV() < 50) {
			
			classSatBase = "Baixo";
			
		}else
			if(satBaseV()>=50 && satBaseV()<= 70){
				classSatBase = "Médio";
				
			}else
				classSatBase = "Alto";
				
		
		 System.out.println("Saturação em Base:" + df.format(satBaseV()) + "%\nClassificação:" + classSatBase+"\n");
		 
		 //Classificação CTC
		 
		 
		 if(ctc() < 4.5) {
				
			 classCtc = "Baixo";
				
			}else
				if(satBaseV()>=4.5 && satBaseV()<= 10){
					classCtc = "Médio";
					
				}else
					classCtc = "Alto";
		 
		 
		 System.out.println("CTC:" + df.format(ctc()) + "cmol/dm³\nClassificação:" + classCtc+"\n");
		 
		 //Classificação M.O.
		 
		 if(moCento() < 1.5) {
				
			 classMo = "Baixo";
				
			}else
				if(satBaseV()>=1.5 && satBaseV()<= 3.0){
					classMo = "Médio";
					
				}else
					classMo = "Alto";
		 
		 
		 
		 //% Matéria Orgânica
		 System.out.println("% de matéria orgânica:" + df.format(moCento()) + "%\nclassificação:" + classMo+"\n");
		 
         //Valor Orgânico
		 
		 System.out.println("Carbono:" + df.format(carbono()) + "cmol/dm³\n");
		 
		 //Valor Ideal conforme o tipo de Solo
		 
		 if(getTexSolo() == 1) {
				
				classSolo = "Valor Ideal = Fosforo: 9.0; Potássio: 0.35; Cálcio: 6.0; Magnésio: 1.5; Enxofre: 9.0; Aluminio: 0.0";
				
			}
		 
		 if(getTexSolo() == 2) {
				
				classSolo = "Valor Ideal = Fosforo: 12.0; Potássio: 0.25; Cálcio: 4.0; Magnésio: 1.0; Enxofre: 6.0; Aluminio: 0.0";
				
			}
				
					
				
		 System.out.println(classSolo);
		 
		 	 
	}
		

	public double getPotassio() {
		return potassio;
	}

	public void setPotassio(double potassio) {
		this.potassio = potassio;
	}

	public double getCalcio() {
		return calcio;
	}

	public void setCalcio(double calcio) {
		this.calcio = calcio;
	}

	public double getMagnesio() {
		return magnesio;
	}

	public void setMagnesio(double magnesio) {
		this.magnesio = magnesio;
	}

	public double getEnxofre() {
		return enxofre;
	}

	public void setEnxofre(double enxofre) {
		this.enxofre = enxofre;
	}



	public double getMatOrganica() {
		return matOrganica;
	}

	public void setMatOrganica(double matOrganica) {
		this.matOrganica = matOrganica;
	}



	public double getHidrominio() {
		return hidrominio;
	}



	public void setHidrominio(double hidrominio) {
		this.hidrominio = hidrominio;
	}



	public double getAluminio() {
		return aluminio;
	}



	public void setAluminio(double aluminio) {
		this.aluminio = aluminio;
	}



	public int getTexSolo() {
		return texSolo;
	}



	public void setTexSolo(int texSolo) {
		this.texSolo = texSolo;
	}



	public double getAreaTalhao() {
		return areaTalhao;
	}



	public void setAreaTalhao(double areaTalhao) {
		this.areaTalhao = areaTalhao;
	}



	public double getFosforo() {
		return Fosforo;
	}



	public void setFosforo(double fosforo) {
		Fosforo = fosforo;
	}
	
	

}
