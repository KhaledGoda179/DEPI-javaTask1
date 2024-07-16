package library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member {
    private String name;
    private String memberId;
    private String address;
    private List<Loan> loans;

    public Member(String name, String memberId, String address) {
        this.name = name;
        this.memberId = memberId;
        this.address = address;
        this.loans = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        Loan loan = new Loan(book, this, new Date(), new Date(System.currentTimeMillis() + 14 * 24 * 60 * 60 * 1000));
        loans.add(loan);
    }

    public void returnBook(Book book) {
        loans.removeIf(loan -> loan.getBook().equals(book));
    }

}

