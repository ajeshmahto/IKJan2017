package day2.classwork.linkedlist;

/**
 * Created by ajesh on 1/27/18.
 */
public class ParentClass {
   void doSomething(String str){
       System.out.println(" i am parent");
    }

    public static void main(String[] args) {

        ParentClass p = new ChildClass();
        p.doSomething("hello");
    }
}


class ChildClass extends ParentClass{

    void doSomething(Object str){
        System.out.println(" i am child");
    }
}
