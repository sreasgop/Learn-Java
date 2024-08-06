class Student{
    int rollno;
    String name;
    int marks;
}

public class OOP_01 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.rollno = 2451; 
        s1.name = "Chandra Sreas Gop";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollno = 2454; 
        s2.name = "Soutrika Das";
        s2.marks = 100;

        Student s3 = new Student(); 
        s3.rollno = 2492; 
        s3.name = "Sanjib Kumar Sah";
        s3.marks = 70;

        Student[] students = new Student[3];

        students[0] = s1; 
        students[1] = s2; 
        students[2] = s3; 


        // Using normal For Loop 
        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }


        // Using for each loop / Enhanced For loop
        for(Student student: students){
            System.out.println(student.name+": "+student.marks);
        }
        System.out.println();

    }
}
