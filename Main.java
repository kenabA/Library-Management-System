import java.util.ArrayList;

class MyLibrary {
  public ArrayList<Book> books;
  public MyLibrary(ArrayList<Book> books) {
    this.books = books;
  }

  public void addBook(Book addingBook) {
    if (books.contains(addingBook)) {
      System.out.println("Book exists already. Cannot add.");
    } else {
      System.out.println("Successfully added.");
      this.books.add(addingBook);
    }
  }

  public void returnBook(Book returnedBook, String name) {
    if (books.contains(returnedBook)) {
      System.out.println("Book not issued yet.");
    } else {
      System.out.println("Successfully returned by " + name + ".");
      this.books.add(returnedBook);
    }
  }

  public void issueBook(Book issuingBook, String issuedTo) {
    if (books.contains(issuingBook)) {
      System.out.println("Successfully issued book titled " + issuingBook.name + " to " + issuedTo + ".");
      this.books.remove(issuingBook);
    } else {
      System.out.println("Book of the name " + issuingBook.name + " already been issued. Sorry. ");
    }
  }
}

class Book {
  public String name, author;
  public Book(String name, String author) {
    this.name = name;
    this.author = author;
  }

  public String toString() {
    return "{ Book Name: " + this.name + ", Author Name: " + this.author + " }";
  }
}

public class Main {
  public static void main(String[] args) {
    ArrayList<Book> bk = new ArrayList<>();
    Book b1 = new Book("Atomic Habits", "Kenab");
    bk.add(b1);
    Book b2 = new Book("Cindrella", "Pragati");
    bk.add(b2);
    Book b3 = new Book("Tangel", "Saroj");
    bk.add(b3);
    Book b4 = new Book("Beauty and a beast", "Rezan");
    bk.add(b4);
    MyLibrary l1 = new MyLibrary(bk);

    System.out.println(l1.books);

    Book b5 = new Book("Helping Hands", "George");
    l1.addBook(b5);
    System.out.println(l1.books);
    l1.issueBook(b5, "Kendal");
    System.out.println(l1.books);
    l1.returnBook(b5, "Kendal");
    System.out.println(l1.books);

  }
}
