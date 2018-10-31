package br.andre.protocolo.cucumber.stepdefs;

import br.andre.protocolo.ProtocoloApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ProtocoloApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
