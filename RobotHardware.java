package org.firstinspires.ftc.FTCMain;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;


public class RobotHardware {
    
    public DcMotor TestMotor = null;
    
    HardwareMap hwMap = null;
    
    public void init(HardwareMap robotMap){
        hwMap = robotMap;
        
        //Define HW map to programing variables:
        
        TestMotor = hwMap.get(DcMotor.class, "testmotor");
        
        
        }
    
    
    // todo: write your code here
}
