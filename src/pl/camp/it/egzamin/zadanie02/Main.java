package pl.camp.it.egzamin.zadanie02;

import pl.camp.it.egzamin.zadanie02.model.BinaryTree;

/**
 * Stwórz drzewo binarne liczb w którym liczby większe są po prawej stronie, a mniejsze po lewej.
 * Należy stworzyć klasę Tree która posiada referencję do węzła będącego korzeniem.
 * Do reprezentacji węzła stwórz klasę Node.
 * Klasa Tree powinna mieć metody
 * <p>
 * add(int value), która dodaje element do drzewa,
 * contains(int value), która sprawdza czy w drzewie znajduje się dana wartość,
 * max(), która zwraca największą liczbę w drzewie oraz
 * min(), która zwraca najmniejszą liczbę w drzewie.
 * <p>
 * Klasa Node może zawierać dowolne metody potrzebne do rozwiązania,
 * można tworzyć dowolną ilość innych klas w ramach potrzeb.
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(7);
        tree.add(9);
        tree.add(11);
        tree.add(123);
        tree.add(-7);
        tree.add(18);

        tree.add(56);

        tree.add(56);

        tree.add(71);
        tree.add(85);
        tree.add(76);

        System.out.println(tree.contains(152));
        System.out.println(tree.min());
        System.out.println(tree.max());

    }
}
