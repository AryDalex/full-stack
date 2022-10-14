package dev.arydalex.Socket.handler;

import com.google.gson.Gson;
import dev.arydalex.Socket.models.PadoLabsMenssage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ChatRoom extends AbstractWebSocketHandler {

    public final static List<WebSocketSession> sessionList = Collections.synchronizedList(new ArrayList<>());

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {

        System.out.println("NEW SESSION CREATED...");
//        System.out.println(session.getAttributes().get("user").toString());
        sessionList.add(session);

        session.sendMessage(new TextMessage("{\"user\":\" "
                + session.getAttributes().get("user").toString()
                + "\",\"message\":\" " + getRandomMessage() +" \"}"));


//        session.sendMessage(new TextMessage("Você logou! " + "Usuário: " + session.getAttributes().get("user").toString()));
//
        for(WebSocketSession webSocketSession: sessionList) {
            webSocketSession.sendMessage(new TextMessage("{\"user\":\" "
                    + session.getAttributes().get("user").toString()
                    + "\",\"message\":\" " + "Estou online!" +" \"}"));
        }

        // TODO CHECK IF NEEDED
        super.afterConnectionEstablished(session);

    }

    private String getRandomMessage()
    {
        String[] messages = {"Cai de paraquedas no servidor!", "To na area", "É hora do jogo!"};
        Random random = new Random();
        return messages[random.nextInt(messages.length)];
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

        Gson gson = new Gson();
        PadoLabsMenssage padoLabsMenssage = gson.fromJson(message.getPayload(), PadoLabsMenssage.class);

        System.out.println(padoLabsMenssage);

        if(padoLabsMenssage.getUser().equalsIgnoreCase("")) {

            for(WebSocketSession webSocketSession: sessionList) {

//                webSocketSession.sendMessage(new TextMessage(session.getAttributes().get("user").toString() + ": " + padoLabsMenssage.getMessage()));
                webSocketSession.sendMessage(new TextMessage("{\"user\":\" "
                        + session.getAttributes().get("user").toString()
                        + "\",\"message\":\" " + padoLabsMenssage.getMessage() +" \"}"));

            }

        }

        for(WebSocketSession webSocketSession: sessionList) {

            if(webSocketSession.getAttributes().get("user").toString().equalsIgnoreCase(padoLabsMenssage.getUser())) {

//                webSocketSession.sendMessage(new TextMessage(session.getAttributes().get("user").toString() + ": " + padoLabsMenssage.getMessage()));
                webSocketSession.sendMessage(new TextMessage("{\"user\":\" "
                        + session.getAttributes().get("user").toString()
                        + "\",\"message\":\" " + padoLabsMenssage.getMessage() +" \"}"));

            }

        }

        super.handleTextMessage(session, message);

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {

        sessionList.remove(session);
        System.out.println("SESSION: ");
        sessionList.forEach(webSocketSession -> {
            System.out.println(webSocketSession.getAttributes().get("user").toString());
        });
        System.out.println("---------------------------------------");

        for(WebSocketSession webSocketSession: sessionList) {
            webSocketSession.sendMessage(new TextMessage("{\"user\":\" "
                    + session.getAttributes().get("user").toString()
                    + "\",\"message\":\" " + "Estou offline!" +" \"}"));
        }

        super.afterConnectionClosed(session, status);

    }

}
