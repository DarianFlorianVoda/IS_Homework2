package com.company;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        jade.core.Runtime rt = jade.core.Runtime.instance();
        Profile p = new ProfileImpl();
        AgentContainer mc = rt.createMainContainer(p);
        int[] preferences = new int[2];
        preferences[0] = 21;
        preferences[1] = 23;
        int[] temperatures = new int[10];
        preferences[0] = 18;
        preferences[1] = 19;
        try {
            /*AgentController rma = mc.createNewAgent("rma", "jade.tools.rma.rma", null);
            rma.start();
            AgentController ac = mc.createNewAgent("John", "com.company.FirstAgent", null);
            System.out.println(ac.getState() + "!");
            ac.start();
            mc.createNewAgent("Jane", "com.company.SecondAgent", null).start();
            mc.createNewAgent("Peter", "com.company.SecondAgent", new Object[]{Integer.valueOf(1)}).start();
            mc.createNewAgent("Costica", "com.company.SecondAgent", new Object[]{Integer.valueOf(2)}).start();
             */
            AgentController rma = mc.createNewAgent("rma", "jade.tools.rma.rma", null);
            rma.start();
            AgentController H1 = mc.createNewAgent("Mirciulica", "com.company.ThirdAgent", new Object[]{preferences, temperatures});
            H1.start();

        } catch (StaleProxyException e) {
            e.printStackTrace();
        }

    }
}