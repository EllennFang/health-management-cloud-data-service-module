package com.fang.health.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * health_calculate 表（采集大量 PPG 原始数据推理得到的健康指标数据）
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthCalculate {

    /** 数据 id */
    private Long id;

    /** 用户 id */
    private Long userId;

    /** 设备号（蓝牙编号） */
    private String deviceId;

    /** 原始数据标识（元数据在 MongoDB 的 id） */
    private String originalDataId;

    /** 血压指标
     */
    private String bloodPressure;

    /** 血糖指标
     */
    private String bloodSugar;

    /** 代谢指标 */
    private String metabolize;

    /** 压力指标 */
    private String stress;

    /** 数据源 */
    private String source;

    /** 测量模型 （推理模型）*/
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
