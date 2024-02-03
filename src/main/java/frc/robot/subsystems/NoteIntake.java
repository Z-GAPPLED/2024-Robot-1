package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class NoteIntake extends SubsystemBase {
    private final WPI_TalonSRX IntakeMotor = new WPI_TalonSRX(Constants.nIntakeConstants.kIntakeMotor);

    //float (decimal value) value is for the motor controller where 1= 100%  foward, -1 backwards, 0 is off
public void IntakeNote(float speed){
    IntakeMotor.set(speed);
}


    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}

