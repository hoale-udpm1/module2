package Singleton;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoaneOut;

    static BookSingleton borrowBook(){
        if (!isLoaneOut){
            if (book == null){
                book = new BookSingleton();
            }
            isLoaneOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton bookReturned){
        isLoaneOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle(){
        return getTitle() + "by" + getAuthor();
    }
}
