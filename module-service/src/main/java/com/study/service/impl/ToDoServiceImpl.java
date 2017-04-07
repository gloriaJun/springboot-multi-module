package com.study.service.impl;

import com.study.model.ToDo;
import com.study.repository.ToDoRepository;
import com.study.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ToDoService")
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public List<ToDo> getAllToDo() {
        return toDoRepository.findAll();
    }

    @Override
    public ToDo getById(long id) {
        return toDoRepository.findOne(id);
    }

    @Override
    public ToDo saveToDO(ToDo todo) {
        return toDoRepository.save(todo);
    }

    @Override
    public void deleteToDo(long id) {
        toDoRepository.delete(id);
    }
}
