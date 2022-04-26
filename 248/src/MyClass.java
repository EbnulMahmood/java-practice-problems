

import java.io.*;

public class MyClass {
    String s;
    int i;
    double d;

    public MyClass(String s,int i,double d){
        this.s=s;
        this.i=i;
        this.d=d;

    }

    MyClass readFromFile(String fileName) {
        String s;
        int i;
        double d;
        MyClass obj = null;
        try {
            FileReader fr = new FileReader("fileName.txt");
            BufferedReader br = new BufferedReader(fr);
            s = br.readLine();
            i = br.read();
            d = br.read();
            obj = new MyClass(s, i, d);

        } catch (Exception e) {
            System.out.println(e);
        }
        return obj;
    }

    void writeInFile(String name, MyClass obj){
        try {
            FileWriter fw = new FileWriter("fileName");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(String.valueOf(obj));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
