package Lab72;

public class TestBook {
    public static void main(String[] args) {
        Book book1= new Book.Builder().ISBN('1').author("aaa").name("bbbb").build();
        Book book2= new Book.Builder().ISBN('2').author("baa").name("dbbb").build();
        book1.readBook();
        book2.readBook();
    }


}
