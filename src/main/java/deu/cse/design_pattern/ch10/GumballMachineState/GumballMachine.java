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
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    State state = soldOutState;
    int count = 0;
    
    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        
        this.count = numberGumballs;
        if(numberGumballs > 0){
            state = noQuarterState;
        }
    }
    public void insertQuarter(){
        state.insertQuarter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    void setState(State state){
        this.state = state;
    }
    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count = count -1;
        }
    }
    int getCount(){
        return count;
    }
    void refill(int count){ // this.count += count 가 더 현실적이다
        this.count = count;
        state = noQuarterState;
    }
    public State getState(){
        return state;
    }
    public State getSoldOutState(){
        return soldOutState;
    }
    public State getNoQuarterState(){
        return noQuarterState;
    }
    public State getHasQuarterState(){
        return hasQuarterState;
    }
    public State getSoldState(){
        return soldState;
    }
    public State getWinnerState(){
        return winnerState;
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc, ");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: "+count+"   gumball");
        if(count != 1){
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is "+ state +"\n");
        return result.toString();
    }
}
