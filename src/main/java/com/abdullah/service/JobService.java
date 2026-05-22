package com.abdullah.service;

import com.abdullah.entity.Job;
import com.abdullah.exception.ResourceNotFoundException;
import com.abdullah.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JobService {
    private final JobRepository jobRepository;

//    public JobService(JobRepository jobRepository) {
//        this.jobRepository = jobRepository;
//    }
private static final Logger logger =
        LoggerFactory.getLogger(JobService.class);

    //create job
    public Job save(Job job){
        logger.info("Creating new job: {}", job.getTitle());
        return jobRepository.save(job);
    }

    // All job
    public List<Job> findAll(){
        logger.info("Fetching all jobs");
        return jobRepository.findAll();
    }

    //All Job
    public Job findById(Long id){
        logger.info("Fetching job by id: {}", id);
        return jobRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Job not found with id: " + id));
    }

    //Update job
    public Job UpdateJob(Long id , Job updateJob){
        Job existingJob  = jobRepository.findById(id).orElse(null);
        if(existingJob  != null){
            existingJob.setTitle(updateJob.getTitle());
            existingJob.setDescription(updateJob.getDescription());
            existingJob.setDepartment(updateJob.getDepartment());
            logger.info("Updating job: {}", existingJob);
            return jobRepository.save(existingJob);
        }
        logger.error("Job not found with id: {}", id);
        return null;
    }

    // delete job
    public void deleteById(Long id){
        logger.info("Deleting job with id: {}", id);
        jobRepository.deleteById(id);
    }
}
