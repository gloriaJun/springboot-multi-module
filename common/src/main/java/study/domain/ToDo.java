package study.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ToDo {
  @GeneratedValue
  @Id
  private long id;
  private String text;
  private boolean completed;

  public ToDo(String text, boolean completed) {
    this.text = text;
    this.completed = completed;
  }
}
