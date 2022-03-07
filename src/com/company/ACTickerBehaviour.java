package com.company;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

public class ACTickerBehaviour extends TickerBehaviour {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int temp = 0;
    private String val;
    private int acstate = 2;
    private int bostate = 2;
    private int tick = 1;
    private int[] tempes;
    private int[] prefer;

    public ACTickerBehaviour(ThirdAgent a,  int[] tempes, int[] prefer, long period) {
        super(a, period);
        this.tempes = tempes;
        this.prefer = prefer;

    }


    /**
     *
     */

    @Override
    protected void onTick() {
        for(int i=0;i<tempes.length;i++){
            if (prefer[0] > tempes[i]){
                System.out.println("Turning the Boiler ON!! Temperatures is "+tempes[i]);
                this.bostate = 1;
            }
            else if(prefer[1] < tempes[i]) {
                System.out.println("Turning the AC ON!! Temperature is " + tempes[i]);
                this.acstate = 1;
            }
            else if(prefer[0] <= tempes[i] && prefer[1] >= tempes[i]){
                if(this.acstate == 1){
                    this.acstate = 0;
                    System.out.println("Turning the AC OFF!! Temperature is "+tempes[i]);
                }
                if(this.bostate == 1){
                    this.bostate=0;
                    System.out.println("Turning the Boiler OFF!! Temperature is "+tempes[i]);
                }
            }
        }
            this.stop();

    }

}
