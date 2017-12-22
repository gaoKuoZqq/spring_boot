package com.sb.configuration;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
/**
 * 实现多线程定时任务,都属于一个线程池
 * @author gaokuo
 *
 */
@Configuration
public class ScheduleConfig implements SchedulingConfigurer{

	@Override
	public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
		scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(5));
	}

}
