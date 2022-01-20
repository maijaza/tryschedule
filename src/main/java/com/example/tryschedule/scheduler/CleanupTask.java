package com.example.tryschedule.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.tryschedule.constant.Data;

@Component
public class CleanupTask  {
 
	@Scheduled(cron = "*/10 * * * * *")
	public void example() {
		Data.cnt++;
	}
}
