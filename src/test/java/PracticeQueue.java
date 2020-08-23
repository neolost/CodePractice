import java.util.Queue;

public class PracticeQueue {

    private int maxSize; // initializes the set number of slats
    private long[] queArray; // slats to main the data
    private int front; // this will be the index position for the element in the front
    private int rear; // going to be the index position for the element at the back of the line
    private int nItems; // counter to maintain the number of items in our queue

    public PracticeQueue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; // index position of the first slot of the array
        rear = -1; // there is no item in the array yet to be considered as the last item
        nItems = 0; // we don't have elements in the array yet
    }

    public void insert(long j){
        rear++;
        queArray[rear] = j;
        nItems ++;
    }

    public long remove() {
        long temp = queArray[front];
        front++;
        if(front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void view() {
        System.out.print("[ ");
        for(int i = 0; i < queArray.length; i++){
            System.out.print(queArray[i]+ " ");
        }
        System.out.println("]");
    }

}
