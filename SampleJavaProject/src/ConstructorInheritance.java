
 class test1 {
    int a,b;
    test1(){
        a = 100;
        b = 20;
    }
}

class test2 extends test1 {
    test2(){
        // do something
    }
}

class ConstructorInheritance {
    public static void main(String[] args) {
        test2 t = new test2();
        int a = t.a;
        int b = t.b;
        System.out.println(a+b);
    }
}
