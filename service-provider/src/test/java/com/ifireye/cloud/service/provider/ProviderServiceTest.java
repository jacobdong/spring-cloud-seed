package com.ifireye.cloud.service.provider;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Map;


/**
 * @author JacobDong
 * @date 2018/5/4 14:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProviderServiceTest {

    @Resource
    private ProviderService providerService;

    @Test
    public void get() {
        Map map = providerService.get("001");
        Map map1 = providerService.get("001");
        Map map2 = providerService.get("002");
        log.info(JSON.toJSONString(map));
        log.info(JSON.toJSONString(map1));
        log.info(JSON.toJSONString(map2));
    }
}