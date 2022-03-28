package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class AuthorToBook extends SecuredBasic {

  @ManyToOne(targetEntity = Author.class)
  private Author author;

  @ManyToOne(targetEntity = Book.class)
  private Book book;

  /** @return author */
  @ManyToOne(targetEntity = Author.class)
  public Author getAuthor() {
    return this.author;
  }

  /**
   * @param author author to set
   * @return AuthorToBook
   */
  public <T extends AuthorToBook> T setAuthor(Author author) {
    this.author = author;
    return (T) this;
  }

  /** @return book */
  @ManyToOne(targetEntity = Book.class)
  public Book getBook() {
    return this.book;
  }

  /**
   * @param book book to set
   * @return AuthorToBook
   */
  public <T extends AuthorToBook> T setBook(Book book) {
    this.book = book;
    return (T) this;
  }
}
