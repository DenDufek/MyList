// Файл Main.java
public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("Елемент 1");
        myList.add("Елемент 2");
        myList.add("Елемент 3");

        System.out.println("Кількість елементів у списку: " + myList.getSize());

        for (int i = 0; i < myList.getSize(); i++) {
            System.out.println("Елемент " + i + ": " + myList.get(i));
        }
    }
}
