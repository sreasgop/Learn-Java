public class Recursion01 {
    public static void main(String[] args) {
        printNum();
    }

    static int count = 0;
    static void printNum(){
        if(count > 3){
            return;
        }
        System.out.print(count++ + " ");
        printNum();
    }
}
