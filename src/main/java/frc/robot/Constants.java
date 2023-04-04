package frc.robot;

import java.util.HashMap;

import com.pathplanner.lib.PathConstraints;
import com.swervedrivespecialties.swervelib.ThriftyBotModuleConfigurations;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PrintCommand;

public final class Constants extends AutoConfigurable {
    public static final class Subsystems {
        public static final class Intake {
            public static final int LEFT_MOTOR_CHANNEL = 10;
            public static final int RIGHT_MOTOR_CHANNEL = 9;
            public static final int AMP_LIMIT = 5;
        }
        public static final class Arm {
            public static int PISTON1_SOLENOID_CHANNEL = 0; //FIX ME: GET REAL PORT
            public static int PISTON2_SOLENOID_CHANNEL = 1; //FIX ME: GET REAL PORT
            public static int ARM_MOTOR_CHANNEL = 2; //FIX ME GET REAL PORT 
            public static int BASE_PCM = 0; //FIX ME GET REAL PORT
        }
        public static final class Drivetrain {
            public static final class FrontLeftModule {
                public static int DRIVE_MOTOR_PORT = 18;
                public static int STEER_MOTOR_PORT = 16;

                public static int ENCODER_MOTOR_PORT = 16;

                public static double STEER_OFFSET = -Math.toRadians(290f-36f+0.6-94.4);
            }

            public static final class FrontRightModule {
                public static int DRIVE_MOTOR_PORT = 1;
                public static int STEER_MOTOR_PORT = 3;

                public static int ENCODER_MOTOR_PORT = 3;

                public static double STEER_OFFSET = -Math.toRadians(243f-123.0+2.5-6);
            }

            public static final class BackLeftModule {
                public static int DRIVE_MOTOR_PORT = 19;
                public static int STEER_MOTOR_PORT = 17;

                public static int ENCODER_MOTOR_PORT = 17;

                public static double STEER_OFFSET = -Math.toRadians(290f-36f-0.8-154.7);
            }

            public static final class BackRightModule {
                public static int DRIVE_MOTOR_PORT = 30;
                public static int STEER_MOTOR_PORT = 2;
                public static int ENCODER_MOTOR_PORT = 2;
                public static double STEER_OFFSET = -Math.toRadians(164f+8f+2f+10f+5f+3.8f-8.3-119);
            }

            public static final double TRACKWIDTH_METERS = 0.7112;
            public static final double TRACKLENGTH_METERS = 0.7112;

            public static SwerveDriveKinematics SWERVE_KINEMATICS = new SwerveDriveKinematics(
                    // Front left
                    new Translation2d(TRACKWIDTH_METERS / 2.0, TRACKLENGTH_METERS / 2.0),
                    // Front right
                    new Translation2d(TRACKWIDTH_METERS / 2.0, -TRACKLENGTH_METERS / 2.0),
                    // Back left
                    new Translation2d(-TRACKWIDTH_METERS / 2.0, TRACKLENGTH_METERS / 2.0),
                    // Back right
                    new Translation2d(-TRACKWIDTH_METERS / 2.0, -TRACKLENGTH_METERS / 2.0));

            public static final double MAX_VELOCITY_METERS_PER_SECOND = 6380.0 / 60.0 *
			        ThriftyBotModuleConfigurations.STANDARD.getDriveReduction() *
			        ThriftyBotModuleConfigurations.STANDARD.getWheelDiameter() * Math.PI;

            public static final double MAX_VOLTAGE = 12.0;
        }
    }

    public static final class Commands {
        public static final class FollowPath {
            public static final PIDController X_CONTROLLER = new PIDController(1, 0, 0);
            public static final PIDController Y_CONTROLLER = new PIDController(1, 0, 0);

            public static final PIDController THETA_CONTROLLER = new PIDController(0.22, 0, 0.05);
            
            /*public static final ProfiledPIDController THETA_CONTROLLER = new ProfiledPIDController(0.22, 0, 0.05, 
                    new TrapezoidProfile.Constraints(Math.PI, Math.PI));*/
        }

        public static final class AutoBalance {
            public static final double TRIGGER_ANGLE = 10;

            public static final double LEVEL_ANGLE = 2;

            public static final double DRIVE_POWER = 1;

            public static final double DIVIDE_FACTOR = 4;

            public static final double EXIT_TIME = 3;
        }
        public static final class AutoLineUp {
            public static final double MAX_STRAFE_SPEED = 0.3;
            public static final double YAW_ERROR_ALLOWANCE = 1;
        }
    }

    public static final class RobotContainer {
        public static final class PathPlanner {
            public static final PathConstraints PATH_CONSTRAINTS = new PathConstraints(2, 2);

            public static final HashMap<String, Command> PATH_EVENTS = new HashMap<>() {{
                put("print", new PrintCommand("Passed print marker"));
            }};
        }
    }

    public static final class OI {
        public static final int PRIMARY_CONTROLLER_PORT = 0;
        public static final int SECONDARY_LEFT_CONTROLLER_PORT = 1;
        public static final int SECONDARY_RIGHT_CONTROLLER_PORT = 2;

        public static final double DRIVE_SPEED = 3; // m/s
        public static final double TURN_SPEED = 5.5; // rad/s

        public static final double SLOW_DRIVE_SPEED = 1.5; // m/s
        public static final double SLOW_TURN_SPEED = 2.75; // rad/s

        public static final double DPAD_SPEED = 0.1;

        public static final double FOREARM_FINE_ADJUST_SPEED = 0.15;
        public static final double WRIST_FINE_ADJUST_SPEED = 0.15;
    }
}
