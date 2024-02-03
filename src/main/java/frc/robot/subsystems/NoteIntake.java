package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class NoteIntake extends SubsystemBase {
    public final WPI_TalonSRX IntakeMotor;

    public NoteIntake() {
        IntakeMotor = new WPI_TalonSRX(Constants.nIntakeConstants.kIntakeMotor);
    }

}