/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class Safety extends InstantCommand {

  Solenoid solenoid1, solenoid2;
  /**
   *
   * Add your docs here.
   */
  public Safety(Solenoid solenoid1, Solenoid solenoid2) {
    super();
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);

    this.solenoid1 = solenoid1;
    this.solenoid2 = solenoid2;
  }

  // Called once when the command executes
  @Override
  protected void initialize() {
    if(Robot.oi.safety.get()){
      new Fire(solenoid1, solenoid2).start();
    }

  }

}
