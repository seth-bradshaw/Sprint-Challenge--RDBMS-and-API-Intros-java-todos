package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;

public interface TodosService
{
    void markComplete(long todoid);

    void save(long userid, Todo newTodo);
}
