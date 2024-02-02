// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static final class DriveConstants {
    public static final int kLeftMotor1Port = 2;
    public static final int kRightMotor1Port = 3;
}
public static final class OIConstants {
    public static final int kRightControllerPort = 0;
    public static final int kLeftControllerPort = 1;
    public static final int kXboxControllerPort = 2;
    
    //Values of joystick button mapping
    public static final int kJoystickTrigger = 1;
    public static final int kJoystickTop = 2;
}
public static final class PNUConstants {
    public static final int kCompressor = 0;
    public static final int kSolenoid1 = 0;
    public static final int kSolenoid2 = 1;
    public static final int kSolenoid3 = 2;
}


public static final class MISCMotorConstants {
    public static final int kWheel = 5;
    public static final int kWinch1 = 7;
    public static final int kWinch2 = 11;
    public static final int kWinch3 = 1;
    public static final int kWinch4 = 8;
}


public static final class nIntakeConstants {
    public static final int kIntakeMotor = 9;
    public static final int kLaunchMotor1 = 6;
    public static final int kLaunchMotor2 = 4;
}
}
