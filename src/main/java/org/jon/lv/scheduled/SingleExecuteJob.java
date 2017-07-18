package org.jon.lv.scheduled;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.jon.lv.date.DateUtils;

/**
 * @Package org.jon.lv.scheduled.SingleExecuteJob
 * @Description: 只执行一次
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/7/18 14:40
 * version V1.0.0
 */
public class SingleExecuteJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$:" + DateUtils.getCurrentTime());
    }
}
