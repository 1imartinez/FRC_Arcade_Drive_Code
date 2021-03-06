/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSP;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.frist.wpilibj.SpeedControllerGroup;

/**
 * This is a demo program showing the use of the DifferentialDrive class.
 * Runs the motors with arcade steering.
 */
public class Robot extends TimedRobot {
  
  
  
  
  
  private final SpeedControllerGroup leftControllerGroup = new SpeedControllerGroup(new PWMVictorSP(0), new PWMVictorSP(1));
  private final SpeedControllerGroup rightControllerGroup = new SpeedControllerGroup(new PWMVictorSP(2), new PWMVictorSP(3));
  
  private final PWMVictorSPX m_leftMotor = new PWMVictorSP(0);
  private final PWMVictorSPX m_rightMotor = new PWMVictorSP(1);
  private final DifferentialDrive m_robotDrive = new DifferentialDrive(leftControllerGroup, rightControllerGroup);
  private final Joystick m_stick = new Joystick(0);

  @Override
  public void teleopPeriodic() {
    // Drive with arcade drive.
    // That means that the Y axis drives forward
    // and backward, and the X turns left and right.
    m_robotDrive.arcadeDrive(m_stick.getY(), m_stick.getX());
  }
}
