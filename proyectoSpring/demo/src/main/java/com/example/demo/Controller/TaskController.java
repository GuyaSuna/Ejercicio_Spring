package com.example.demo.Controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Task;
import com.example.demo.Service.TaskServiceImpl;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskServiceImpl TaskService;

    @PostMapping
    public ResponseEntity<?> addTask(@RequestBody Task task){
        return ResponseEntity.status(HttpStatus.CREATED).body(TaskService.save(task));
    }
    
}
