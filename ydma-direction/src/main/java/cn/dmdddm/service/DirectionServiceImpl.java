package cn.dmdddm.service;

import cn.dmdddm.dao.DirectionMapper;
import cn.dmdddm.entity.Direction;
import cn.dmdddm.entity.YdmaConstant;
import cn.dmdddm.entity.YdmaResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DirectionServiceImpl implements DirectionService{

    @Autowired
    DirectionMapper directionMapper;

    public YdmaResult findAll() {
        YdmaResult ydmaResult = new YdmaResult();

        List<Direction> directions = directionMapper.findAll();

        ydmaResult.setCode(YdmaConstant.SUCCESS);
        ydmaResult.setMsg(YdmaConstant.QUERY_SUCCESS);
        ydmaResult.setData(directions);
        ydmaResult.setDate(new Date());

        return ydmaResult;
    }
}
