package com.ifireye.cloud.service.provider;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author JacobDong
 * @date 2018/5/4 14:54
 */
@Service
public class ProviderService {

    @Cacheable(value = "tkMap")
    public Map get(String tk) {
        Map map = new HashMap();
        map.put("tk", tk);
        map.put("ut", System.currentTimeMillis());
        return map;
    }
}
