package menuProdutos;

import java.util.Scanner;



public class Main {

		private static String Sair;
	    private static String cor;
		private static double valorCombustivel;
		private static int capacidadeTanque;
		private static String modelo;
		private static Scanner ler;

	public static  void main(String[] args) { 	


	System.out.println("|===========================================================|");
	System.out.println("|-----------Painel operacional da Concessionária------------|");
	System.out.println("|---Segue abaixo todos os veículos disponíveis em estoque---|");
	System.out.println("|===========================================================|");
	Carro carro1 = new Carro();
	
	     carro1.setCor("|--------------------------Azul-----------------------------|");
	  carro1.setModelo("|----------------------BMW Série 3--------------------------|"); 
	  System.out.println("|===========================================================|");
	  carro1.setCapacidadeTanque(59);
	
	System.out.println(carro1.getModelo());
	System.out.println(carro1.getCor());
	System.out.println("Capacidade do Tanque:");
	System.out.println(carro1.getCapacidadeTanque());
	System.out.println("Valor do tanque cheio:");
	System.out.println(carro1.totalValorTanque(valorCombustivel=6.46));
	
	System.out.println("|===========================================================|");
	Carro carro2 = new Carro
   (cor="|--------------------------Cinza----------------------------|", 
 modelo="|------------------Mercedes-Benz Classe C-------------------|",
 capacidadeTanque=66);
	
    System.out.println(carro2.getModelo());
	System.out.println(carro2.getCor());
	System.out.println("Capacidade do Tanque:");
	System.out.println(carro2.getCapacidadeTanque());
	System.out.println("Valor do tanque cheio:");
	System.out.println(carro2.totalValorTanque(valorCombustivel=6.46));
	System.out.println("|===========================================================|");
	
	
	
	

	

	System.out.println("Tecle Sair para fechar o Console");
	
	 ler = new Scanner(System.in);
	
	 Sair = ler.next();
	 
	 
			switch(Sair) {
			case "Sair":
		        System.out.print("Sessão encerrada com sucesso");
				System.exit(0);
				
			
				
		}

			}
		

	 }
	
			
	
	







