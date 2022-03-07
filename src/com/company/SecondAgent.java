package com.company;

import jade.core.Agent;

public class SecondAgent extends Agent {
    private static final long serialVersionUID = 1L;
    private int activity = 0;

    @Override
    public void setup() {
        Object[] args = getArguments();
        if (args != null && args.length > 0)
            activity = (Integer) args[0];
        System.out.println("Hello, I'm " + getLocalName()
                + " and I'm living in " +
                this.getContainerController().getName());

        if (activity == 1)
            addBehaviour(new MyOneShotBehaviour());
        else if (activity == 2)
            addBehaviour(new MyTickerBehaviour(this, 500));
        else if (activity == 3)
            addBehaviour(new MyWakerBehaviour(this, 5000));
        else if (activity == 4)
            addBehaviour(new MyCyclicBehaviour());
        else
            System.out.println("Agent " +
                    getAID().getName() + ": I have nothing to do!");
    }
}