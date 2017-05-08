package study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.domain.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}
