package cn.dmdddm.service;

import cn.dmdddm.dao.DirectionMapper;
import cn.dmdddm.dao.SubjectMapper;
import cn.dmdddm.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;

@Service
public class DirectionServiceImpl implements DirectionService{

    @Autowired
    private DirectionMapper directionMapper;
    @Autowired
    private RestTemplate restTemplate;

    public YdmaResult findAll() {
        YdmaResult ydmaResult = new YdmaResult();

        List<Direction> directions = directionMapper.findAll();

        for (Direction direction : directions){
            String url = "http://localhost:7002/course/direction/?directionId="+direction.getId()+"&size=3";
            YdmaResult courseResult = restTemplate.getForObject(url,YdmaResult.class);

            if (courseResult.getCode() == YdmaConstant.SUCCESS){
                List<Course> courses = (List<Course>) courseResult.getData();
                direction.setCourses(courses);
            }
        }
        ydmaResult.setCode(YdmaConstant.SUCCESS);
        ydmaResult.setMsg(YdmaConstant.QUERY_SUCCESS);
        ydmaResult.setData(directions);
        ydmaResult.setDate(new Date());

        return ydmaResult;
    }
}