package org.firstinspires.ftc.FTCMain;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;


public class RobotHardware {
    
    public DcMotor backl = null;
    public DcMotor frontl = null;
    public DcMotor frontr = null;
    public DcMotor backr = null;
    
    public CRServo servol = null;
    
    
    HardwareMap hwMap = null;
    
    public void init(HardwareMap robotMap){
        hwMap = robotMap;
        
        //Define HW map to programing variables:
        
        //Define mecanum wheels here:
        
        backl = hwMap.get(DcMotor.class, "backl");
        frontl = hwMap.get(DcMotor.class, "frontl");
        frontr = hwMap.get(DcMotor.class, "frontr");
        backr = hwMap.get(DcMotor.class, "backr");
        
        servol = hwMap.get(CRServo.class, "servol");
        
        backl.setPower(0);
        frontl.setPower(0);
        frontr.setPower(0);
        backr.setPower(0);
        
        backl.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontl.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontr.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backr.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        
        backl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        frontl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        frontr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        backr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

        
        }
    
    
}
