package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Entity.Task;
import com.example.demo.Repository.TaskRepository;

import jakarta.transaction.Transactional;

public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository TaskRepository;

    @Override
    @Transactional
    public Task save(Task task){
        return TaskRepository.save(task);
    }
}
