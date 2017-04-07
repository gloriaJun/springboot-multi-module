package com.study.controller;

import com.study.exception.ToDoException;
import com.study.model.ToDo;
import com.study.service.ToDoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {

    private static final Logger logger = LoggerFactory.getLogger(ToDoController.class);

    private ToDoService service;

    @Autowired
    public ToDoController(ToDoService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<ToDo> getAllToDo() {
        return service.getAllToDo();
    }

    @PutMapping ("/save")
    public ToDo saveToDo(ToDo toDo) {
        return service.saveToDO(toDo);
    }

    @GetMapping("/{id}")
    public ToDo getToDobyId(@PathVariable("id")long id) throws ToDoException {
        logger.info("get toDo Info : {}", id);
        ToDo toDo = service.getById(id);
        if (toDo == null) {
            throw new ToDoException("ToDo not exsit !!");
        }
        return toDo;
    }
}
