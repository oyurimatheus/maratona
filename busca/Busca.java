
public class Busca {

    public static void main(String[] args) {

        int[] vetor = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

         System.out.println("Deve retornar TRUE na busca sequencial com vetor desordenado: " +
                buscaSequencial(vetor, 5));
         System.out.println("Deve retornar FALSE na busca sequencial com vetor desordenado: " +
                buscaSequencial(vetor, 11));
        System.out.println("Deve retornar TRUE na busca binaria com vetor ordenado: " +
                buscaBinaria(vetor, 9));
        System.out.println("Deve retornar FALSE na busca binaria com vetor ordenado: " +
                buscaBinaria(vetor, 11));
         System.out.println("Deve retornar TRUE na busca binaria recursiva com vetor ordenado: " +
                buscaBinariaRecursiva(vetor, 9, 0, vetor.length));
         System.out.println("Deve retornar FALSE na busca binaria recursiva com vetor ordenado: " +
                buscaBinariaRecursiva(vetor, 11, 0, vetor.length));

    }

    private static boolean buscaSequencial(int[] vetor, int num) {
        for (int i:  vetor) {
            if (i ==  num) return true;
        }
        return false;
    }

    private static boolean buscaBinaria(int[] vetor, int num) {
        int inicio = 0;
        int fim = vetor.length;
        int meio = (inicio + fim) / 2;

        if (vetor[meio] == num) return true;
        if (vetor[meio] > num) {
            for (int i = inicio; i < meio; i++) {
                if(vetor[i] == num) return true;
            }
        }
        if (vetor[meio] < num) {
            for (int i = meio; i < fim; i++) {
                if (vetor[i] == num) return true;
            }
        }
        return false;
    }

    private static boolean buscaBinariaRecursiva(int[] vetor, int num, int inicio, int fim) {
        int meio = (inicio + fim) / 2;

        if (inicio >= fim) return false;
        if (vetor[meio] == num) return true;
        if (vetor[meio] > num) return buscaBinariaRecursiva(vetor, num, inicio, meio - 1);
        return buscaBinariaRecursiva(vetor, num, meio + 1, fim);
    }


}