// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class Falcon_500 extends SubsystemBase {
  /** Creates a new Falcon_500. */
  private static WPI_TalonFX falcon_motor_dev1 = new WPI_TalonFX(2);
  private static WPI_TalonFX falcon_motor_dev2 = new WPI_TalonFX(3);
  public Falcon_500() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    //ok lol
  }
  public void Speed(double speed){
    falcon_motor_dev1.set(ControlMode.PercentOutput,speed);

    
    
    falcon_motor_dev2.set(ControlMode.Follower,2);
  }

}
