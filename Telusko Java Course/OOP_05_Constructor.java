class Student{
    
    private int rollno; 
    private StringBuffer name;
    private int marks;

    // A constructor is a special method with the same name as it's class, a constructor doesn't return any value therefore it doesn't have a return type.
    // Using method overloading we can create multiple constructor that takes up different number of parameters. 
    // A constructor that takes a parameter is called a parameterized constructor.

    public Student(){
        rollno = 2024;
        name = new StringBuffer("BCA_");
    }
    
    // Parameterized Constructor
    public Student(String n, int r, int m){
        String str_roll = "2024" + Integer.toString(r);
        this.setRollno(Integer.parseInt(str_roll)); 
        name = new StringBuffer("BCA_"+n);
        marks = m;

    }


    // Setters
    public void setRollno(int user_roll){
        String str_roll = Integer.toString(this.rollno) + Integer.toString(user_roll);
        this.rollno = Integer.parseInt(str_roll);
    }

    public void setName(String user_name){
        this.name.append(user_name);
    }

    public void setMarks(int user_marks){
        this.marks = user_marks;
    }


    // Getters
    public int getRollno(){
        return rollno;
    }

    public StringBuffer getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

}



public class OOP_05_Constructor {
    public static void main(String[] args){
        
        Student obj = new Student();

        obj.setName("Chandra Sreas Gop");
        obj.setRollno(2451);
        obj.setMarks(99);

        System.out.println(obj.getName());
        System.out.println(obj.getRollno());
        System.out.println(obj.getMarks());
        System.out.println();


        Student obj2 = new Student("Soutrika Das", 2454, 95);

        System.out.println(obj2.getName());
        System.out.println(obj2.getRollno());
        System.out.println(obj2.getMarks());
        System.out.println();


        Student obj3 = new Student("Sanjib Kumar Sah", 2492, 70);

        System.out.println(obj3.getName());
        System.out.println(obj3.getRollno());
        System.out.println(obj3.getMarks());
        System.out.println();
    }
}
