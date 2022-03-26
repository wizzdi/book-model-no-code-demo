package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class LibraryToBook extends SecuredBasic {

  @ManyToOne(targetEntity = Book.class)
  private Book book;

  @ManyToOne(targetEntity = Library.class)
  private Library library;

  /** @return book */
  @ManyToOne(targetEntity = Book.class)
  public Book getBook() {
    return this.book;
  }

  /**
   * @param book book to set
   * @return LibraryToBook
   */
  public <T extends LibraryToBook> T setBook(Book book) {
    this.book = book;
    return (T) this;
  }

  /** @return library */
  @ManyToOne(targetEntity = Library.class)
  public Library getLibrary() {
    return this.library;
  }

  /**
   * @param library library to set
   * @return LibraryToBook
   */
  public <T extends LibraryToBook> T setLibrary(Library library) {
    this.library = library;
    return (T) this;
  }
}
