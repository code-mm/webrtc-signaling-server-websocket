package org.ms.webrtc.signaling.data;

import org.ms.webrtc.signaling.bean.User;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Menbers {
    public static ConcurrentMap<String, User> users = new ConcurrentHashMap<>();

}
