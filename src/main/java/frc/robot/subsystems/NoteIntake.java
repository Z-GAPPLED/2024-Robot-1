package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.ctre.phoenix.motorcontrol.InvertType;

public class NoteIntake extends SubsystemBase {
    public final WPI_TalonSRX intakeMotor1 = new WPI_TalonSRX(Constants.MotorPorts.IntakeMotorPort);
    public final WPI_TalonSRX intakeMotor2 = new WPI_TalonSRX(Constants.MotorPorts.IntakeMotor2Port);
    public final WPI_TalonSRX shooterMotor1 = new WPI_TalonSRX(Constants.MotorPorts.ShooterMotorPort);
    public final WPI_TalonSRX shooterMotor2 = new WPI_TalonSRX(Constants.MotorPorts.ShooterMotor2Port);

    

        //float (decimal value) value is for the motor controller where 1= 100%  foward, -1 backwards, 0 is off
public void IntakeNote(float speed){
    intakeMotor1.set(speed);
    intakeMotor2.set(speed);
    intakeMotor1.setInverted(false);
    intakeMotor2.setInverted(false);

}


    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}