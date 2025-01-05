// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj.Joystick;


public class driveControl extends Command {
  /** Creates a new driveControl. */
  private DriveSubsystem DriveSubsystem;

  public Joystick leftShaft;
  public Joystick rightShaft;


  

   
  public DriveControl(DriveSubsystem driveSubsystem, Joystick leftShaft, Joystick rightShaft) {
    this.DriveSubsystem = driveSubsystem;
    this.leftShaft = leftShaft;
    this.rightShaft = rightShaft;
    //return(driveSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  @Override
  public void execute() {
    //set motor speed to x and y of joystick
    driveSubsystem.arcadeDrive((leftShaft.getY()), (leftShaft.getX()));


  }

  @Override
  public void end(boolean interrupted) {
 
  }

  @Override
  public boolean isFinished() {

    return false;
  }
}
