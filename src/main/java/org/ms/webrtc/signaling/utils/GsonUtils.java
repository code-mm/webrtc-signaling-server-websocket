package org.ms.webrtc.signaling.utils;

import com.google.gson.Gson;

public class GsonUtils {


    private static final Gson instance = new Gson();

    public static Gson getInstance() {
        return instance;
    }
}
