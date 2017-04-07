package com.study.service;

import com.study.model.ToDo;

import java.util.List;

public interface ToDoService {

    public List<ToDo> getAllToDo();
    public ToDo getById(long id);
    public ToDo saveToDO(ToDo todo);
    public void deleteToDo(long id);

}
