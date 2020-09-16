package cn.dmdddm.ydma.dao;

import cn.dmdddm.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Sep 14 22:26:57 CST 2020
     */
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Sep 14 22:26:57 CST 2020
     */
    @Insert({
        "insert into user (id, name, ",
        "password, nick_name, ",
        "position, sex, location, ",
        "signature, image, ",
        "regtime, salt)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{nickName,jdbcType=VARCHAR}, ",
        "#{position,jdbcType=VARCHAR}, #{sex,jdbcType=VARCHAR}, #{location,jdbcType=VARCHAR}, ",
        "#{signature,jdbcType=VARCHAR}, #{image,jdbcType=VARCHAR}, ",
        "#{regtime,jdbcType=TIMESTAMP}, #{salt,jdbcType=VARCHAR})"
    })
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Sep 14 22:26:57 CST 2020
     */
    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Sep 14 22:26:57 CST 2020
     */
    @Select({
        "select",
        "id, name, password, nick_name, position, sex, location, signature, image, regtime, ",
        "salt",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="signature", property="signature", jdbcType=JdbcType.VARCHAR),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="regtime", property="regtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Sep 14 22:26:57 CST 2020
     */
    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Mon Sep 14 22:26:57 CST 2020
     */
    @Update({
        "update user",
        "set name = #{name,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "position = #{position,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=VARCHAR},",
          "location = #{location,jdbcType=VARCHAR},",
          "signature = #{signature,jdbcType=VARCHAR},",
          "image = #{image,jdbcType=VARCHAR},",
          "regtime = #{regtime,jdbcType=TIMESTAMP},",
          "salt = #{salt,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);

    @Select({
            "select",
            "id, name, password, nick_name, position, sex, location, signature, image, regtime, ",
            "salt",
            "from user",
            "where name = #{name,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
            @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
            @Result(column="position", property="position", jdbcType=JdbcType.VARCHAR),
            @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
            @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
            @Result(column="signature", property="signature", jdbcType=JdbcType.VARCHAR),
            @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
            @Result(column="regtime", property="regtime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="salt", property="salt", jdbcType=JdbcType.VARCHAR)
    })
    User selectByName(String name);
}