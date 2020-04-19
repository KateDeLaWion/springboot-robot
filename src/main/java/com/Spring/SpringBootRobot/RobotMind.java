package com.Spring.SpringBootRobot;

public class RobotMind {

    // 1.1 define/let  variables
    String eleft;
    String eright;
    String eforward;


    // 1.2 Getters and Setters
    public String getEleft() {
        return eleft;
    }
    public void setEleft(String eleft) {
        this.eleft = eleft;
    }
    public String getEright() {
        return eright;
    }
    public void setEright(String eright) {
        this.eright = eright;
    }
    public String getEforward() {
        return eforward;
    }
    public void setEforward(String eforward) {
        this.eforward = eforward;
    }

    // 1.3 This is a constructor
    public RobotMind(String eleft, String eright, String eforward){
        this.eleft = eleft;
        this.eright = eright;
        this.eforward = eforward;
    }


    // 2.  instantiate Employee
    public RobotMind(){
    }


    //  3.   function in this Class Employee
    @Override
    public String toString(){
        return "Robot's mind has decided to make { " +
                "eleft= " + eleft +
                ", eright='" + eright + '\'' +
                ", eforward='" + eforward + '\'' +
                '}';
        // alternative way to write above 3 lines
//                ", eright='" + eright + "'" +
//                ", eforward='" + eforward + "'" +
//                "}";
    }



}
