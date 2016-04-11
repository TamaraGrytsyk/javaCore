package ua.grytsyk.device.project;

abstract class A {
    int i;

 public String smth(){
     return  "Smth big";
 };

  abstract public void g();
}

class B extends A {
    public void g() {
        System.out.println(smth()+" from class B method G");
    }
}
class C extends A {
    @Override
    public void g() {
       String aaa= smth()+" and so on";
        System.out.println(aaa);
    }
}

public class TestFinal {


    public static void main(String[] args) {
        A aa = new B();
        A cc = new C();
        aa.smth();
        aa.g();
        cc.g();
    }


    public void f() {
//        i++;
    }


}
