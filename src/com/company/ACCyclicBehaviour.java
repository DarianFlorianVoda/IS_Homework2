package com.company;

import jade.core.behaviours.CyclicBehaviour;

public class ACCyclicBehaviour extends CyclicBehaviour {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int low = 0;
    public ACCyclicBehaviour(ThirdAgent a, int i) {
        // TODO Auto-generated constructor stub
        super(a);
        this.low = i;
    }
    @Override
    public void action() {
        System.out.println("Turning the AC ON!!");

    }

}
