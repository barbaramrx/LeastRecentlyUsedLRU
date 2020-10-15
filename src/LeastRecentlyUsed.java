// Java program for page replacement algorithms 

import java.util.Scanner;
import java.util.ArrayList;

public class LeastRecentlyUsed { 
    public static void main(String[] args) { 
        int tam = 3;
        int contador = 0;
        int faults = 0;
        int i = 0;
        
        ArrayList<Integer> lista = new ArrayList<>(tam); 
        Scanner in = new Scanner(System.in);
        
        // a variavel X representa a quantidade de paginas para o teste do algoritmo
        System.out.println("Insira a quantidade de paginas:");
        int x = in.nextInt();
        
        // cria um array de tamanho X para alocar os valores das paginas
        int paginas[] = new int[x];
        
        System.out.println("\nInsira os valores das paginas:");
        
        // laco de X iteracoes com os valores das paginas
        for (i = 0; i < x; i++) {
        	int num = in.nextInt();
        	paginas[i] = num;
        }

        // itera pelo array de paginas
        for(int j:paginas)
        { 
        	// insere na lista um numero que nao esta presente
            if(!lista.contains(j)) 
            { 
              
            // checa se ha paginas iguais 
            if(lista.size() == tam) 
            { 
            	lista.remove(0); 
            	lista.add(tam-1, j); 
            } 
            else
            	lista.add(contador, j); 
            	faults++; 
                contador++; 
            } 
            else
            { 
                // remove a indexacao
            	lista.remove((Object)j); 
                //pega a pagina atual 
            	lista.add(lista.size(),j);          
            } 
        }
        
        System.out.println("\nQuantidade de page faults: "+faults);
    } 
} 