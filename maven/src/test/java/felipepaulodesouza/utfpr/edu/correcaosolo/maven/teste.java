package felipepaulodesouza.utfpr.edu.correcaosolo.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class teste {

	@Test
	public void test() {
		 Potassagem a = new Potassagem();
		 try {
			 a.setAluminio(0);
			 a.setCalcio(5.76);
			 a.setEnxofre(3.67);
			 a.setFosforo(4);
			 a.setHidrominio(5.35);
			 a.setMagnesio(1.63);
			 a.setPotassio(0.15);
			 a.setAreaTalhao(4.84);
			 
			 
			 

			 a.setMetaCtcPotassio(3);
			 a.setTeorFontePotassio(58);
			 a.setEficPotassio(85);
			 a.setValFontePotassio(2500);
			 
		
			 
			 a.ctc();
			 a.metaPotassio();
			 a.apliKHa();
				
				
				
				System.out.println();

		 } catch (Exception ex) {
		 System.out.println(ex.getMessage());
		 }
		 
		 //Valor na planilha 440.55, valor teórico 450.54, verificar erro?

		 assertEquals(440.55, a.apliKHa(), 0.1);
		 
	}
	
	@Test
	public void test1() {
		 Potassagem b = new Potassagem();
		 try {
			 b.setAluminio(0);
			 b.setCalcio(5.76);
			 b.setEnxofre(3.67);
			 b.setFosforo(4);
			 b.setHidrominio(5.35);
			 b.setMagnesio(1.63);
			 b.setPotassio(0.15);
			 b.setAreaTalhao(4.84);
			 
			 
			 

			 b.setMetaCtcPotassio(3);
			 b.setTeorFontePotassio(58);
			 b.setEficPotassio(85);
			 b.setValFontePotassio(2500);
			 
		
			 
			 b.ctc();
			 b.metaPotassio();
			 b.apliKHa();
				
				
				
				System.out.println();

		 } catch (Exception ex) {
		 System.out.println(ex.getMessage());
		 }
		 
		 //Valor na planilha 5421.61, valor teórico 5609.30, verificar erro?

		 assertEquals(5451.61, b.custoTotalKHa(), 0.1);
		 
	}
	
	@Test
	public void test2() {
		 Fosfatagem c = new Fosfatagem();
		 try {
			 c.setAluminio(0);
			 c.setCalcio(5.76);
			 c.setEnxofre(3.67);
			 c.setFosforo(4);
			 c.setHidrominio(5.35);
			 c.setMagnesio(1.63);
			 c.setPotassio(0.15);
			 c.setAreaTalhao(4.84);
			 
			 
			 

			 c.setMetaFosforo(12);
			 c.setTeorFonteFosforo(18);
			 c.setEficFosforo(20);
			 c.setValFonteFosforo(699.5);
			 
		
			 
			
						

		 } catch (Exception ex) {
		 System.out.println(ex.getMessage());
		 }
		 
		 //Valor de acordo com a planilha

		 assertEquals(1017.78, c.apliPHa(), 0.1);
		
	 }
	@Test
	public void test3() {
		 Fosfatagem d = new Fosfatagem();
		 try {
			 d.setAluminio(0);
			 d.setCalcio(5.76);
			 d.setEnxofre(3.67);
			 d.setFosforo(4);
			 d.setHidrominio(5.35);
			 d.setMagnesio(1.63);
			 d.setPotassio(0.15);
			 d.setAreaTalhao(4.84);
			 
			 
			 

			 d.setMetaFosforo(12);
			 d.setTeorFonteFosforo(18);
			 d.setEficFosforo(20);
			 d.setValFonteFosforo(699.5);
			 
			 d.custoAlq();
			 d.custoHa();
			 
		
			 
			
						

		 } catch (Exception ex) {
		 System.out.println(ex.getMessage());
		 }
		 
		 //Valor de acordo com a planilha

		 assertEquals(3445.76, d.custoTotalHa(), 0.1);
		
	 }
	 
	 

}
