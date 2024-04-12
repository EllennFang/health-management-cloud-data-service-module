package com.fang.health.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * App to服务端数据传输 Dto
 * App中将数据封装成Json格式发送到服务端，例如
 * {
 *  "originDataL1":”26665,26674,25412,24532....24212”,
 * 	"originDataL2":”26665,26674,25412,24532....24212”,
 * 	"deviceId":”C0:4E:30:90:50:36”,
 * }
 * 上述为PPG信号数据封装成json格式发送到服务端，originDataL1为一个灯的采样数据，3万个逗号分隔的点。
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddOriginalDataDto {

    /**
     * 1号灯采样数据
     */
    private String originDataL1;

    /**
     * 2号灯采集数据
     */
    private String originalDataL2;

    /** 设备号 (蓝牙编号)*/
    private String deviceId;
}
