
package frc.robot.constants;



import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;


public class Constants{

    // OI
    public static final double AXIS_THRESHOLD = 0.1;
    public static final double X_VALUE_REDUCTION = 0.7;

    public static final int POV_NORTH = 0;
    public static final int POV_EAST = 90;
    public static final int POV_SOUTH = 180;
    public static final int POV_WEST = 270;
    public static final int POV_NO_SELECTION = -1;


    // Shooter constants
    public static final double SHOOTER_RAMP_TIME = 2;
    public static final double SHOOTER_SPEED = 1.0;
    public static final double SERVO_INCREMENT_VALUE = 0.5;
    public static final double SERVO_REDUCTION_VALUE = 0.5;
    public static final double SERVO_START_ANGLE = 0.0;

    //Spinner constants
    public static final I2C.Port I2C_PORT = I2C.Port.kOnboard;
    public static final double SPINNER_SPEED = 0.7;

    //Intake constants
    public static final double INTAKE_FORWARD_SPEED = -0.7;
    public static final double INTAKE_REVERSE_SPEED = 0.7;
    public static final double INTAKE_STOP_MOTOR = 0.0;
    public static final double MAX_EXTENTSION_IN_DEGREES = 120;

    //Control Panel Piston values
    public static final Value CONTROL_PANEL_OPEN_ARM = Value.kReverse;
    public static final Value CONTROL_PANEL_CLOSE_ARM = Value.kForward;
    public static final double CONTROL_PANEL_POSITION_CONVERSION_FACTOR = 1/(double)(883.42);

    //Gear Piston values
    public static final Value GEAR_LOW = Value.kForward;
    public static final Value GEAR_HIGH = Value.kReverse;

    // Elevator constants
    public static final Value ELEVATOR_LOCK = Value.kForward;
    public static final Value ELEVATOR_UNLOCK = Value.kReverse;

    // Hook constants
    public static final double HOOK_LEFT_SPEED = -1.0;
    public static final double HOOK_RIGHT_SPEED = 1.0;

    // Elevator constants
    // public static final double ELEVATOR_EXTEND_SPEED = 1.0;
    // public static final double ELEVATOR_RETRACT_SPEED = -1.0;

    // Loader constants
    public static final double LOADER_SPEED = 1.0;
    public static final double LOADER_SPEED_REVERSE = -1.0;

    /* ---- Power Limit Constants ---- */

    // The power limit in Amps for each of the drive motors
    public static final int DRIVE_POWER_LIMIT = 40;

    // The power limit in Amps for each of the elevator motors
    public static final int ELEVATOR_POWER_LIMIT = 30;

    // The power limit in Amps for the hook motor
    public static final int HOOK_POWER_LIMIT = 30;

    // The power limit in Amps for each of the loader motors
    public static final int LOADER_POWER_LIMIT = 30;

    // The power limit in Amps for each of the shooter motors
    public static final int SHOOTER_POWER_LIMIT = 40;

    /* ---- Drive Constants ---- */
    
    public static final double kEncoderDistancePerPulse = 0;//needs to be tuned...

    /* ---- Auto Constants ---- */

    public static final double AUTO_DRIVE_DISTANCE = 10;
    public static final double AUTO_DRIVE_SPEED = 0.3;

}