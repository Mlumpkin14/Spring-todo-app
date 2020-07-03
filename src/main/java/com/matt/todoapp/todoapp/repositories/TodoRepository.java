package com.matt.todoapp.todoapp.repositories;

import com.matt.todoapp.todoapp.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List <Todo> findByUserName(String user);
}
