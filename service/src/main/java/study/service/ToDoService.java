package study.service;

import java.util.List;
import study.domain.ToDo;

public interface ToDoService {

  public ToDo add(ToDo toDo);
  public ToDo update(ToDo toDo);
  public ToDo getbyId(long id);
  public List<ToDo> getAllList();
  public void delete(long id);
}
