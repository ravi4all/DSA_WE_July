package ArrayProblems;

public class P1_ArrayCRUD {
    int arr[];
    int currentSize;
    public P1_ArrayCRUD(int capacity) {
        this.arr = new int[capacity];
        currentSize = 0;
    }

    void insert(int index, int value) {
        if(index > currentSize) {
            throw new RuntimeException("Index cannot be greater than current size...");
        }

        if(currentSize == arr.length) {
            System.out.println("Array is Full...");
            return;
        }

        for(int i = currentSize - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        currentSize++;
        System.out.println("Element Inserted...");
        print();
    }

    void delete(int index) {
        if(currentSize == 0) {
            System.out.println("Array is Empty..");
            return;
        }
        for(int i = index; i < currentSize-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[currentSize-1] = 0;
        currentSize--;
        System.out.println("Element Removed...");
        print();

    }

    void update(int valueToSearch, int valueToUpdate) {
        
    }

    // Linear Search
    int search(int value) {
        for(int i = 0; i < currentSize; i++) {
            if(arr[i] == value) {
                return i;
            }
        }
        System.out.println("Element not found...");
        return -1;
    }

    void print() {
        for(int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        P1_ArrayCRUD obj = new P1_ArrayCRUD(6);
        obj.insert(0, 10);
        obj.insert(1, 20);
        obj.insert(2, 30);
        obj.insert(3, 15);
        obj.insert(2, 11);
    }
}
