package org.ms.webrtc.signaling.server;

import com.google.gson.JsonElement;
import lombok.extern.slf4j.Slf4j;
import org.ms.webrtc.common.ConnectResponse;
import org.ms.webrtc.common.Event;
import org.ms.webrtc.common.InitRequest;
import org.ms.webrtc.signaling.utils.GsonUtils;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/ws")
@Component
@Slf4j
public class WebSocketServer {

    @OnOpen
    public void onOpenm(Session session) {
        ConnectResponse response = ConnectResponse.builder().session_id(session.getId()).build();
        session.getAsyncRemote().sendText(GsonUtils.getInstance().toJson(response));
    }

    @OnClose
    public void onClose(Session session) {

    }


    @OnMessage
    public void onMessage(String message, Session session) {

        Event event = GsonUtils.getInstance().fromJson(message, Event.class);

        String event_type = event.getEvent_type();

        if ("".equals(event_type)) {

            InitRequest data = (InitRequest) event.getData();

        }


    }


}
