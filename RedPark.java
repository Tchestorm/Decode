package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.CRServo;
import org.firstinspires.ftc.vision.VisionPortal;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.List;

@Autonomous(name="Robot: RedPark", group="Robot")

public class RedPark extends LinearOpMode {

 TcheHardware robot = new TcheHardware();
   
            

    private DcMotor tras_direita;
    private DcMotor tras_esquerda;
    private DcMotor frente_direita;
    private DcMotor frente_esquerda;
    

    @Override
    public void runOpMode() {

         robot.init(hardwareMap);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        
        // Andar para frente   
        robot.frente_direita.setPower(1);
        robot.frente_esquerda.setPower(1);
        robot.tras_direita.setPower(1);
        robot.tras_esquerda.setPower(1);
           sleep(600);
        
         //Ensure that the OpMode is still active
        if (opModeIsActive()) {

            
            }

            
           
        
    }
}
