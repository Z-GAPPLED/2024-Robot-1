package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.NoteIntake;
import frc.robot.Constants;

public class ShootCommand extends InstantCommand {

    private final NoteIntake m_subsystem;

    public ShootCommand(NoteIntake subsystem) {
        m_subsystem = subsystem;
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem);
    }

     // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    m_subsystem.shooterMotor.set(Constants.nIntakeConstants.kShooterMotor);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.shooterMotor.set(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
    
}