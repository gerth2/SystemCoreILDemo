// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package first.robot.opmode;

import org.wpilib.networktables.NetworkTableInstance;
import org.wpilib.opmode.Autonomous;
import org.wpilib.opmode.PeriodicOpMode;
import org.wpilib.telemetry.Telemetry;
import first.robot.Robot;

@Autonomous(name = "Apriltag Detector", group = "Demos")
public class ApriltTagDetector extends PeriodicOpMode {
  private final Robot robot;

  /** The Robot instance is passed into the opmode via the constructor. */
  public ApriltTagDetector(Robot robot) {
    this.robot = robot;
  }

  /*
   * This method runs periodically, using the same period as the Robot instance.
   *
   * Additional periodic methods may be configured with addPeriodic(),
   * which can have periods that differ from the main Robot instance.
   */
  @Override
  public void periodic() {

    boolean has1 = false;
    boolean has2 = false;

    var tid = NetworkTableInstance.getDefault().getTable("limelightsc3").getEntry("tid").getInteger(-1);

    has1 = tid == 1;
    has2 = tid == 2;

    Telemetry.log("tag1Visible", has1);
    Telemetry.log("tag2Visible", has2);
  }
}
