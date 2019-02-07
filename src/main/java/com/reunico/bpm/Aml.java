package com.reunico.bpm;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class Aml implements JavaDelegate {
    public void execute(DelegateExecution execution) throws Exception {
        Random rand = new Random();
        execution.setVariable("toAML", rand.nextBoolean());
    }
}
