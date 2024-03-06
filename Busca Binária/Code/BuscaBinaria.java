import java.util.Scanner;

class BuscaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] valores = sc.nextLine().split(" ");
        int size = valores.length;
        int numBuscado = sc.nextInt();

        sc.close();

        int[] inteiros = new int[size];
        
        for(int i = 0; i < valores.length; i++){
            inteiros[i] = Integer.parseInt(valores[i]);
        }

        int valor = binarySearch(inteiros, numBuscado, 0, size - 1);

        System.out.println(valor);
    }

    public static int binarySearch(int[] lista, int buscado, int left, int right){
        int m = (left + right) / 2;
        if(left > right){
            return -1;
        }
        
        if(buscado == lista[m]){
            return m;
        }

        if(buscado < lista[m]){
            return binarySearch(lista, buscado, left, m-1);
        }

        else {
            return binarySearch(lista, buscado, m+1, right);
        }
    }
}
