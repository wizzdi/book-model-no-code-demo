package com.wizzdi.demo.model;

import com.flexicore.model.SecuredBasic;
import javax.persistence.Entity;

@Entity
public class Library extends SecuredBasic {

  private String location;

  /** @return location */
  public String getLocation() {
    return this.location;
  }

  /**
   * @param location location to set
   * @return Library
   */
  public <T extends Library> T setLocation(String location) {
    this.location = location;
    return (T) this;
  }
}
