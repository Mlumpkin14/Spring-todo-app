package com.matt.todoapp.todoapp.services;

import com.matt.todoapp.todoapp.models.Todo;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface TodoServiceImpl {

    List <Todo> getTodosByUser(String user);

    Optional < Todo > getTodoById(Long id);

    void update(Todo todo);

    void addTodo(String name, String description, Date targetDate, Boolean isDone);

    void deleteTodo(long id);

    void saveTodo(Todo todo);
}
