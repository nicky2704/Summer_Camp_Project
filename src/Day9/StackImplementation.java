package Day9;

public class StackImplementation {
    int[] arr = new int[5]; //initiate Array
    int top=-1;
    void isFull() { 
        if(top==arr.length-1) {
            System.out.println("Stack is full");
        }
    }
    void push(int data) {
        if(top == arr.length-1) {
            System.out.println("Stack is overflow");
            return;
        }
        ++top;
        arr[top]=data;
        System.out.println(arr[top]+ " -> inserted.");
    }
    void pop() {
        if(top==-1) {
            System.out.println("Stack is underflow.");
            return;
        }
        System.out.println(arr[top]+ " -> deleted.");
        top--;
        arr[top]=0;
    }
    void peek() {
        if(top==-1) {
            System.out.println("No values in stack");
            return;
        }
        System.out.println(arr[top]+ " -. is peak element.");
    }
    boolean search(int data) {
        if(top==-1) {
            return false;
        }
        for(int i = 0; i<top; i++) {
            if(arr[i]==data) {
                return true;
            }
        }
        return false;
    }
    void display() {
        if(top==-1) {
            System.out.println("No elements in stack.");
            return;
        }
        for(int i=top;i>=0;i--) {
            if(i==0)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i]+ " ->");
        }
    }
    void count() {
        if(top==-1) {
            System.out.println("No element in stack.");
            return;
        }
        int c = 0;
        for(int i = top;i>=0;i--) {
            c++;
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        StackImplementation ob = new StackImplementation();
        ob.push(23);
        ob.push(56);
        ob.push(41);
        ob.push(87);
        ob.push(67);
        ob.push(12);
        // ob.pop();
        // ob.peek();
        //System.out.println(ob.search(56));
        //ob.display();
        ob.count();
    }
}
