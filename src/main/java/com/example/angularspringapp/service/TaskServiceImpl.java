package com.example.angularspringapp.service;

import com.example.angularspringapp.domain.Task;
import com.example.angularspringapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list(){
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task Task) {
        return this.taskRepository.save(Task);
    }
}
