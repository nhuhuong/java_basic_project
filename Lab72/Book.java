package Lab72;

public class Book {
    private final int ISBN;
    private final String name;
    private final String author;

    private Book(Builder builder){
        this.ISBN = builder.ISBN;
        this.name = builder.name;
        this.author = builder.author;
    }

    public void readBook(){
        System.out.println("ISBN is " + this.ISBN);
        System.out.println("book's name is " + this.name);
        System.out.println("author is " + this.author);
    }



    public static class Builder {
        private int ISBN;
        private String name;
        private String author;

        Builder() {
        }

        public Builder ISBN(int ISBN){
            this.ISBN = ISBN;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder author(String author){
            this.author = author;
            return this;
        }

        public  Book build(){
            return new Book(this);
        }


    }
}
