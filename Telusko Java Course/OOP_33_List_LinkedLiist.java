import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;


public class OOP_33_List_LinkedLiist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> llobj = new LinkedList<Integer>();
        int choice;

        printMenu();

        while(true){
            System.out.print("\n(Press 8 to view Main Menu)\nEnter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter element: ");
                    llobj.add(sc.nextInt());
                    break;
                case 2: 
                    System.out.print("Enter element to add at Beginning: ");
                    llobj.addFirst(sc.nextInt());
                case 3:
                    System.out.print("Enter Element to add at Ending: ");
                    llobj.addLast(sc.nextInt());
                case 4:
                    System.out.print("Enter element to delete: ");
                    int dataIndex = llobj.indexOf(sc.nextInt());
                    System.out.println("Removed element: of index "+dataIndex);
                    llobj.remove(dataIndex);
                    break;
                case 5:
                    System.out.print("Linked List: ");
                    for(int i: llobj){
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Enter element to seach: ");
                    System.out.println("Entered element found at index "+ llobj.indexOf(sc.nextInt()));
                    break;
                case 7:
                    System.out.printf("A. Press 'A' for Ascending Order\nB. Press 'B' for Descending order.\nEnter Choice: ");
                    
                    // Flush the input buffer by reading all remaining newline characters
                    while (sc.hasNextLine()) {
                        String buffer = sc.nextLine();
                        if (buffer.isEmpty()) {
                            break;
                        }
                    }

                    String sortChoice = sc.nextLine();
                    if(sortChoice.contentEquals("A")){
                        System.out.print("Linked List sorted in ascending order!\n");
                        llobj.sort(null);
                    } else if (sortChoice.contentEquals("B")){
                        System.out.print("Linked List sorted in descending order!\n");
                        Collections.sort(llobj, Collections.reverseOrder());
                    } else {
                        System.out.println("Incorrect input! Try again.");
                    }
                    break;
                case 9:
                    printMenu();
                case 10:
                    System.out.println("Exitting Program.");
                    return;
            }
        }
    }

    public static void printMenu(){
        System.out.printf("\nMain Menu\n==========\n");
        System.out.println("1. Add Element");
        System.out.println("2. Add at Beginning");
        System.out.println("3. Add at Ending");
        System.out.println("4. Delete Element");
        System.out.println("5. Display Elements");
        System.out.println("6. Search Element");
        System.out.println("7. Sort Elements");
        System.out.println("8. Print Main Menu");
        System.out.println("9. Exit");
        
    }
        
    public static void display(){
        ;
    }

}


