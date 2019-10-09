/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Fire extends CommandGroup {
  /**
   * Add your docs here.
   */
  public Fire(Solenoid solenoid1, Solenoid solenoid2 ) {
    addSequential(new SetSolenoid(solenoid1, true));
    addSequential(new SetSolenoid(solenoid2, true));
    addSequential(new Wait(.25));
    addSequential(new SetSolenoid(solenoid2, false));
    addSequential(new Wait(.1));
    addSequential(new SetSolenoid(solenoid1, false));
  }
}
