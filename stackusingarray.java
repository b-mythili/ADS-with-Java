class stackusingarray<T> {
    private Object[] array;
    private int top;
    private int capacity;

    public stackusingarray(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
        top = -1;
    }

    public void push(T element) {
        if (top == capacity - 1) {
            System.out.println("stack overflow");
            return;
        }
        array[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("stack underflow");
            return null;
        }
        return (T) array[top--];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("stack empty");
            return null;
        }
        return (T) array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
