package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import java.time.OffsetDateTime;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BookBorrow extends SecuredBasic {

  @ManyToOne(targetEntity = LibrarySubscriber.class)
  private LibrarySubscriber librarySubscriber;

  @ManyToOne(targetEntity = Book.class)
  private Book book;

  private OffsetDateTime borrowBegin;

  private OffsetDateTime borrowExpectedReturn;

  private OffsetDateTime borrowActualReturn;

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

  /** @return borrowExpectedReturn */
  public OffsetDateTime getBorrowExpectedReturn() {
    return this.borrowExpectedReturn;
  }

  /**
   * @param borrowExpectedReturn borrowExpectedReturn to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setBorrowExpectedReturn(OffsetDateTime borrowExpectedReturn) {
    this.borrowExpectedReturn = borrowExpectedReturn;
    return (T) this;
  }

  /** @return borrowActualReturn */
  public OffsetDateTime getBorrowActualReturn() {
    return this.borrowActualReturn;
  }

  /**
   * @param borrowActualReturn borrowActualReturn to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setBorrowActualReturn(OffsetDateTime borrowActualReturn) {
    this.borrowActualReturn = borrowActualReturn;
    return (T) this;
  }
}
