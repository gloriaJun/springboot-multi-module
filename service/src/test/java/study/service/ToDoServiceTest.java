package study.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import study.domain.ToDo;
import study.repository.ToDoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToDoServiceTest {

  @Mock
  private ToDoRepository toDoRepository;
  @InjectMocks
  private ToDoServiceImpl toDoService;
  private ToDo toDo;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    toDo = new ToDo("study", false);
  }

  @Test
  public void testAdd() {
    when(toDoRepository.save(toDo)).thenReturn(toDo);

    ToDo result = toDoService.add(toDo);
    verify(toDoRepository, times(1)).save(toDo);
    assertThat(result).isNotNull();
  }
}
