/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Defence_System.Util;

import java.util.ArrayList;

/**
 *
 * @author dilan
 */
public class Observable {
    private String area="";
    private int slider;
    private String sms="";
    private int spiner;
    private ArrayList<Observer> observerList=new ArrayList<>();
    
     public void addObserver(Observer ob){
        observerList.add(ob);
    }
    
    public void setArea(String area){
        if(!this.area.equals(area)){
            this.area=area;
            notifyObject();
        }
    }
    
    public void setSlider(int slider){
        if(this.slider!=slider){
            this.slider=slider;
            notifyObject();
        }
    }
    public void setMessage(String sms){
        if(!this.sms.equals(sms)){
            this.sms=this.sms+sms+"\n";
            notifyObject();
        }
    }
   
   
    
    
     private void notifyObject() {
        for(Observer ob:observerList){
            ob.changeArea(area);
            ob.changeSlider(slider);
            ob.sendMessage(sms);
          
           
            
        }
    }
}
