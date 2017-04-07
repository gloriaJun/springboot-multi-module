package com.study;

import com.study.model.ToDo;
import com.study.repository.ToDoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // set init data
    @Bean
    public CommandLineRunner setup(final ToDoRepository toDoRepository) {
        return (args) -> {
            toDoRepository.save(new ToDo("clean up the room", false));
            toDoRepository.save(new ToDo("study math", true));
        };
    }

}
