// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package first.robot.opmode;

import org.wpilib.networktables.NetworkTableInstance;
import org.wpilib.opmode.Autonomous;
import org.wpilib.opmode.PeriodicOpMode;
import org.wpilib.system.Timer;
import org.wpilib.telemetry.Telemetry;
import first.robot.Robot;

@Autonomous(name = "Blink", group = "Demos")
public class Blink extends PeriodicOpMode {
  private final Robot robot;

  boolean isOn;
  double lastChangeTime;

  /** The Robot instance is passed into the opmode via the constructor. */
  public Blink(Robot robot) {
    this.robot = robot;
    isOn = false;
    lastChangeTime = Timer.getTimestamp();
  }

  /*
   * This method runs periodically, using the same period as the Robot instance.
   *
   * Additional periodic methods may be configured with addPeriodic(),
   * which can have periods that differ from the main Robot instance.
   */
  @Override
  public void periodic() {

    
    if(Timer.getTimestamp() - lastChangeTime >= 0.25) {
      lastChangeTime = Timer.getTimestamp();
      isOn = !isOn;
    }

    Telemetry.log("BlinkyLight", isOn);
    
  }
}
