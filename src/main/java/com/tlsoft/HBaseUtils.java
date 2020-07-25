package com.tlsoft;

import com.tlsoft.config.HbaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.Map;

@DependsOn("springContextHolder")
@Component
public class HBaseUtils {
    @Autowired
    private HbaseConfig hbaseConfig_;

    private static HbaseConfig hbaseConfig = SpringContextHolder.getBean("hbaseConfig");

    private HBaseUtils() {
        Map<String, String> map = hbaseConfig.getConfigMap();
        for (Map.Entry<String,String> entry :map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
