package cn.dmdddm.redis;

import cn.dmdddm.RunCourseBoot;
import cn.dmdddm.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RunCourseBoot.class})
public class TestRedisTemplate {
    @Autowired
    private ReactiveRedisTemplate<Object,Object> redis;
    @Test
    public void test1() throws Exception{
        Course course = new Course();
        redis.opsForValue().set("c",course);
    }

}


