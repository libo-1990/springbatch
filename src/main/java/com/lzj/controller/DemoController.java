package com.lzj.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
	@RequestMapping("/test")
	public void test() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException{
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("job.xml");
		
		SimpleJobLauncher launcher = (SimpleJobLauncher) ctx.getBean("laucher");
		Job job = (Job) ctx.getBean("jobExample");
		System.out.println(launcher);
		System.out.println(job);
		launcher.run(job, new JobParameters());
		ctx.close();
	}

}
