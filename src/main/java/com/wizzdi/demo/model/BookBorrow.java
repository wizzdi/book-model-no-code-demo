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

  private String four;

  @ManyToOne(targetEntity = LibrarySubscriber.class)
  private LibrarySubscriber librarySubscriber;

  private String one;

  private String three;

  private String two;

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

  /** @return four */
  public String getFour() {
    return this.four;
  }

  /**
   * @param four four to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setFour(String four) {
    this.four = four;
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

  /** @return one */
  public String getOne() {
    return this.one;
  }

  /**
   * @param one one to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setOne(String one) {
    this.one = one;
    return (T) this;
  }

  /** @return three */
  public String getThree() {
    return this.three;
  }

  /**
   * @param three three to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setThree(String three) {
    this.three = three;
    return (T) this;
  }

  /** @return two */
  public String getTwo() {
    return this.two;
  }

  /**
   * @param two two to set
   * @return BookBorrow
   */
  public <T extends BookBorrow> T setTwo(String two) {
    this.two = two;
    return (T) this;
  }
}
