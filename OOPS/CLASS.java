public class CLASS {
    public static void main(String[] args) {

        Student[] students=new Student[5];     //class must started with Uppercase

        // Student Any;          //Any as a student is declared but only for compile time
        // Any=new Student();    //this new will declare it in runtime for dynamic memory allocation
        Student any =new Student();
        //Student() is a constructor function,it is predeclared but we can declare it also
        // any.rollno=2;  //by "." we access the instance variable
        // any.name="Any";
        // any.marks=84.5f;
        System.out.println(any.rollno);
        System.out.println(any.name);
        System.out.println(any.marks);
    }

}
//cerating a class
class Student{
    int rollno;
    String name;
    float marks;
    //new variable inside a class is instance variable like rollno
    //these will be for every student
    Student(){
        this.rollno=5;
        this.name="Any";
        this.marks=85.4f;
        //this is used so we donot have to explicitly declare the value for every Student like any,kunal,and many more.
    }
}