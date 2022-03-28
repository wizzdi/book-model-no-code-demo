package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import java.time.OffsetDateTime;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BookBorrow extends SecuredBasic {

  @ManyToOne(targetEntity = Book.class)
  private Book book;

  private OffsetDateTime borrowBegin;

  private OffsetDateTime borrowRequiredReturn;

  private OffsetDateTime borrownActualReturn;

  @ManyToOne(targetEntity = LibrarySubscriber.class)
  private LibrarySubscriber librarySubscriber;

  /** @return book */
  @ManyToOne(targetEntity = Book.class)
  public Book getBook() {
    return this.book;
  }

  /**
   * @param book book to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setBook(Book book) {
    this.book = book;
    return (T) this;
  }

  /** @return borrowBegin */
  public OffsetDateTime getBorrowBegin() {
    return this.borrowBegin;
  }

  /**
   * @param borrowBegin borrowBegin to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setBorrowBegin(OffsetDateTime borrowBegin) {
    this.borrowBegin = borrowBegin;
    return (T) this;
  }

  /** @return borrowRequiredReturn */
  public OffsetDateTime getBorrowRequiredReturn() {
    return this.borrowRequiredReturn;
  }

  /**
   * @param borrowRequiredReturn borrowRequiredReturn to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setBorrowRequiredReturn(OffsetDateTime borrowRequiredReturn) {
    this.borrowRequiredReturn = borrowRequiredReturn;
    return (T) this;
  }

  /** @return borrownActualReturn */
  public OffsetDateTime getBorrownActualReturn() {
    return this.borrownActualReturn;
  }

  /**
   * @param borrownActualReturn borrownActualReturn to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setBorrownActualReturn(OffsetDateTime borrownActualReturn) {
    this.borrownActualReturn = borrownActualReturn;
    return (T) this;
  }

  /** @return librarySubscriber */
  @ManyToOne(targetEntity = LibrarySubscriber.class)
  public LibrarySubscriber getLibrarySubscriber() {
    return this.librarySubscriber;
  }

  /**
   * @param librarySubscriber librarySubscriber to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setLibrarySubscriber(LibrarySubscriber librarySubscriber) {
    this.librarySubscriber = librarySubscriber;
    return (T) this;
  }
}
