package Items;

public class Book extends Item{

    private  String title;
    private String author;

    public Book( double sellingPrice, String title, String author){
        super(sellingPrice);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

}
