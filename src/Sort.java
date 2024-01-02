import java.util.Arrays;

public class Sort<T> {
    private Object[] elements;
    private int size;

    public Sort() {
        this.elements = new Object[16];
        this.size = 0;
    }

    public void addElement(T element) {
        sizeIncrease();
        elements[size++] = element;
    }

    public void removeElement(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                removeIndex(i);
                return;
            }
        }
    }

    private void removeIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void contains(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return;
            }
        }
    }

    public void clear() {
        elements = new Object[16];
        size = 0;
    }

    private void sizeIncrease() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}
