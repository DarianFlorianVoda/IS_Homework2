package com.company;

import jade.core.Agent;

import java.util.List;

public class ThirdAgent extends Agent {
    private static final long serialVersionUID = 1L;
    private List<Integer> preferences;
    private List<Integer> temperatures;

    @Override
    public void setup() {
        Object[] args = getArguments();
        if (args != null && args.length > 0) {
            preferences = (List<Integer>) args[0];
            temperatures = (List<Integer>) args[1];
        }
        System.out.println("Hello, I'm " + getLocalName()
                + " and I'm living in " +
                this.getContainerController().getName());

        for(int i=0;i<=temperatures.size();i++){
            if (preferences.get(0) < temperatures.get(i))
                addBehaviour(new ACCyclicBehaviour(this, preferences.get(0)));
        }
        else if (preferences.get(1) > 23)
            addBehaviour(new ACCyclicBehaviour(this));
        else
            System.out.println("Agent " +
                    getAID().getName() + ": I have nothing to do!");
    }
}