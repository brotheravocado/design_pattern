/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch10.GumballMachineState;

/**
 *
 * @author dbswl
 */
public class WinnerState implements State{
    GumballMachine gumballMachine;
    
    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're alread giving you a Gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Please wait, we're alread giving you a Gumball");
    }

    @Override
    public void turnCrank() {
          System.out.println("Please wait, we're alread giving you a Gumball");
    }

    @Override
    public void dispense() {
        System.out.println("YOR'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("Oops,   out of  gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

public String toString()    {
    return "despensing two gumballs for your quarter, because YOU'RE A WINNER! ";
}
    
}
