package org.jon.lv.scheduled;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.jon.lv.date.DateUtils;
import org.springframework.stereotype.Service;

/**
 * @Package org.jon.lv.scheduled.DemoJob
 * @Description: DemoJob
 * @Copyright: Copyright (c) 2016
 * Author lv bin
 * @date 2017/6/27 14:14
 * version V1.0.0
 */
@Service
public class DemoJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println("------------时间--------------" + DateUtils.getCurrentTime());
    }
}
