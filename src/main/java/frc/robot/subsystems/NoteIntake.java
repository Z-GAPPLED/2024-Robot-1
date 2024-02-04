package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class NoteIntake extends SubsystemBase {
    public final WPI_TalonSRX intakeMotor = new WPI_TalonSRX(Constants.nIntakeConstants.kIntakeMotor);
    public final WPI_TalonSRX shooterMotor = new WPI_TalonSRX(Constants.nIntakeConstants.kShooterMotor);

        //float (decimal value) value is for the motor controller where 1= 100%  foward, -1 backwards, 0 is off
public void IntakeNote(float speed){
    intakeMotor.set(speed);
}


    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}