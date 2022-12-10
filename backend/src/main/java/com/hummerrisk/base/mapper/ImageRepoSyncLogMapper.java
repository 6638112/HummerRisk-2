package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.ImageRepoSyncLog;
import com.hummerrisk.base.domain.ImageRepoSyncLogExample;
import com.hummerrisk.base.domain.ImageRepoSyncLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageRepoSyncLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    long countByExample(ImageRepoSyncLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int deleteByExample(ImageRepoSyncLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int insert(ImageRepoSyncLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int insertSelective(ImageRepoSyncLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    List<ImageRepoSyncLogWithBLOBs> selectByExampleWithBLOBs(ImageRepoSyncLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    List<ImageRepoSyncLog> selectByExample(ImageRepoSyncLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    ImageRepoSyncLogWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int updateByExampleSelective(@Param("record") ImageRepoSyncLogWithBLOBs record, @Param("example") ImageRepoSyncLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") ImageRepoSyncLogWithBLOBs record, @Param("example") ImageRepoSyncLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int updateByExample(@Param("record") ImageRepoSyncLog record, @Param("example") ImageRepoSyncLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int updateByPrimaryKeySelective(ImageRepoSyncLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(ImageRepoSyncLogWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_repo_sync_log
     *
     * @mbg.generated Thu Oct 20 07:33:40 CST 2022
     */
    int updateByPrimaryKey(ImageRepoSyncLog record);
}
