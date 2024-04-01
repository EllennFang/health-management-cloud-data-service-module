package com.fang.health.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * health_measured 表（存放硬件采集计算的健康指标数据）
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HealthMeasured {

    /**
     * 数据 id
     */
    private Long id;

    /**
     * 用户 id
     */
    private Long userId;


    /** 设备号 (蓝牙编号)*/
    private String deviceId;

    /**
     * 心跳指标
     */
    private String heartbeat;

    /**
     * 血氧指标
     */
    private String spo;

    /**
     * 呼吸指标
     * */
    private String breathe;

    /** 睡眠指标 */
    private String sleep;

    /** 运动指标 */
    private String sport;

    /** 测量模型 */
    private String model;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;
}
