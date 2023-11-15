package org.firstinspires.ftc.FTCMain.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.FTCMain.RobotDrivebase;
import org.firstinspires.ftc.FTCMain.RobotHardware;

@Autonomous(name="AutonomousLeft")

public class RobotAutoDriveL extends LinearOpMode {

    // todo: write your code here
    RobotHardware robot = new RobotHardware();
    RobotDrivebase drivebase = new RobotDrivebase(robot);
    
    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
        telemetry.addData("Status: ", "Initialized");
        telemetry.update();
        waitForStart();
        if (opModeIsActive()) {
            telemetry.addData("Status: ", "Running");
            telemetry.update();
            drivebase.moveMech(0.5,0.0,0.0);
            sleep(500);
            drivebase.moveMech(0,0.5,0);
            sleep(10000);
            drivebase.moveMech(0,0,0);
        }
    }
}
