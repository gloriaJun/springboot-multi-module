package study.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import study.domain.ToDo;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ToDoRepositoryTest {
  private static Logger logger = LoggerFactory.getLogger(ToDoRepository.class);

  @Autowired
  private TestEntityManager testEntityManager;
  @Autowired
  private ToDoRepository toDoRepository;
  private ToDo toDo;

  @Before
  public void setUp() {
    toDo = new ToDo("study", false);
  }

  @Test
  public void testSave() {
    ToDo result = toDoRepository.save(toDo);
    assertThat(result)
        .isNotNull()
        .isEqualTo(toDo);
  }
}
