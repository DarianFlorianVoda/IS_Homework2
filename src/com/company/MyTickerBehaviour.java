package com.company;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class MyTickerBehaviour extends TickerBehaviour {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private int count = 0;
    private Agent ab;
    public MyTickerBehaviour(Agent a, long period) {
        super(a, period);
        // TODO Auto-generated constructor stub
        this.name = a.getLocalName();
        this.ab = a;
    }


    /**
     *
     */

    @Override
    protected void onTick() {
        // TODO Auto-generated method stub
        this.count++;
        System.out.println("Agent " + name + " counted until " + count);
        if (count == 10) {
            this.stop();
            ab.doDelete();
        }

    }

}
