package com.company;

import jade.core.behaviours.WakerBehaviour;

public class MyWakerBehaviour extends WakerBehaviour {

    public MyWakerBehaviour(SecondAgent a, int i) {
        // TODO Auto-generated constructor stub
        super(a, i);
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    public MyWakerBehaviour(ThirdAgent thirdAgent, int i) {
        super(thirdAgent, i);
    }
}
