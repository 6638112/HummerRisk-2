package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.PackageResult;
import com.hummerrisk.base.domain.PackageResultExample;
import com.hummerrisk.base.domain.PackageResultWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PackageResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    long countByExample(PackageResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int deleteByExample(PackageResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int insert(PackageResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int insertSelective(PackageResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    List<PackageResultWithBLOBs> selectByExampleWithBLOBs(PackageResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    List<PackageResult> selectByExample(PackageResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    PackageResultWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int updateByExampleSelective(@Param("record") PackageResultWithBLOBs record, @Param("example") PackageResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") PackageResultWithBLOBs record, @Param("example") PackageResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int updateByExample(@Param("record") PackageResult record, @Param("example") PackageResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int updateByPrimaryKeySelective(PackageResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(PackageResultWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table package_result
     *
     * @mbg.generated Wed Jun 08 02:46:46 CST 2022
     */
    int updateByPrimaryKey(PackageResult record);
}
