package library;

import java.util.Date;

public class Loan {
    private Book book;
    private Member member;
    private Date loanDate;
    private Date dueDate;

    public Loan(Book book, Member member, Date loanDate, Date dueDate) {
        this.book = book;
        this.member = member;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public void extendLoan(Date newDueDate) {
        this.dueDate = newDueDate;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    // Getters and Setters
}

