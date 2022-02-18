package com.example.angularspringapp.repository;

import com.example.angularspringapp.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
