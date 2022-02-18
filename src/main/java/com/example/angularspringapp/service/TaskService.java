package com.example.angularspringapp.service;

import com.example.angularspringapp.domain.Task;
import org.springframework.stereotype.Service;


public interface TaskService {
    Iterable <Task> list();

    Task save(Task Task);
}
