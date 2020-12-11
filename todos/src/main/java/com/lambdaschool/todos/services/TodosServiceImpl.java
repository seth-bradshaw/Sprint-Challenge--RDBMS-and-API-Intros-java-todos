package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;
import com.lambdaschool.todos.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService
{
    @Autowired
    TodosRepository todosrepos;

    @Override
    public void markComplete(long todoid)
    {
        Todo newTodo = new Todo();
        newTodo = todosrepos.findById(todoid).orElseThrow(() -> new EntityNotFoundException("Todo " + todoid + " not found."));
        newTodo.setCompleted(true);
    }

    @Override
    public void save(long userid, Todo newTodo)
    {

    }

}
