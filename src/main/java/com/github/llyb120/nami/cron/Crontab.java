package com.github.llyb120.nami.cron;
import com.github.llyb120.nami.core.Async;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static com.github.llyb120.nami.core.Config.config;

public class Crontab {

    public static void start(){
        Async.execute(() -> {
            int i = -1;
            for (String crontab : config.crontabs) {
                i++;
                String[] arr = crontab.split("\\s*->\\s*");
                if(arr.length != 2){
                    continue;
                }
                Class clz;
                try{
                    clz = Class.forName(arr[1]);
                } catch (Exception e){
                    e.printStackTrace();
                    continue;
                }
                JobDetail jobDetail = JobBuilder.newJob(clz)
                    //定义name和group
                    .withIdentity("job" + i, "group")
                    //job需要传递的内容
//                .usingJobData("name", "sdas")
                    .build();
                //定义一个Trigger
                Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger" + i, "group")
                    //加入 scheduler之后立刻执行
                    .startNow()
                    //定时 ，每个1秒钟执行一次
                    .withSchedule(CronScheduleBuilder.cronSchedule(arr[0])).build();
                try {
                    //创建scheduler
                    Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
                    scheduler.scheduleJob(jobDetail, trigger);
                    scheduler.start(); //运行一段时间后关闭
                } catch (SchedulerException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
