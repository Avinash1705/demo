package com.example.demo.controller;

import com.example.demo.entity.Job;
import com.example.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    // GET all jobs
    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    // GET job by ID
    @GetMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        return jobService.getJobById(id);
    }
}