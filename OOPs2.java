public class OOPs2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ShivaniGupta";
        s1.roll = 100;
        s1.password ="abcd1234";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        Student s3 = new Student(908);
        System.out.println(s2.name);
        System.out.println(s3.name);
        for(int i = 0; i<3;i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    /*Student(Student s1) {  //shallow copy constructor
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;   
          this.marks = s1.marks;
    }*/
    //deep copy
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;  
        for(int i = 0;i<marks.length;i++){ 
        this.marks [i]= s1.marks[i];
       }
    }
    Student() {  //non-parameterized
        marks = new int[3];
        System.out.println("constructor is called...");
    }
    Student(String name) {  //parameterized
        marks = new int[3];
        this.name = name;
    }
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
    //constructor overloading-polymorphism
   
}
