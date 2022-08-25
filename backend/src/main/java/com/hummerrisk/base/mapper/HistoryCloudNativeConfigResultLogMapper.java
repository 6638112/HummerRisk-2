package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.HistoryCloudNativeConfigResultLog;
import com.hummerrisk.base.domain.HistoryCloudNativeConfigResultLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryCloudNativeConfigResultLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    long countByExample(HistoryCloudNativeConfigResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int deleteByExample(HistoryCloudNativeConfigResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int insert(HistoryCloudNativeConfigResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int insertSelective(HistoryCloudNativeConfigResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    List<HistoryCloudNativeConfigResultLog> selectByExampleWithBLOBs(HistoryCloudNativeConfigResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    List<HistoryCloudNativeConfigResultLog> selectByExample(HistoryCloudNativeConfigResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    HistoryCloudNativeConfigResultLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int updateByExampleSelective(@Param("record") HistoryCloudNativeConfigResultLog record, @Param("example") HistoryCloudNativeConfigResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") HistoryCloudNativeConfigResultLog record, @Param("example") HistoryCloudNativeConfigResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int updateByExample(@Param("record") HistoryCloudNativeConfigResultLog record, @Param("example") HistoryCloudNativeConfigResultLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int updateByPrimaryKeySelective(HistoryCloudNativeConfigResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(HistoryCloudNativeConfigResultLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_config_result_log
     *
     * @mbg.generated Sat Aug 20 02:02:31 CST 2022
     */
    int updateByPrimaryKey(HistoryCloudNativeConfigResultLog record);
}