package thi.hatuhuy63133302.Dethi2;

public class Subjects {
    private int bookID;
    private String bookName;
    private int page;

    public Subjects(int bookID, String bookName, int page) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.page = page;
    }

    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPage() {
        return page;
    }
}
