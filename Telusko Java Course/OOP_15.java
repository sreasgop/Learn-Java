// Interface Application: 
// We use abstract class or interface to write losely coupled code. Loosely coupled code refers to a design approach where different components or modules of a software system have minimal dependencies on each other.
// We use abstact class or interface to help us better generalize things in code. 


abstract class StudyResource{
    public abstract void learn();
}


class Book extends StudyResource{

    public void learn() {
        System.out.println("Read, underline, highlight, etc.");
    }
    
}

class EBook extends StudyResource{

    public void learn(){
        System.out.println("Read, Underline, Highlight, Index, Search, etc.");
    }

}


class Video extends StudyResource{

    public void learn(){
        System.out.println("Watch, Rewatch, Read Transcript, Highlight, Search, Index transcript, etc.");
    }

}


class Student{
    public void study(StudyResource Obj){
        Obj.learn();
    }
}


public class OOP_15 {
    public static void main(String[] args) {
        
        StudyResource material1 = new Book();
        StudyResource material2 = new EBook();
        StudyResource material3 = new Video();

        Student newStud = new Student();

        newStud.study(material1);
        newStud.study(material2);
        newStud.study(material3);

    }    
}
