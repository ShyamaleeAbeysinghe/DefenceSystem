/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Defence_System;

import Defence_System.Util.Observable;
import Defence_System.View.MainControler;
import Defence_System.View.defences.Helicopter;
import Defence_System.View.defences.Submarine;
import Defence_System.View.defences.Tank;

/**
 *
 * @author dilan
 */
public class Starter {
    public static void main(String []args){
        Observable observable=new Observable();
        MainControler mainControler=new MainControler(observable);
        observable.addObserver(new Helicopter(mainControler,1));
        observable.addObserver(new Submarine(mainControler,2));
        observable.addObserver(new Tank(mainControler,3));
        mainControler.setVisible(true);
    }
}
