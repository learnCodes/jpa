package com.jege.jpa.extend;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author JE哥
 * @email 1272434821@qq.com
 * @description:子类
 */
@Entity
@DiscriminatorValue("3")
public class Student extends Person {
  private String school;

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

}
