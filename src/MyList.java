// Файл MyList.java
public class MyList<T> {
    private Object[] array;
    private int size;

    public MyList() {
        array = new Object[10]; // Початковий розмір списку
        size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return (T) array[index];
    }

    public int getSize() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = java.util.Arrays.copyOf(array, newCapacity);
        }
    }
}
