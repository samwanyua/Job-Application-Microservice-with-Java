package com.wanyua.Job.Application.Job.Impl;

import com.wanyua.Job.Application.Job.Job;
import com.wanyua.Job.Application.Job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl  implements JobService {
    private final List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;
    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
    job.setId(nextId++);
    jobs.add(job);
    }
}
