package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.hardware.dfrobot.HuskyLens;

public class TcheHardware {


// definir motores
public DcMotor tras_direita;
public DcMotor tras_esquerda;
public DcMotor frente_direita;
public DcMotor frente_esquerda;
public DcMotor motor_atirador;
public DcMotor motor_passagem;

// criar o hardware map
HardwareMap hardwareMap;

public void init(HardwareMap hardwareMap) {

    // associando nomes do hardware
    tras_direita = hardwareMap.get(DcMotor.class, "tras_direita");
    tras_esquerda = hardwareMap.get(DcMotor.class, "tras_esquerda");
    frente_direita = hardwareMap.get(DcMotor.class, "frente_direita");
    frente_esquerda = hardwareMap.get(DcMotor.class, "frente_esquerda");

    // direção dos motores
    // tras_direita.setDirection(DcMotor.Direction.REVERSE);
    tras_esquerda.setDirection(DcMotor.Direction.REVERSE);

    // outros motores
    motor_passagem = hardwareMap.get(DcMotor.class, "motor_passagem");
    motor_atirador = hardwareMap.get(DcMotor.class, "motor_atirador");

    // zerar potência
    tras_direita.setPower(0);
    tras_esquerda.setPower(0);
    frente_direita.setPower(0);
    frente_esquerda.setPower(0);
    motor_passagem.setPower(0);
    motor_atirador.setPower(0);

    // modo dos motores
    tras_direita.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    tras_esquerda.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    frente_direita.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    frente_esquerda.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    motor_passagem.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    motor_atirador.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

    // comportamento ao parar
    frente_esquerda.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    tras_direita.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    tras_esquerda.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    frente_direita.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    motor_passagem.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    motor_atirador.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
}
}
