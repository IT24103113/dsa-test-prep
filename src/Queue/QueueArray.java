package Queue;

public class QueueArray {
    private int QueueSize;
    private int[] QueueArray;
    private int rear,front;
    private int nitems;

    public QueueArray(int queueSize) {
        this.QueueSize = queueSize;
        this.QueueArray = new int[queueSize];
        rear=-1;
        front=0;
        nitems=0;
    }

    public void insert(int data) {
        if(nitems==QueueSize) {
            System.out.println("Queue is full");
        } else {
            rear++;
            QueueArray[rear]=data;
            nitems++;
        }
    }


    public int remove() {
        if(nitems==0) {
            return -99;
        } else {
            int poppedvalue = QueueArray[front];
            front++;
            QueueArray[front]=QueueArray[front];
            return poppedvalue;
        }
    }

    public void peekfront() {
        if (nitems == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(QueueArray[front]);
        }
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        queue.insert(4);
        queue.insert(5);
        queue.insert(2);
        queue.insert(1);
        queue.insert(3);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.peekfront();
    }
}
