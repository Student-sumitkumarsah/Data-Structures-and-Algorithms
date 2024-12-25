public class constructor {
    public static void main(String[] args) {
        student s2=new student();
        student s1=new student("kumar");
        System.out.println(s1.name);
    }
    
}


//constructor = constructor have the same name as class or structure.


class student{
    String name;
    int age;

    student(){   // Non parameterized constructor
        System.out.println("sumit");
    }

    student(String name){  // this is parameterized constructor
      this.name=name;
    }
}
