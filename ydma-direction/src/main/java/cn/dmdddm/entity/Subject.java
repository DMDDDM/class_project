package cn.dmdddm.entity;

public class Subject {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.id
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.name
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.direction_id
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    private Integer directionId;

    private Direction direction;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.id
     *
     * @return the value of subject.id
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    public Integer getId() {
        return id;
    }



    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.id
     *
     * @param id the value for subject.id
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.name
     *
     * @return the value of subject.name
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.name
     *
     * @param name the value for subject.name
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.direction_id
     *
     * @return the value of subject.direction_id
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    public Integer getDirectionId() {
        return directionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.direction_id
     *
     * @param directionId the value for subject.direction_id
     *
     * @mbg.generated Mon Sep 21 08:20:32 CST 2020
     */
    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }
}