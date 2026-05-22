package com.abdullah.controller;

import com.abdullah.entity.Job;
import com.abdullah.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Jobs")
public class JobController {
    private final JobService jobService;

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.save(job);
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.findAll();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id) {
        return jobService.findById(id);
    }

    @PutMapping("/{id}")
    public Job updateJobById(@PathVariable Long id, @RequestBody Job job) {
        return jobService.save(job);
    }

    @DeleteMapping("/{id}")
    public String deleteJobById(@PathVariable Long id) {
        jobService.deleteById(id);
        return "Job has been deleted";
    }


}
