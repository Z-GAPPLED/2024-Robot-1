package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.Solenoid;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


public class noteIntake extends SubsystemBase {
  private final WPI_TalonSRX IntakeMotor = new WPI_TalonSRX(Constants.nIntakeConstants.kIntakeMotor);
  private final WPI_TalonSRX LaunchMotor1 = new WPI_TalonSRX(Constants.nIntakeConstants.kLaunchMotor1);
  private final WPI_TalonSRX LaunchMotor2 = new WPI_TalonSRX(Constants.nIntakeConstants.kLaunchMotor2);
  private final Solenoid s1 = new Solenoid( null, Constants.PNUConstants.kSolenoid1);
  //float (decimal value) value is for the motor controller where 1= 100%  foward, -1 backwards, 0 is off
public void IntakeNote(float speed){
  IntakeMotor.set(speed);
}
 //Boolean=true false, when calling BallRelease(boolean true/false) in code, 
  //it will drop to here and open/close accordingly
public void NoteRelease(boolean note) {
    s1.set(note);
}

public void LaunchBall(float speed){
  LaunchMotor1.set(speed);
  LaunchMotor2.set(speed);
}

  /**
   * Creates a new ExampleSubsystem.
   */ 

  //Declared varibles for Pneumatics

  //Boolean=true false, when calling BallRelease(boolean true/false) in code, 
  //it will drop to here and open/close accordingly
    // public void BallRelease(boolean ball) {
    //   s1.set(ball);
    // }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}