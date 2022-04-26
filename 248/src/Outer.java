

public class Outer {
    static String name  = "outer class";  //vul chilo

    void display(){
        new Inner().display();
    }
    class Inner {
        String name = "Inner class";
        public int id = 111;        //vul 
        public void display(){
            System.out.println(name+":"+Outer.name);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();       //vul
        Outer.Inner in = o.new Inner();//vul
        in.display();
        System.out.println(in.id);
    }
}
