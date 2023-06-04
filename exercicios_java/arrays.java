import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int[] arr = {5,8,10,12,5};
	    int[] arr2 = {5,8,10,12,5,8};
	    String[] str = {"Maçã", "Chocolate", "Sushi", "Coca-cola", "Bianca"};
	    char[] c = {'B','I','A','N','C','A'};
	    boolean[] bool = {false,false,false,true,true,true};

        //testes

	}
	
	    //recebe um array de inteiros e imprime-o ao contrário...
	public static void exercicio1(int[] r) {
	    for(int i = r.length-1; i > 0; i--)
	        System.out.print(r[i] + " ");
	}
	
	    //retorna um array com suas posições invertidas...
	public static int[] exercicio2(int[] r) {
	    for(int i = 0; i < r.length/2; i++) {
	        int aux = r[i];
	        r[i] = r[r.length-(i+1)];
	        r[r.length-(i+1)] = aux;
	    }
	   return r;    
	}
	
	    //retorna um novo array apenas com os números pares do array recebido
	public static int[] exercicio3(int[] r) {
	    int count = 0;
	    for(int i : r)
	        if(i % 2 == 0)
    	        count++;
	    
	    int[] newArray = new int[count];
	    int indexNewArray = 0; // criando um novo contador para o novo array senão dá estouro de índice...
	    for(int i = 0; i < r.length; i++)
	        if(r[i] % 2 == 0) {
	            newArray[indexNewArray] = r[i];
	            indexNewArray++;
	        }
	        
	   return newArray;
	}
	
	public static int exercicio4(String[] r, String x) {
	    // retorna a posição da string no array ou length-1
	    for(int i = 0; i < r.length; i++)
	        if(r[i].equalsIgnoreCase(x)) {
	            return i;
	        }
	        
	        return -1;
	}
	
	    //trasforma true para 1 e false para 0, em um novo array
	public static int[] exercicio5(boolean[] r) {
	    int[] newArray = new int[r.length];
	    for(int i = 0; i < r.length; i++)
	        if(r[i] == true)
	            newArray[i] = 1;
	        else
	            newArray[i] = 0;
	            
	     return newArray;
	}
	
	    // retorna um novo array com todos os elementos do array passados por parâmetro...
	public static int[] exercicio6(int[] r, int[] rr) {
	    int[] newArray = new int[r.length + rr.length];
	    int contador = 0;
	    
	    for(int i : r) {
	        newArray[contador] = i;
	        contador++;
	    }
	    
	    for(int i : rr) {
	        newArray[contador] = i;
	        contador++;
	    }
	        
	    return newArray;
	}
	
	   	// junta os 2 arrays passados por parâmetro e um terceiro array, organizando primeiro os números negativos e depois os positivos...
	public static int[] exercicio7(int[] r, int[] rr) {
	   	
	   	// contaando positivos e negativos
	   	int contadorPositivos = 0;
	   	int contadorNegativos = 0;
	   	
	    for(int i : r){
	        if(i < 0)
	            contadorNegativos++;
	        else
	            contadorPositivos++;
	    }
	    
	    for(int i : rr){
	        if(i < 0)
	            contadorNegativos++;
	        else
	            contadorPositivos++;
	    }
	    
	    // definindo tamanho do array final, onde começa os negativos e onde começa os positivos
	    int[] newArray = new int[contadorPositivos+contadorNegativos];
	    int indexNegativos = 0;
	    int indexPositivos = contadorNegativos;
	    
	    for(int i : r) {
	        if(i < 0) {
	            newArray[indexNegativos] = i;
	            indexNegativos++;
	        } else {
	            newArray[indexPositivos] = i;
	            indexPositivos++;
	        }
	    }
	    
	    for(int i : rr) {
	        if(i < 0) {
	            newArray[indexNegativos] = i;
	            indexNegativos++;
	        } else {
	            newArray[indexPositivos] = i;
	            indexPositivos++;
	        }
	    }
	    
	   return newArray;
	}
	
	    // devolve a média dos números do array...
	public static double exercicio8(int[] r) {
	    double sum = 0;
	    for(int i : r) 
	        sum += i;

	   return sum / r.length;
	}
	
	    // devolve a média dos números pares do array...
	public static double exercicio9(int[] r) {
	    double sum = 0;
	    int contador = 0;
	    for(int i : r)
	        if(i % 2 == 0) {
	          sum += i; 
	          contador++;
	        }

	   return sum / contador;
	}
	
	    // retorna o maior do array...
	public static int exercicio10(int[] r) {
	    int maior = r[0];
	    for(int i : r)
	        if(i > maior)
	            maior = i;
	            
	   return maior;
	}
	
	    // retorna o menor do array...
	public static int exercicio11(int[] r) {
	    int menor = r[0];
	    for(int i : r)
	        if(i < menor)
	            menor = i;
	            
	   return menor;
	}
	
	    // retorna se os arrays são iguais ou não
	public static boolean exercicio12(int[] r, int[] rr) {
	  if(r.length != rr.length)
	    return false;
	    
	  for(int i = 0; i < r.length; i++)
	        if(r[i] != rr[i])
	            return false;

	  return true;
	}
	
	    // devolve uma string a partir de um array de char
	public static String exercicio13(char[] c) {
	    String str = "";
	    for(int i = 0; i < c.length; i++)
	        str += c[i];
	   
	   return str;
	}
	
	    // recebe um inteiro e retorna um array de String preenchido com valores recebidos via Teclado. 
	public static String[] exercicio14(int x) {
	    String[] arrayStrings = new String[x];
	    Scanner input = new Scanner(System.in);
	    for(int i = 0; i < arrayStrings.length; i++) {
	        System.out.println("Digite a " + i + "ª string: ");
	        arrayStrings[i] = input.nextLine();
	    }
	        
	   return arrayStrings;
	}
	
	    //recebe um array de String e um inteiro x. 
	    //Este método exclui (se possível) o elemento da posição, “tapando o buraco” que
        //eventualmente possa ter ficado no array. Este método retorna o array sem o elemento da posição x.
	public static String[] exercicio15(String[] str, int x) {
        
        for(int i = 0; i < str.length; i++)
            if(i == x) {
                str[i] = null;
                break;
            }
            
        return str;
	}

    
        //Crie um método que criará um array de nomes (do tipo String). No seu método, solicite ao 
        //usuário (pelo teclado) a quantidade de nomes a serem inseridos. Em seguida crie um array de String para 
        //armazenar estes nomes. Depois, solicite que o usuário digite cada um dos nomes e guarde-os no array. 
        //Após, seu método deve apresentar o conteúdo do array em uma mensagem na tela com o seguinte formato: 
        //  Dados informados: joao, jose, pedro, maria e paulo.
     public static String exercicio16() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de nomes a informar: ");
        String[] r = new String[input.nextInt()];
        for(int i = 0; i < r.length; i++) {
            input = new Scanner(System.in);
            System.out.println("Digite o " + (i+1) + "ª nome: ");
            r[i] = input.nextLine();
        }
     
        String dados = "";
        for(int i = 0; i < r.length; i++) {
            if(i != r.length-1 && i != r.length-2)
                dados += (r[i] + ", ");
            else if(i == r.length-2)
                dados += (r[i] + " e ");
            else if(i == r.length-1)
                dados += (r[i] + ".");
        }
        
        return "Dados informados: " + dados;
    }
}