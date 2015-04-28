import java.util.Scanner;


public class VetoreMatriz {
public static void main(String[] args) {
	{
		Scanner entrada = new Scanner(System.in);
		int tamanho;
		loopPrincipal:
		do{
			System.out.println("Informe o tamanho (n) do vetor: ");
		    tamanho = entrada.nextInt();
		}
		while( 5 >= tamanho && tamanho >= 10);
		
		int vetor[] = new int[tamanho];
		
		int valor;
		for(int i = 0; i <tamanho; i++){
			System.out.println("Informe o valor do vetor[" + i +"]: ");
			valor = entrada.nextInt();
			vetor[i] = valor;
			
		}
		
		int matrizG[][] = new int[tamanho][tamanho];
		int matrizF[][] = new int[tamanho][tamanho];
		
		for(int i = 0; i < tamanho; i++){
			for(int j = 0; j< tamanho; j++){
				matrizG[i][j] = vetor[i] * vetor[j];
			}
		}
		
		for(int i = 0; i < tamanho; i++){
			for(int j = 0; j< tamanho; j++){
				matrizF[i][j] = vetor[i]+vetor[j];
			}
		}
		
		int erros[] = new int[tamanho*tamanho];
		
		for(int i = 0; i < tamanho; i++){
			for(int j = 0; j< tamanho; j++){
				erros[i] = matrizF[i][j]-matrizG[i][j];
			}
		}
		
		int erroMaximo = 0;
		for(int i = 0; i<tamanho; i++){
			if(erros[i] < erroMaximo){
				erroMaximo = erros[i];
			}
		}
		
		entrada.close();
	}
}
}
