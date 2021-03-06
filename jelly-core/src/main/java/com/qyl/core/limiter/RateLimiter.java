package com.qyl.core.limiter;

import com.qyl.common.entity.LimiterRule;

/**
 * @Author: qyl
 * @Date: 2021/3/28 23:25
 */
public interface RateLimiter {

    void init(LimiterRule rule);

    /**
     * 获取继续执行的资格
     */
    boolean tryAcquire();

    /**
     * 黑、白名单下获取继续执行的资格
     */
    boolean tryAcquire(String user);

    String getId();

    LimiterRule getLimiterRule();
}
