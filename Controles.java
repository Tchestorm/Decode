package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;


@TeleOp(name="Controles", group="TeleOp")

public class Controles extends OpMode{

    TcheHardware robot = new TcheHardware();
    

    // Quando init for pressionado

    @Override
    public void init() {
   
   robot.init(hardwareMap);
   telemetry.addData("Hello","World");
    }


    @Override
    public void init_loop() {
    }

 
    // Quando start for pressionado
 
    @Override
    public void start() {
        
    }
    
    @Override
    public void loop() {
        
        
       // Rodas mecanum

        double speedAdjust = 0.95;
        double drive = gamepad1.left_stick_y * speedAdjust;
        double strafe = -gamepad1.left_stick_x * speedAdjust;
        double twist = gamepad1.right_stick_x * speedAdjust;
        double speed = (drive + strafe + twist);
        double speed1 = (drive - strafe - twist);
        double speed2 = (drive + strafe - twist);
        double speed3 = (drive - strafe + twist); 

  robot.frente_esquerda.setPower((speed)*(speedAdjust)); 
  robot.tras_esquerda.setPower((speed2)*(speedAdjust));
  robot.frente_direita.setPower((speed1)*(speedAdjust));
  robot.tras_direita.setPower((speed3)*(speedAdjust));
         
         

        // Movimento motor 1 - elevador
             
         if (gamepad2.left_bumper == true) {
            robot.motor_passagem.setPower(0.8);
          } if (gamepad2.a == true) {
            robot.motor_passagem.setPower(-0.8);
           }else if(gamepad2.left_bumper==false && gamepad2.a == false){
            robot.motor_passagem.setPower(0);
         }
     
           if (gamepad2.b == true) {
            robot.motor_atirador.setPower(0.90);
           } if (gamepad2.x == true)  {
               robot.motor_atirador.setPower(-0.90);
           } else if (gamepad2.x == false && gamepad2.b == false) {
               robot.motor_atirador.setPower(0.10);
           }
        
         
    }
        
     @Override public void stop(){
     
        }
     }
