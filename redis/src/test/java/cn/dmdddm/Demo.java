package cn.dmdddm;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class Demo {
    @Test
    public void testRedis(){
        Jedis jedis = new Jedis("localhost",6379);
        System.out.println(jedis);
    }
}
