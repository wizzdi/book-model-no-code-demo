package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import java.time.OffsetDateTime;
import javax.persistence.Entity;

@Entity
public class Book extends SecuredBasic {

  private OffsetDateTime publicationDate;

  /** @return publicationDate */
  public OffsetDateTime getPublicationDate() {
    return this.publicationDate;
  }

  /**
   * @param publicationDate publicationDate to set
   * @return Book
   */
  public <T extends Book> T setPublicationDate(OffsetDateTime publicationDate) {
    this.publicationDate = publicationDate;
    return (T) this;
  }
}
