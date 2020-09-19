package cn.dmdddm.web;

import cn.dmdddm.entity.YdmaResult;
import cn.dmdddm.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("course/get")
    public YdmaResult getCourse(int courseId){
        return courseService.getcourse(courseId);
    }

    /**
     * 通过科目ID 查询课程。
     *
     * @param subjectId 科目ID
     * @param page      页码
     * @param size      每页个数
     * @return
     */
    @GetMapping("course/subject")
    public YdmaResult getSubjectCourse(
            int subjectId,
            @RequestParam(name = "page",required = false,defaultValue = "1")
            int page,
            @RequestParam(name = "size",required = false,defaultValue = "3")
            int size){
        return courseService.getSubjectCourse(subjectId,page,size);
    }

    /**
     * 通过大类查找课程。
     *
     * @param directionId   大类ID
     * @param page          页码
     * @param size          每页个数
     * @return              YdmaResult
     */
    @GetMapping("course/direction")
    public YdmaResult loadDirectionCourses(
            int directionId,
            @RequestParam(name = "page",required = false,defaultValue = "1")
                    int page,
            @RequestParam(name = "size",required = false,defaultValue = "3")
                    int size){
        return courseService.loadDirectionCourses(directionId,page,size);
    }




}
