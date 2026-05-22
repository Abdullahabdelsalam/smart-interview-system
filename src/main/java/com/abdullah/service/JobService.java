package com.abdullah.service;

import com.abdullah.entity.Job;
import com.abdullah.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JobService {
    private final JobRepository jobRepository;

//    public JobService(JobRepository jobRepository) {
//        this.jobRepository = jobRepository;
//    }

    //create job
    public Job save(Job job){
        return jobRepository.save(job);
    }

    // All job
    public List<Job> findAll(){
        return jobRepository.findAll();
    }

    //All Job
    public Job findById(Long id){
        return jobRepository.findById(id).orElse(null);
    }

    //Update job
    public Job UpdateJob(Long id , Job updateJob){
        Job existingJob  = jobRepository.findById(id).orElse(null);
        if(existingJob  != null){
            existingJob.setTitle(updateJob.getTitle());
            existingJob.setDescription(updateJob.getDescription());
            existingJob.setDepartment(updateJob.getDepartment());
            return jobRepository.save(existingJob);
        }
        return null;
    }

    // delete job
    public void deleteById(Long id){
        jobRepository.deleteById(id);
    }
}
