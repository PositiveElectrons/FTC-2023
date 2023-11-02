package org.firstinspires.ftc.FTCMain;



public class RobotDrivebase {
    RobotHardware robot;
    
    public RobotDrivebase(RobotHardware robot){
        this.robot = robot;
    }
    // todo: write your code here
    
    public void moveMech(double x, double y, double rot) {
        
        robot.frontl.setPower((x+y+rot)*-1);
        robot.frontr.setPower((-x)+y-rot);
        robot.backl.setPower(((-x)+y+rot)*-1);
        robot.backr.setPower(x+y-rot);
        
    }

}