
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.Safety;
import frc.robot.commands.fillCylinders;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick gamepad;
  public JoystickButton fillCylinders, fire1, fire2, fire3, fire4, safety;

  public OI(){
    gamepad = new Joystick(PortNumbers.GAMEPAD);

    fillCylinders = new JoystickButton(gamepad, 1);
    fillCylinders.whenPressed(new fillCylinders());

    fire1 = new JoystickButton(gamepad, 1);
    fire1.whenPressed(new Safety(RobotMap.fillOne, RobotMap.fireOne));
    fire2 = new JoystickButton(gamepad, 3);
    fire2.whenPressed(new Safety(RobotMap.fillTwo, RobotMap.fireTwo));
    fire3 = new JoystickButton(gamepad, 4);
    fire3.whenPressed(new Safety(RobotMap.fillThree, RobotMap.fireThree));
    fire4 = new JoystickButton(gamepad, 2);
    fire4.whenPressed(new Safety(RobotMap.fillFour, RobotMap.fireFour));

    safety = new JoystickButton(gamepad, 5);

  }
}
