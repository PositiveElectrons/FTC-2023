package org.firstinspires.ftc.FTCMain;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp(name="Default TeleOp")

public class RobotTeleop extends OpMode {
    
    RobotHardware robot = new RobotHardware();
    RobotDrivebase drivebase = new RobotDrivebase(robot);
    
    @Override
    public void init() {
        robot.init(hardwareMap);
        telemetry.addData("Status: ", "Initialized");
        
    }
    @Override
    public void loop() {
        //loop
        drivebase.moveMech(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x);
        if (gamepad1.a){
            MoveServo();
        }
        telemetry.update(); 
        
    }
    @Override
    public void start() {
        telemetry.addData("Status: ", "Running");
    }
    
    private void MoveServo(){
        robot.servol.getController().setServoPosition(0,0.1);
    }
    
    
}