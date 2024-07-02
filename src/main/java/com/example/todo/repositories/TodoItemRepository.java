package com.example.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todo.models.TodoItem;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long>{

	
}
