package cn.springmvc.dao;

import cn.springmvc.model.SysAction;
import cn.springmvc.model.SysActionExample;
import java.util.List;

public interface SysActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated
     */
    int insert(SysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated
     */
    int insertSelective(SysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated
     */
    List<SysAction> selectByExample(SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated
     */
    SysAction selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysAction record);
}