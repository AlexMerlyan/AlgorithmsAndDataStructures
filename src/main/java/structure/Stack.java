package structure;

public class Stack<T> {

    private Entry<T> current;
    private int size = 0;

    public T push(T item) {
        if (current == null) {
            current = new Entry<>(item, null);
        } else {
            current = new Entry<>(item, current);
        }
        size++;
        return item;
    }

    public T pop() {
        if (current == null) {
            System.out.println("Stack is empty");
            return null;
        }
        T item = current.item;
        current = current.previous;
        size--;
        return item;
    }

    public T peek() {
        return current.item;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    private class Entry<E> {

        private E item;
        private Entry<E> previous;

        Entry(E current, Entry<E> previous) {
            this.item = current;
            this.previous = previous;
        }

    }

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            integerStack.push(i);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(integerStack.pop());
        }
    }

}
