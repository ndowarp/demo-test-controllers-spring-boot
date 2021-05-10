package com.example.demotestcontrollersspringboot.controllers;

import com.example.demotestcontrollersspringboot.service.WelcomeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class WelcomeControllerTest {

    @Test
    void shouldSendWelcomeMessage() {
        //given
        WelcomeService welcomeService = Mockito.mock(WelcomeService.class);
        WelcomeController welcomeController = new WelcomeController(welcomeService);
        //when
        when(welcomeService.getWelcomeMessage("Juan")).thenReturn("Welcome Juan!");
        //then
        assertEquals("Welcome Juan!", welcomeController.welcome("Juan"));
    }
}