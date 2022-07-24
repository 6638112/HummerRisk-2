package com.hummerrisk.base.domain;

import java.io.Serializable;

public class HistoryCloudTaskItemWithBLOBs extends HistoryCloudTaskItem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_cloud_task_item.details
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    private String details;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_cloud_task_item.tags
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    private String tags;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_cloud_task_item.custom_data
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    private String customData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table history_cloud_task_item
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_cloud_task_item.details
     *
     * @return the value of history_cloud_task_item.details
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    public String getDetails() {
        return details;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_cloud_task_item.details
     *
     * @param details the value for history_cloud_task_item.details
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_cloud_task_item.tags
     *
     * @return the value of history_cloud_task_item.tags
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_cloud_task_item.tags
     *
     * @param tags the value for history_cloud_task_item.tags
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_cloud_task_item.custom_data
     *
     * @return the value of history_cloud_task_item.custom_data
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    public String getCustomData() {
        return customData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_cloud_task_item.custom_data
     *
     * @param customData the value for history_cloud_task_item.custom_data
     *
     * @mbg.generated Thu Jul 21 18:34:03 CST 2022
     */
    public void setCustomData(String customData) {
        this.customData = customData == null ? null : customData.trim();
    }
}