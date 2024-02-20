import java.util.*;

public class HeapSort {
    private PriorityQueue<Integer> pq;
    private ArrayList<Integer> sortedList;

    public HeapSort() {
        pq = new PriorityQueue<>(Collections.reverseOrder());
        sortedList = new ArrayList<>();
    }

    public void enqueue(int value) {
        pq.add(value);
    }

    public void dequeue() {
        while (!pq.isEmpty()) {
            sortedList.add(pq.remove());
        }
        System.out.println("Sorted heap: " + sortedList);
    }

    public boolean isEmpty() {
        return pq.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeapSort obj = new HeapSort();
        System.out.println("Enter the number of elements to insert:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            obj.enqueue(sc.nextInt());
        }
        obj.dequeue();
    }
}
