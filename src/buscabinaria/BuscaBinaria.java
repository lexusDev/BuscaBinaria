package buscabinaria;

import java.util.Scanner;

public class BuscaBinaria {

    public static void main(String[] args) {
        int n=10, np, inicio, fim, meio, pos=-1;
        int vetor[] = new int[n];
        boolean achou=false;
        
        try (Scanner entrada = new Scanner(System.in)){
            for (int i = 0; i < n; i++) {
                System.out.println("Digite o "+ (i+1) +"° número:");
                vetor[i] = entrada.nextInt();
            }
            System.out.println();
            System.out.print("Entre com o número que deseja procurar: ");
            np = entrada.nextInt();
        }
        
        inicio = 0;
        fim = n;
        meio= (inicio+fim)/2;
        int i=0;
        int achouNumero=0;
        
        while(inicio <= fim && achou == false){
            
            if(vetor[meio] == np){
                achou = true;
                achouNumero = meio;   
            }
            else if(np > vetor[meio])
                inicio = meio + 1;
            else
                fim = meio -1;
                
            meio= (inicio+fim)/2;
        }
        
        if (achou) 
            System.out.println("O indice achado é: "+ achouNumero);
        else
            System.out.println("O numero não foi encontrado!!!");

    }
}
