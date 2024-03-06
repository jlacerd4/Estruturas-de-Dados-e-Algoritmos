import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaBinariaTest {

    int[] lista = {1, 3, 5, 7, 9, 11, 13, 15};

    @org.junit.jupiter.api.Test
    void testaElementoInicial() {
        int intAchado = BuscaBinaria.binarySearch(lista, 1, 0, lista.length-1);
        assertEquals(intAchado, 0);
    }

    @org.junit.jupiter.api.Test
    void testaElementfoFinal() {
        int intAchado = BuscaBinaria.binarySearch(lista, 15, 0, lista.length-1);
        assertEquals(intAchado, 7);
    }

    @org.junit.jupiter.api.Test
    void testaMediana() {
        int intAchado = BuscaBinaria.binarySearch(lista, 7, 0, lista.length-1);
        assertEquals(intAchado, 3);
    }

    @org.junit.jupiter.api.Test
    void testaNaoMediana() {
        int intAchado = BuscaBinaria.binarySearch(lista, 9, 0, lista.length-1);
        assertEquals(intAchado, 4);
    }

    @org.junit.jupiter.api.Test
    void testaInexistenteAcima() {
        int intAchado = BuscaBinaria.binarySearch(lista, 21, 0, lista.length-1);
        assertEquals(intAchado, -1);
    }

    @org.junit.jupiter.api.Test
    void testaInexistenteAbaixo() {
        int intAchado = BuscaBinaria.binarySearch(lista, -5, 0, lista.length-1);
        assertEquals(intAchado, -1);
    }

    @Test
    void testeInexistenteDaltonUm() {
        int[] listaDalton  = {3, 5, 8, 10, 12, 18, 20};
        int intAchado = BuscaBinaria.binarySearch(listaDalton, 99, 0, listaDalton.length-1);
        assertEquals(-1, intAchado);
    }

    @Test
    void testeInexistenteDaltonDois() {
        int[] listaDalton  = {3, 5, 8, 10, 12, 18};
        int intAchado = BuscaBinaria.binarySearch(listaDalton, 3, 0, listaDalton.length-1);
        assertEquals(0, intAchado);
    }
}