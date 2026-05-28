package Day9;

public class QueueImplementation {
    int front=-1;
    int rear=-1;
    int arr[] = new int[5];
    void en(int data) {
        if(rear==arr.length-1) {
            System.out.println("Queue is full");
        }
        if(front==-1) {
            front = 0;
        }
        rear++;
        arr[rear]=data;
        System.out.println(arr[rear]+ " ->Inserted.");
    }
    void de() {
        if(front==-1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(arr[front]+ " ->Deleted.");
        front++;
    }
    void peek() {
        if(front==-1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(arr[front]+ " -> is peal value.");
    }
    void display() {
        if(front==-1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++) {
            if(arr[i]==arr[rear]) {
                System.out.print(arr[i]);
            } else
                System.out.print(arr[i]+ " ->");
        }
    }
    public static void main(String[] args) {
        QueueImplementation ob = new QueueImplementation();
        ob.en(78);
        ob.en(98);
        ob.en(213);
        // ob.de();
        // ob.de();
        // ob.peek();
        ob.display();
    }
}
