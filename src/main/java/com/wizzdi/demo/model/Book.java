package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import java.time.OffsetDateTime;
import javax.persistence.Entity;

@Entity
public class Book extends SecuredBasic {

  private OffsetDateTime publicationDate1;

  /** @return publicationDate1 */
  public OffsetDateTime getPublicationDate1() {
    return this.publicationDate1;
  }

  /**
   * @param publicationDate1 publicationDate1 to set
   * @return Book
   */
  public <T extends Book> T setPublicationDate1(OffsetDateTime publicationDate1) {
    this.publicationDate1 = publicationDate1;
    return (T) this;
  }
}
