package com.matt.todoapp.todoapp.services;

import com.matt.todoapp.todoapp.models.Todo;
import com.matt.todoapp.todoapp.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService  implements TodoServiceImpl{

    private TodoRepository todoRepository;

    @Override
    public List<Todo> getTodosByUser(String user) {
        return todoRepository.findByUserName(user) ;
    }

    @Override
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void update(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void addTodo(String name, String description, Date targetDate, Boolean isDone) {
        todoRepository.save(new Todo(name, description,targetDate,isDone));
    }

    @Override
    public void deleteTodo(long id) {
        Optional <Todo> todo =todoRepository.findById(id);
        if(todo.isPresent()){
            todoRepository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }
}
