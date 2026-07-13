package GeneralsConcepts;

class Test{

    int a = 10;
    static int count = 0;

    public void increment(){
        a++;
        count++;
    }
}

public class Static {
    
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.increment();
        t2.increment();

        System.out.println(t1.a);
        System.out.println(t1.count);
        System.out.println(t2.a);
        System.out.println(t2.count);
        System.out.println(Test.count);
    }
}
