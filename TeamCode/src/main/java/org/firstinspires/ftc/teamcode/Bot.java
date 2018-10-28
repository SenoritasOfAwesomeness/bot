package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "Bot", group = "")
public class Bot extends LinearOpMode {

  private DcMotor LeftWheel;
  private DcMotor RightWheel;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    LeftWheel = hardwareMap.dcMotor.get("Left Wheel");
    RightWheel = hardwareMap.dcMotor.get("Right Wheel");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      LeftWheel.setPower(3);
      RightWheel.setPower(3);
      sleep(5000);
      LeftWheel.setPower(-3);
      RightWheel.setPower(-3);
      sleep(5000);
    }
  }
}
