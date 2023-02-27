package respostas_bootcamp;
import java.util.Scanner;

public class FabricaCarros {

	public static void main(String[] args) {

		    Scanner leitor = new Scanner(System.in);
	      int custoFabrica = leitor.nextInt();
		    int porcentagemDistribuidor = leitor.nextInt();
		    int PercentualImpostos = leitor.nextInt();

	            int custoConsumidor;
	     
	            int Distribuidor;
	            int ValorImpostos;
	 
	        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:
	        ValorImpostos = (custoFabrica * PercentualImpostos)/100;
	 
	        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
	      
	 
	        System.out.println( custoFabrica+ValorImpostos+Distribuidor);
	}
}

 