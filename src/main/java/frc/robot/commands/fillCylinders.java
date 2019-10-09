/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;

public class fillCylinders extends CommandGroup {
  /**
   * Add your docs here.
   */
  public fillCylinders() {
    addParallel(new SetSolenoid(RobotMap.fillOne, false)); 
    addParallel(new SetSolenoid(RobotMap.fillTwo, false));
    addParallel(new SetSolenoid(RobotMap.fillThree, false));
    addParallel(new SetSolenoid(RobotMap.fillFour, false));
  }
}
