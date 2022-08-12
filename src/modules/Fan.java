/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

/**
 *
 * @author Nurlybek
 */
public class Fan {

    private int speed;
    private String direction;

    public Fan() {
        this.speed = 0;
        this.direction = "FORWARD";
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    @Override
    public String toString() {
            return String.format("The fan is working on %d speed in %s direction", getSpeed(), getDirection());
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    public void speedUp() {
        if (this.speed == 3) {
                this.speed = 0;
                System.out.println("The fan is stopped");
        } else {
                this.speed++;
                System.out.println("The fan is working on " + String.valueOf(getSpeed()) + " speed in " + getDirection() + " direction");
        }
        
    } 
    
    public void changeDirection() {
        if (this.speed == 0) {
            System.out.println("The fan is stopped, you cannot change the direction");
        }
        else{
            direction = (direction == "FORWARD") ? "BACKWARD" : "FORWARD";
            System.out.println("The fan is working on " + String.valueOf(getSpeed()) + " speed in " + getDirection() + " direction");
        }
    }
}
