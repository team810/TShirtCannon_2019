/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static Spark frontL, frontR, backL, backR;
  public static Solenoid fillOne, fillTwo, fillThree, fillFour, fireOne, fireTwo, fireThree, fireFour;
  public static DifferentialDrive drive;

  public static void init(){
    frontL = new Spark(PortNumbers.FRONT_LEFT);
    frontR = new Spark(PortNumbers.FRONT_RIGHT);
    backL = new Spark(PortNumbers.BACK_LEFT);
    backR = new Spark(PortNumbers.BACK_RIGHT); 

    SpeedControllerGroup left = new SpeedControllerGroup(frontL, backL);
    SpeedControllerGroup right = new SpeedControllerGroup(frontR, backR);

    drive = new DifferentialDrive(left, right);
    drive.setSafetyEnabled(false);

    fillOne = new Solenoid(PortNumbers.PCM, PortNumbers.fillOne);
    fillTwo = new Solenoid(PortNumbers.PCM, PortNumbers.fillTwo);
    fillThree = new Solenoid(PortNumbers.PCM, PortNumbers.fillThree);
    fillFour = new Solenoid(PortNumbers.PCM, PortNumbers.fillFour);

    fireOne = new Solenoid(PortNumbers.PCM, PortNumbers.fireOne);
    fireTwo = new Solenoid(PortNumbers.PCM, PortNumbers.fireTwo);
    fireThree = new Solenoid(PortNumbers.PCM, PortNumbers.fireThree);
    fireFour = new Solenoid(PortNumbers.PCM, PortNumbers.fireFour);
  }
}

