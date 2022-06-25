package com.hummerrisk.base.domain;

import java.io.Serializable;

public class CloudTaskItemLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_task_item_log.id
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_task_item_log.task_item_id
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    private String taskItemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_task_item_log.resource_id
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    private String resourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_task_item_log.create_time
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_task_item_log.operator
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_task_item_log.operation
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    private String operation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_task_item_log.result
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    private Boolean result;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_task_item_log.output
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    private String output;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_task_item_log
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_task_item_log.id
     *
     * @return the value of cloud_task_item_log.id
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_task_item_log.id
     *
     * @param id the value for cloud_task_item_log.id
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_task_item_log.task_item_id
     *
     * @return the value of cloud_task_item_log.task_item_id
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public String getTaskItemId() {
        return taskItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_task_item_log.task_item_id
     *
     * @param taskItemId the value for cloud_task_item_log.task_item_id
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public void setTaskItemId(String taskItemId) {
        this.taskItemId = taskItemId == null ? null : taskItemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_task_item_log.resource_id
     *
     * @return the value of cloud_task_item_log.resource_id
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_task_item_log.resource_id
     *
     * @param resourceId the value for cloud_task_item_log.resource_id
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_task_item_log.create_time
     *
     * @return the value of cloud_task_item_log.create_time
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_task_item_log.create_time
     *
     * @param createTime the value for cloud_task_item_log.create_time
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_task_item_log.operator
     *
     * @return the value of cloud_task_item_log.operator
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_task_item_log.operator
     *
     * @param operator the value for cloud_task_item_log.operator
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_task_item_log.operation
     *
     * @return the value of cloud_task_item_log.operation
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_task_item_log.operation
     *
     * @param operation the value for cloud_task_item_log.operation
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_task_item_log.result
     *
     * @return the value of cloud_task_item_log.result
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_task_item_log.result
     *
     * @param result the value for cloud_task_item_log.result
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public void setResult(Boolean result) {
        this.result = result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_task_item_log.output
     *
     * @return the value of cloud_task_item_log.output
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public String getOutput() {
        return output;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_task_item_log.output
     *
     * @param output the value for cloud_task_item_log.output
     *
     * @mbg.generated Sat Jun 25 11:40:38 CST 2022
     */
    public void setOutput(String output) {
        this.output = output == null ? null : output.trim();
    }
}