package com.study.service;



import com.study.model.ToDo;
import com.study.repository.ToDoRepository;
import com.study.service.impl.ToDoServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class ToDoServiceTest {
    @Mock
    private ToDoRepository toDoRepository;
    @InjectMocks
    private ToDoServiceImpl toDoService;
    private ToDo toDo;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        toDo = new ToDo(1, "go shopping", false);
    }

    @Test
    public void testGetAllToDo() {
        // given
        List<ToDo> toDoList = new ArrayList<ToDo>();
        toDoList.add(new ToDo(1, "go shopping", false));
        toDoList.add(new ToDo(2, "clean up", false));

        when(toDoRepository.findAll()).thenReturn(toDoList);

        List<ToDo> list = toDoService.getAllToDo();
        assertEquals(2, list.size());
    }

    @Test
    public void testSaveToDo() {
        // given
        when(toDoRepository.save(toDo)).thenReturn(toDo);

        // when
        ToDo result = toDoService.saveToDO(toDo);

        // then
        assertEquals(1, result.getId());
        assertEquals("go shopping", result.getText());
    }

    @Test
    public void testDeleteToDo() {
        toDoService.deleteToDo(toDo.getId());
        verify(toDoRepository, times(1)).delete(toDo.getId());
    }

//    public ToDo getById(long id);
//    public ToDo saveToDO(ToDo todo);
//    public void deleteToDo(long id);
}
