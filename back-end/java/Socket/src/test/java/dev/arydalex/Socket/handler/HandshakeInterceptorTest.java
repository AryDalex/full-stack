package dev.arydalex.Socket.handler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandshakeInterceptorTest {

    @Test
    void getSuperHero() {

        HandshakeInterceptor handshakeInterceptor = new HandshakeInterceptor();
        String superHero = (String) handshakeInterceptor.getSuperHero();
        System.out.println(superHero);

    }

}