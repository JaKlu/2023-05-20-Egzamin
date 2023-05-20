package pl.camp.it.egzamin.zadanie01;

/**
 * Kucharz dostał na urodziny dwa kosze owoców.
 * W pierwszym koszu jest J jabłek, w drugim P pomarańczy.
 * Kucharz lubi pomarańcze i jabłka tak samo bardzo dlatego chciałby mieć ich po równo.
 * Każde jabłko i każda pomarańcza kosztuje 1 złotą monetę. Kucharz ma Z monet.
 * <p>
 * Napisz program, który na wejściu dostaje trzy liczby:
 * J P Z (ilość jabłek, ilość pomarańczy, ilość złotych monet).
 * Program ma wypisywać jaka jest minimalna możliwa różnica między ilością jabłek i pomarańczy po zakupie owoców.
 * Kucharz jest bardzo łakomy więc zawsze wydaje wszystkie monety na zakupach.
 * <p>
 * Przykłady:
 * Wejście: 1 3 1
 * Wyjście:
 * Minimalna różnica: 1
 * Ilość jabłek: 2
 * Ilość pomarańczy: 3
 * Wejście: 5 3 3
 * Wyjście:
 * Minimalna różnica: 1
 * Ilość jabłek: 6
 * Ilość pomarańczy: 5
 * Wejście: 1 10 20
 * Wyjście:
 * Minimalna różnica: 1
 * Ilość jabłek: 16
 * Ilość pomarańczy: 15
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(chefInShop(1, 3, 1));
        System.out.println("-".repeat(20));
        System.out.println(chefInShop(5, 3, 3));
        System.out.println("-".repeat(20));
        System.out.println(chefInShop(1, 10, 20));
    }

    public static int chefInShop(int apples, int oranges, int coins) {
        if (coins == 0) {
            System.out.println("Ilość jabłek: " + apples);
            System.out.println("Ilość pomarańczy: " + oranges);
            System.out.print("Minimalna różnica: ");
            return Math.abs(apples - oranges);
        }
        if (apples <= oranges) {
            return chefInShop(apples + 1, oranges, coins - 1);
        } else {
            return chefInShop(apples, oranges + 1, coins - 1);
        }
    }
}
