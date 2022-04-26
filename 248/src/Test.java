

import java.util.ArrayList;

class Book {
    String title;
    Person author;
    int price;

    Book(String title, Person author, int price){
        this.title= title;
        this.author= author;
        this.price= price;
    }

    @Override
    public String toString() {
        return  title+" " + author +" "+ price;
    }
}
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}
public class Test {
    public static void main(String[] args) {
        ArrayList <Book> books = new ArrayList<Book>();
        books.add(new Book("book1", new Person("badhon", 50),500));
        System.out.println(books);
    }

}
