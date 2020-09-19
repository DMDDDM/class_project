package cn.dmdddm.service;

import cn.dmdddm.entity.Course;
import cn.dmdddm.entity.YdmaConstant;
import cn.dmdddm.entity.YdmaResult;
import cn.dmdddm.dao.CourseMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseMapper courseMapper;

    /**
     * 根据ID 查询课程
     * @param courseId
     * @return
     */
    public YdmaResult getcourse(int courseId) {
        YdmaResult ydmaResult = new YdmaResult();

        Course course = courseMapper.selectByPrimaryKey(courseId);
        //如果对象为空
        if (course == null){
            ydmaResult.setCode(YdmaConstant.ERROR1);
            ydmaResult.setMsg("课程不存在");
            return ydmaResult;
        }
        ydmaResult.setCode(YdmaConstant.SUCCESS);
        ydmaResult.setMsg(YdmaConstant.QUERY_SUCCESS);
        ydmaResult.setData(course);
        ydmaResult.setDate(new Date());

        return ydmaResult;
    }

    /**
     *根据学科查询课程。
     *
     * @param subjectId     大类ID
     * @param page          页码
     * @param size          每页个数
     * @return
     */
    public YdmaResult getSubjectCourse(int subjectId, int page, int size) {
        YdmaResult ydmaResult = new YdmaResult();
        //设置查询分页
        Page<Course> p = PageHelper.startPage(page,size);
        //获取课程列表
        List<Course> courses = courseMapper.selectBySubjectId(subjectId);
        //查询为空时,执行
        if (courses.size() == 0){
            ydmaResult.setCode(YdmaConstant.ERROR1);
            ydmaResult.setMsg(YdmaConstant.QUERY_EMPTY_ERROR);
            ydmaResult.setDate(new Date());
            return ydmaResult;
        }
        ydmaResult.setCode(YdmaConstant.SUCCESS);
        ydmaResult.setMsg(YdmaConstant.QUERY_SUCCESS);
        ydmaResult.setData(courses);
        ydmaResult.setDate(new Date());

        return ydmaResult;
    }

    /**
     * 根据大类查询课程。
     *
     * @param directionId   大类ID
     * @param page          页码
     * @param size          每页个数
     * @return              YdmaResult
     */
    public YdmaResult loadDirectionCourses(int directionId, int page, int size) {
        YdmaResult ydmaResult = new YdmaResult();
        //设置查询分页
        Page<Course> p = PageHelper.startPage(page,size);
        //获取课程列表
        List<Course> courses = courseMapper.selectByDirectionId(directionId);
        //查询为空时,执行
        if (courses.size() == 0){
            ydmaResult.setCode(YdmaConstant.ERROR1);
            ydmaResult.setMsg(YdmaConstant.QUERY_EMPTY_ERROR);
            ydmaResult.setDate(new Date());
            return ydmaResult;
        }
        ydmaResult.setCode(YdmaConstant.SUCCESS);
        ydmaResult.setMsg(YdmaConstant.QUERY_SUCCESS);
        ydmaResult.setData(courses);
        ydmaResult.setDate(new Date());

        return ydmaResult;
    }
}
