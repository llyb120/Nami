//package com.github.llyb120.nami;
//
//import org.junit.Test;
//import org.quartz.*;
//import org.quartz.impl.StdSchedulerFactory;
//
//import java.util.Date;
//
//public class TestTask {
//
//
//    public static class HelloQuartz implements Job {
//        @Override
//        public void execute(JobExecutionContext jobExecutionContext) {
//            JobDetail detail = jobExecutionContext.getJobDetail();
//            String name = detail.getJobDataMap().getString("name");
//            System.out.println("my job name is  " + name + " at " + new Date());
//        }
//    }
//
//    @Test
//    public void test(){
//        JobDetail jobDetail = JobBuilder.newJob(HelloQuartz.class)
//            //定义name和group
//            .withIdentity("job1", "group1")
//            //job需要传递的内容
//            .usingJobData("name", "sdas")
//            .build();
//        //定义一个Trigger
//        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1")
//            //加入 scheduler之后立刻执行
//            .startNow()
//            //定时 ，每个1秒钟执行一次
//            .withSchedule(CronScheduleBuilder.cronSchedule("0/1 * * * * ? *")).build();
//        try {
//            //创建scheduler
//            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//            scheduler.scheduleJob(jobDetail, trigger);
//            scheduler.start(); //运行一段时间后关闭
//            try {
//                Thread.sleep(6000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            scheduler.shutdown();
//        } catch (
//            SchedulerException e) {
//            e.printStackTrace();
//        }
//    }
//}
