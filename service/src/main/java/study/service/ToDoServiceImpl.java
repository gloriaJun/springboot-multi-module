package study.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.domain.ToDo;
import study.repository.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {
  @Autowired
  private ToDoRepository toDoRepository;

  @Override
  public ToDo add(ToDo toDo) {
    return toDoRepository.save(toDo);
  }

  @Override
  public ToDo update(ToDo toDo) {
    return null;
  }

  @Override
  public ToDo getbyId(long id) {
    return null;
  }

  @Override
  public List<ToDo> getAllList() {
    return null;
  }

  @Override
  public void delete(long id) {

  }
}
