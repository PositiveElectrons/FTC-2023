package org.firstinspires.ftc.FTCMain;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp(name="Default TeleOp")

public class RobotTeleop extends OpMode {
    
    RobotHardware robot = new RobotHardware();
    
    @Override
    public void init() {
        robot.init(hardwareMap);
        telemetry.addData("Status: ", "Initialized");
        
    }
    @Override
    public void loop() {
        //loop
        telemetry.update();
        
    }
    @Override
    public void start() {
        robot.TestMotor.setPower(1);
    }
    
    
    
    
}