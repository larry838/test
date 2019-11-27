package com.wshsoft.system.service;

import java.util.List;
import com.wshsoft.system.domain.SysLoginLog;

/**
 * 系统访问日志情况信息 服务层
 * 
 * @author Larry xie
 */
public interface SysLoginLogService
{
    /**
     * 新增系统登录日志
     * 
     * @param loginLog 访问日志对象
     */
    public void insertLoginLog(SysLoginLog loginLog);

    /**
     * 查询系统登录日志集合
     * 
     * @param loginLog 访问日志对象
     * @return 登录记录集合
     */
    public List<SysLoginLog> selectLoginLogList(SysLoginLog loginLog);

    /**
     * 批量删除系统登录日志
     * 
     * @param ids 需要删除的数据
     * @return
     */
    public int deleteLoginLogByIds(String ids);

    /**
     * 清空系统登录日志
     */
    public void cleanLoginLog();
}
