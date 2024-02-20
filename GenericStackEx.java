import java.util.*;

class ArrayStack<T> {
    private T[] items;
    private int top;

    public ArrayStack(int size) {
        items = (T[]) new Object[size];
        top = -1;
    }

    public void push(T item) {
        if (top == items.length - 1)
            System.out.println("Stack is full");
        else
            items[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is EmptGenerey");
            return null;
        } else
            return items[top--];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        } else
            return items[top];
    }

    public void display() {
        if (isEmpty())
            System.out.println("Stack is Empty");
        else
            for (int i = top; i >= 0; i--) {
                System.out.println(items[i]);
            }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

class LinkedListStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        private Node<T> next;
        private T data;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedListStack() {
        top = null;
        size = 0;
    }

    public void push(T item) {
        Node<T> node = new Node<T>(item);
        node.next = top;
        top = node;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        } else {
            T item = top.data;
            top = top.next;
            size--;
            return item;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
            } else 
            return top.data;
        }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        } else {
            Node<T> current = top;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

public class GenericStackEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int n = sc.nextInt();

        ArrayStack<Integer> intArstack = new ArrayStack<Integer>(n);
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            intArstack.push(sc.nextInt());
        }

        System.out.println("integer stack size: " + intArstack.size());
        System.out.println("popped item: " + intArstack.pop());
        System.out.println("peek item: " + intArstack.peek());

        LinkedListStack<Integer> intllstack = new LinkedListStack<Integer>();
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            intllstack.push(sc.nextInt());
        }

        intllstack.display();
        System.out.println("integer stack size: " + intllstack.size());
        System.out.println("popped item: " + intllstack.pop());
        System.out.println("peek item: " + intllstack.peek());
    }
}

