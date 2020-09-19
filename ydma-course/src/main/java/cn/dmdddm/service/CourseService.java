package cn.dmdddm.service;

import cn.dmdddm.entity.YdmaConstant;
import cn.dmdddm.entity.YdmaResult;
import org.springframework.stereotype.Service;

public interface CourseService {
    /**
     *
     * @param courseId
     * @return
     */
    YdmaResult getcourse (int courseId);

    /**
     *
     * @param subjectId
     * @param page
     * @param size
     * @return
     */
    YdmaResult getSubjectCourse(int subjectId, int page, int size);

    /**
     *
     * @param directionId
     * @param page
     * @param size
     * @return
     */
    YdmaResult loadDirectionCourses(int directionId, int page,int size);
}
