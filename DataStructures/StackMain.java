import java.util.Scanner;

class Stack{

    int MAX_LIMIT;

    int[] stackArray;
    private int top;

    public Stack(int limit){
        MAX_LIMIT = limit;
        stackArray = new int[MAX_LIMIT];
        top = -1;
    }

    public void push(int num){
        if(top==MAX_LIMIT-1){
            System.out.println("Stack Overflow.");
            return;
        } else {
            stackArray[++top] = num;
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow: Nothing to pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public void traverse(){
        if(top==-1){
            System.out.println("Stack Underflow: Nothing to traverse.");
            return;
        } else {
            for(int i=0; i<= top; i++){
                System.out.print(stackArray[i]+" ");
            }
            System.out.println();
        }
    }

    public int getTop(){
        return top;
    }

}

public class StackMain {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Stack stackObj = new Stack(100);

        System.out.println("\nMain Menu:\n===========");
        System.out.println("1. Push");
        System.out.println("2. Push Multiple");
        System.out.println("3. Pop");
        System.out.println("4. Traverse");
        System.out.println("5. Get Top");
        System.out.println("5. Quit");

        while(true){
            
            System.out.print("\nEnter Choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1: 
                    System.out.print("Enter number to push: ");
                    stackObj.push(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Number of elements: ");
                    int n = sc.nextInt();

                    for(int i=0; i<n; i++){
                        stackObj.push(sc.nextInt());
                    }
                    break;
                case 3:
                    System.out.println("Element Poppeed: "+ stackObj.pop());
                    break;
                case 4: 
                    System.out.print("Stack: ");
                    stackObj.traverse();
                    break;
                case 5:
                    System.out.println("Top: "+stackObj.getTop());;
                    break;
                case 6:
                    System.out.println("Exiting Program.\n"); 
                    sc.close();
                    return;
            } 

        }

    }
}
