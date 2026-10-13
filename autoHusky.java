package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.hardware.dfrobot.HuskyLens; // Importação da HuskyLens

@Autonomous(name="Robot: HuskyLens", group="Robot")
public class autoHusky extends LinearOpMode {

    TcheHardware robot = new TcheHardware();
    private HuskyLens huskyLens; // Declaração do sensor HuskyLens

    @Override
    public void runOpMode() {
        // Inicialização do hardware do robô
        robot.init(hardwareMap);

        // Mapeamento e configuração da HuskyLens
        huskyLens = hardwareMap.get(HuskyLens.class, "huskylens");
        huskyLens.selectAlgorithm(HuskyLens.Algorithm.COLOR_RECOGNITION);

        telemetry.addData("Status", "Aguardando início");
        telemetry.update();

        // Aguarda o início do jogo (Start)
        waitForStart();


        // Verificação dos IDs da HuskyLens durante o período ativo
        if (opModeIsActive()) {
            // Obtém a lista de blocos detectados pela HuskyLens
            HuskyLens.Block[] blocks = huskyLens.blocks();
            telemetry.addData("Blocos detectados", blocks.length);

            boolean corEncontrada = false;

            for (HuskyLens.Block block : blocks) {
                telemetry.addData("Cor ID Detectada", block.id);

                if (block.id == 1) {
                    // Color ID 1 -> Mover para trás
                    telemetry.addData("Ação", "ID 1 detectado: Movendo para TRÁS");
                    telemetry.update();
                    moverParaTras();
                    sleep(1000); // Tempo de movimento (ajuste conforme necessário)
                    pararRobo();
                    corEncontrada = true;
                    break;
                } else if (block.id == 2) {
                    // Color ID 2 -> Mover para frente
                    telemetry.addData("Ação", "ID 2 detectado: Movendo para FRENTE");
                    telemetry.update();
                    moverParaFrente();
                    sleep(1000); // Tempo de movimento (ajuste conforme necessário)
                    pararRobo();
                    corEncontrada = true;
                    break;
                }
            }

            if (!corEncontrada) {
                telemetry.addData("Ação", "Nenhuma cor conhecida foi detectada");
            }

            telemetry.update();
        }
    }

    // Métodos auxiliares de movimentação com base na sua configuração de motores
    private void moverParaFrente() {
        robot.frente_direita.setPower(1);
        robot.frente_esquerda.setPower(1);
        robot.tras_direita.setPower(1);
        robot.tras_esquerda.setPower(-1);
    }

    private void moverParaTras() {
        robot.frente_direita.setPower(-1);
        robot.frente_esquerda.setPower(-1);
        robot.tras_direita.setPower(-1);
        robot.tras_esquerda.setPower(1);
    }

    private void pararRobo() {
        robot.frente_direita.setPower(0);
        robot.frente_esquerda.setPower(0);
        robot.tras_direita.setPower(0);
        robot.tras_esquerda.setPower(0);
    }
}
