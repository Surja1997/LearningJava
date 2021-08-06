package coreJava.StaticDemonstrations;

public class StaticDemo2 {

    void hello()
    {
        System.out.println("In hello ");
    }
     static void calc()
    {
        System.out.println("in static method ");
    }

    public static void main(String[] args) {
        StaticDemo2 staticDemo2=new StaticDemo2();
        staticDemo2.hello();

        calc();

    }
}
