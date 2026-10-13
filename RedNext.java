package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.CRServo;
import org.firstinspires.ftc.vision.VisionPortal;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.List;

@Autonomous(name="Robot: RedNext", group="Robot")

public class RedNext extends LinearOpMode{

 TcheHardware robot = new TcheHardware();
   

    private DcMotor tras_direita;
    private DcMotor tras_esquerda;
    private DcMotor frente_direita;
    private DcMotor frente_esquerda;
    private DcMotor motor_passagem;
    private DcMotor motor_atirador; 

    

    @Override
    public void runOpMode() {

         robot.init(hardwareMap);

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        
        robot.frente_direita.setPower(-1);
        robot.frente_esquerda.setPower(-1);
        robot.tras_direita.setPower(-1);
        robot.tras_esquerda.setPower(1);
        
        robot.motor_atirador.setPower(1);
        
           sleep(800);
           
        // Preparar atirador
        robot.frente_direita.setPower(0);
        robot.frente_esquerda.setPower(0);
        robot.tras_direita.setPower(0);
        robot.tras_esquerda.setPower(0);
        robot.motor_atirador.setPower(1);
        //definir tempo
           sleep(1700);
        
        //robot.motor_coletor.setPower(1);
        robot.frente_direita.setPower(0);
        robot.frente_esquerda.setPower(0);
        robot.tras_direita.setPower(0);
        robot.tras_esquerda.setPower(0);
        robot.motor_passagem.setPower(1);
        robot.motor_atirador.setPower(1);
        
           sleep(1000);
           //aumentamos o tempo do motor rodar
        robot.frente_direita.setPower(0);
        robot.frente_esquerda.setPower(0);
        robot.tras_direita.setPower(0);
        robot.tras_esquerda.setPower(0);
        
           sleep(200);
        //Separamos o lançamento das duas bolinhas do autônomo   
        //robot.frente_direita.setPower(-1);
        //robot.frente_esquerda.setPower(-1);
        //robot.tras_direita.setPower(1);
        //robot.tras_esquerda.setPower(-1);
          // sleep(1700);
           
        robot.frente_direita.setPower(-1);
        robot.frente_esquerda.setPower(1);
        robot.tras_direita.setPower(1);
        robot.tras_esquerda.setPower(1);
           sleep(1500);
           
         //Ensure that the OpMode is still active
        if (opModeIsActive()) {

            
        }

            
           
        
    }
}
