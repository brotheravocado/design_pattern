/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deu.cse.design_pattern.ch06.multi;

/**
 *
 * @author dbswl
 */
public class RemoteLoader {
    public static void main(String[] args){
        
        RemoteControl remote = new RemoteControl();
        
        // 거실 전용 설정 : 슬롯 0
        Light livingRoomLight = new Light("거실");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        remote.setCommand(0,livingRoomLightOn, livingRoomLightOff);
        
        //부엌 전등 설정 : 슬롯 1
        Light kitchenLight = new Light("주방");
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        
        //거실 선풍기 설정 : 슬롯 2
        CeilingFan fan = new CeilingFan("거실");
        CeilingFanOnCommand fanOn = new CeilingFanOnCommand(fan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);
        remote.setCommand(2, fanOn, fanOff);
        
        System.out.println(remote);
        
        for(int i =0; i < RemoteControl.MAX_COMMANDS; i++){
            System.out.println("[슬롯 "+i+"]");
            remote.onButtonWasPushed(i);
            remote.offButtonWasPushed(i);
        }
        
    }
}
