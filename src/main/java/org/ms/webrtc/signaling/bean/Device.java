package org.ms.webrtc.signaling.bean;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.websocket.Session;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Device {

    // 设备类型
    private String type;
    // 设备名称
    private String name;
    // 设置登录IP
    private String ip;
    // 设备ID
    private String id;
    // session
    private Session session;

}
