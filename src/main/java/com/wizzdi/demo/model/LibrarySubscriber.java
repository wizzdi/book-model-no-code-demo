package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class LibrarySubscriber extends SecuredBasic {

  @ManyToOne(targetEntity = Library.class)
  private Library library;

  /** @return library */
  @ManyToOne(targetEntity = Library.class)
  public Library getLibrary() {
    return this.library;
  }

  /**
   * @param library library to set
   * @return LibrarySubscriber
   */
  public <T extends LibrarySubscriber> T setLibrary(Library library) {
    this.library = library;
    return (T) this;
  }
}
