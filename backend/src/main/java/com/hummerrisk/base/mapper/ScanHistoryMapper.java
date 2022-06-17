package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.ScanHistory;
import com.hummerrisk.base.domain.ScanHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScanHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    long countByExample(ScanHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int deleteByExample(ScanHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int insert(ScanHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int insertSelective(ScanHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    List<ScanHistory> selectByExampleWithBLOBs(ScanHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    List<ScanHistory> selectByExample(ScanHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    ScanHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int updateByExampleSelective(@Param("record") ScanHistory record, @Param("example") ScanHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") ScanHistory record, @Param("example") ScanHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int updateByExample(@Param("record") ScanHistory record, @Param("example") ScanHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int updateByPrimaryKeySelective(ScanHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(ScanHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scan_history
     *
     * @mbg.generated Wed Sep 15 16:27:56 CST 2022
     */
    int updateByPrimaryKey(ScanHistory record);
}