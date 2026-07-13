package GeneralsConcepts;

public class PassByValueAndRef {
    public String name = "vivek";

    public void objModification(PassByValueAndRef s){
        s.name = "trainer";
    }

    public void premitaveModification(int n){
        n = 20;
    }
    
    public static void main(String[] args) {
        PassByValueAndRef obj = new PassByValueAndRef();
        String s = new String("vivek");
        System.out.println(obj.name);
        obj.objModification(obj);
        System.out.println(obj.name);


//         int a = 10;
// 
//         obj.premitaveModification(a);
//         System.out.println(a);
    }
}
