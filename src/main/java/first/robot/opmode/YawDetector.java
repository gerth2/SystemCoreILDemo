// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package first.robot.opmode;

import org.wpilib.networktables.NetworkTableInstance;
import org.wpilib.opmode.Autonomous;
import org.wpilib.opmode.PeriodicOpMode;
import org.wpilib.telemetry.Telemetry;
import org.wpilib.hardware.imu.OnboardIMU;

import first.robot.Robot;

@Autonomous(name = "Yaw Detector", group = "Demos")
public class YawDetector extends PeriodicOpMode {
  private final Robot robot;

  boolean isYawed = false;
  double startYawRad = 0;



  /** The Robot instance is passed into the opmode via the constructor. */
  public YawDetector(Robot robot) {
    this.robot = robot;
    startYawRad = this.robot.imu.getYawRadians();
  }

  /*
   * This method runs periodically, using the same period as the Robot instance.
   *
   * Additional periodic methods may be configured with addPeriodic(),
   * which can have periods that differ from the main Robot instance.
   */
  @Override
  public void periodic() {

    boolean isYawed = false;

    double movement = this.robot.imu.getYawRadians() - startYawRad;

    if(Math.abs(movement) > 0.5){
      isYawed = true;
    } else {
      isYawed = false;
    }

    Telemetry.log("YawSinceEnable", movement);
    Telemetry.log("isYawed", isYawed);

  }
}
