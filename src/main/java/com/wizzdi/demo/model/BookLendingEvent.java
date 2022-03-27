package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import java.time.OffsetDateTime;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BookLendingEvent extends SecuredBasic {

  private OffsetDateTime actualTimeOfReturn;

  @ManyToOne(targetEntity = Book.class)
  private Book book;

  private OffsetDateTime expectedTimeOfReturn;

  private OffsetDateTime lendTime;

  @ManyToOne(targetEntity = LibrarySubscriber.class)
  private LibrarySubscriber librarySubscriber;

  /** @return actualTimeOfReturn */
  public OffsetDateTime getActualTimeOfReturn() {
    return this.actualTimeOfReturn;
  }

  /**
   * @param actualTimeOfReturn actualTimeOfReturn to set
   * @return BookLendingEvent
   */
  public <T extends BookLendingEvent> T setActualTimeOfReturn(OffsetDateTime actualTimeOfReturn) {
    this.actualTimeOfReturn = actualTimeOfReturn;
    return (T) this;
  }

  /** @return book */
  @ManyToOne(targetEntity = Book.class)
  public Book getBook() {
    return this.book;
  }

  /**
   * @param book book to set
   * @return BookLendingEvent
   */
  public <T extends BookLendingEvent> T setBook(Book book) {
    this.book = book;
    return (T) this;
  }

  /** @return expectedTimeOfReturn */
  public OffsetDateTime getExpectedTimeOfReturn() {
    return this.expectedTimeOfReturn;
  }

  /**
   * @param expectedTimeOfReturn expectedTimeOfReturn to set
   * @return BookLendingEvent
   */
  public <T extends BookLendingEvent> T setExpectedTimeOfReturn(
      OffsetDateTime expectedTimeOfReturn) {
    this.expectedTimeOfReturn = expectedTimeOfReturn;
    return (T) this;
  }

  /** @return lendTime */
  public OffsetDateTime getLendTime() {
    return this.lendTime;
  }

  /**
   * @param lendTime lendTime to set
   * @return BookLendingEvent
   */
  public <T extends BookLendingEvent> T setLendTime(OffsetDateTime lendTime) {
    this.lendTime = lendTime;
    return (T) this;
  }

  /** @return librarySubscriber */
  @ManyToOne(targetEntity = LibrarySubscriber.class)
  public LibrarySubscriber getLibrarySubscriber() {
    return this.librarySubscriber;
  }

  /**
   * @param librarySubscriber librarySubscriber to set
   * @return BookLendingEvent
   */
  public <T extends BookLendingEvent> T setLibrarySubscriber(LibrarySubscriber librarySubscriber) {
    this.librarySubscriber = librarySubscriber;
    return (T) this;
  }
}
