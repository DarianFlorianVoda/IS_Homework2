package com.company;

import jade.core.Agent;

public class ThirdAgent extends Agent {
    private static final long serialVersionUID = 1L;
    private int[] preferences;
    private int[] temperatures;

    @Override
    public void setup() {
        Object[] args = getArguments();
        if (args != null && args.length > 0) {
            preferences = (int[]) args[0];
            temperatures = (int[]) args[1];
        }
        System.out.println("Hello, I'm " + getLocalName()
                + " and I'm living in " +
                this.getContainerController().getName());

        addBehaviour(new ACTickerBehaviour(this, temperatures, preferences, 1000));
            System.out.println("Agent " +
                    getAID().getName() + ": I have nothing to do!");
    }
}