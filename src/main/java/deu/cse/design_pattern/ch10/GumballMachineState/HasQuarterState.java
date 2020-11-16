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
public class HasQuarterState implements State{

    GumballMachine gumballMachine;
    java.util.Random randomWinner = new java.util.Random(System.currentTimeMillis());
    
    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if(winner == 0 && gumballMachine.getCount() > 1){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    public String toString(){
        return "waiting for turn of crank";
    }
    
}