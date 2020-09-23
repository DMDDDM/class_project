package cn.dmdddm.ydma.dao;

import cn.dmdddm.entity.Subject;
import org.apache.ibatis.jdbc.SQL;

public class SubjectSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    public String insertSelective(Subject record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("subject");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDirectionId() != null) {
            sql.VALUES("direction_id", "#{directionId,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    public String updateByPrimaryKeySelective(Subject record) {
        SQL sql = new SQL();
        sql.UPDATE("subject");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDirectionId() != null) {
            sql.SET("direction_id = #{directionId,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}