package com.fang.health.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * App to服务端数据传输 Dto
 * App中将数据封装成Json格式发送到服务端，例如
 * {
 *     "heartbeat":”70”,
 *     "spo":98,
 * 	   "deviceId":”C0:4E:30:90:50:36”,
 * },
 * 上述为采集并且计算得到的健康指标数据封装成json格式发送到服务端。
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddDataDto {

    /**
     * 心跳指标
     */
    private String heartbeat;

    /**
     * 血氧指标
     */
    private String spo;

    /** 设备号 (蓝牙编号)*/
    private String deviceId;
}
