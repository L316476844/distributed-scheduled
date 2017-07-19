package org.jon.lv.scheduled;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.jon.lv.date.DateUtils;
import org.springframework.stereotype.Service;

import java.io.*;

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

    private String file = "d:/home/data.txt";

    @Override
    public void execute(ShardingContext shardingContext) {

        String jobParameter = shardingContext.getJobParameter();

        String content = "------------时间--------------" + DateUtils.getCurrentTime() + "\r\n";
        method2(file, content);
    }

    public static void method2(String file, String content) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
            out.write(content);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
