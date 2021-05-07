package felipepaulodesouza.utfpr.edu.correcaosolo.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class teste {

	@Test
	public void test1AplicarPotassioPorHe() {
		 
		
		 
		//Valor de acordo com a planilha

		 assertEquals(450.55, new Potassagem().calcularPotassioPorHectare(3, 0.15, 5.76, 1.63, 5.35, 85, FontesPotassio.CLORETO_DE_POTASSIO.verificaFontePotassio().getValFontePotassio()), 0.1);
		 
	}
	
	@Test
	public void test2CustoTotalPotassio() {
		 
		 
		//Valor de acordo com a planilha

		 assertEquals(5451.61, new Potassagem().custoTotalKHa(3, 0.15, 5.76, 1.63, 5.35, 85, 58, 2500, 4.84), 0.1);
		 
	}
	
	@Test
	public void test3AplicarFosforoPorHe() {
		 
		 
		 //Valor de acordo com a planilha

		 assertEquals(1017.78, new Fosfatagem().calcularFosforoPorHectare(12, 4, 20, 18), 0.1);
		
	 }
	@Test
	public void test4CustoTotalFosforo() {
		
		 
		 //Valor de acordo com a planilha

		 assertEquals(3445.76, new Fosfatagem().custoTotalHa(12, 4, 20, 18, 699.5, 4.84), 0.1);
		
	 }
	 
	 

}
