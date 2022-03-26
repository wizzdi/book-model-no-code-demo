package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Book extends SecuredBasic {

  @ManyToOne(targetEntity = Author.class)
  private Author author;

  /** @return author */
  @ManyToOne(targetEntity = Author.class)
  public Author getAuthor() {
    return this.author;
  }

  /**
   * @param author author to set
   * @return Book
   */
  public <T extends Book> T setAuthor(Author author) {
    this.author = author;
    return (T) this;
  }
}
