package cn.springmvc.dao;

import cn.springmvc.model.SysRoleAction;
import cn.springmvc.model.SysRoleActionExample;
import java.util.List;

public interface SysRoleActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_action
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_action
     *
     * @mbggenerated
     */
    int insert(SysRoleAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_action
     *
     * @mbggenerated
     */
    int insertSelective(SysRoleAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_action
     *
     * @mbggenerated
     */
    List<SysRoleAction> selectByExample(SysRoleActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_action
     *
     * @mbggenerated
     */
    SysRoleAction selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_action
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysRoleAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_action
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysRoleAction record);
}