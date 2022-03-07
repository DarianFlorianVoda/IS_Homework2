package com.company;

import jade.core.Agent;

// To define our own type of agent, we inherit the Agent class from jade.core package
public class FirstAgent extends Agent
{
    // Agent class implements Serializable interface, so we can serialize "objects", i.e. agents, of type FirstAgent
    private static final long serialVersionUID = 1L;

    // Overriding the setup () method inherited from Agent; everything the agent knows/has to
// do is put in this method;
// it is similar to the run() method from Threads.
    @Override
    public void setup()
    {
// For now it is just showing up, displaying its name and where it lives (container name)
        System.out.println("Hi, my name is " + getLocalName() + " and live in " +
                this.getContainerController().getName());
    }
}
