public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        int c=20;
        swap(a,c);
        System.out.println(a+" "+c); // 10,20
        Integer b=10;
        //when we pass any variable with class it pass the reference
        Integer d=20;
        swap(b,d);
        System.out.println(b+" "+d);  // 10,20
        //its still not swaping because Integer is a final class
        //final class means its value cannot be changed but this is for primitives only and it has to be declared
        final int e=20;
        // e++; ,e=10 will throw an error
        final A me=new A("Cat");
        me.name="dog"; //in this we can change the value but not the object it is pointing
        // me=new A(you); these will throw error

        A obj;
        for(int i=0;i<100000000;i++){
        obj=new A("Random name");
        }
        //destroying will not happen untill there will be a heavy load on memory
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }

    
}
class A{
    final int marks=10;
    String name;
    public A(String name){
        this.name=name;

    }
    //this is how we can manually decide which memory to destroy
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
