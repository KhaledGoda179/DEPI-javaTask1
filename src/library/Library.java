package library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {
    private String name;
    private String address;
    private List<Book> books;
    private List<Member> members;
    private List<Loan> loans;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void deregisterMember(Member member) {
        members.remove(member);
    }

    public void loanBook(Book book, Member member) {
        if (book.getAvailability()) {
            Loan loan = new Loan(book, member, new Date(), new Date(System.currentTimeMillis() + 14 * 24 * 60 * 60 * 1000));
            loans.add(loan);
            book.borrowBook();
            member.borrowBook(book);
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book, Member member) {
        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.getMember().equals(member)) {
                loans.remove(loan);
                book.returnBook();
                member.returnBook(book);
                break;
            }
        }
    }
}
