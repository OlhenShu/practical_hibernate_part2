package com.softserve.itacademy.service.impl;

import com.softserve.itacademy.model.Task;
import com.softserve.itacademy.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Override
    public Task create(Task task) {
       return null;
    }

    @Override
    public Task readById(long id) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Task> getAll() {
        return Collections.emptyList();
    }

    @Override
    public List<Task> getByTodoId(long todoId) {

        return Collections.emptyList();
    }
}