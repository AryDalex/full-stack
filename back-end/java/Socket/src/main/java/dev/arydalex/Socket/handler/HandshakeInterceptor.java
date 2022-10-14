package dev.arydalex.Socket.handler;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;
import java.util.Random;

public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {

//        attributes.put("user", getSuperHero());
//        attributes.put("user", "ary");

        String uri = request.getURI().toString();
        String username = uri.substring(uri.lastIndexOf("/") + 1);

        if(username.equalsIgnoreCase("")) attributes.put("user", getSuperHero());
        else attributes.put("user", username);

        return super.beforeHandshake(request, response, wsHandler, attributes);

    }

    protected String getSuperHero() {

        String[] superheros = {"Superman", "The Flash", "Thor", "Pantera Negra", "Batman", "Mulher Maravilha"};

        Random random = new Random();
        return superheros[random.nextInt(superheros.length)];

    }
}
