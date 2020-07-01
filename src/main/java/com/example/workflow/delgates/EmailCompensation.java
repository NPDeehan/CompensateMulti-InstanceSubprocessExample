package com.example.workflow.delgates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named
public class EmailCompensation implements JavaDelegate {


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("...");
        System.out.println("... Compensation Triggered Happened for " + delegateExecution.getProcessInstanceId() + "...");
        System.out.println("...");
    }
}
