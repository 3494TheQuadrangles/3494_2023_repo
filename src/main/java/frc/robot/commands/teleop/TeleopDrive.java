package frc.robot.commands.teleop;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.arm.Arm;

public class TeleopDrive extends CommandBase {
	Drivetrain drivetrain;
	Arm arm;

	public TeleopDrive(Drivetrain drivetrain, Arm arm) {
		this.drivetrain = drivetrain;
		this.arm = arm;
		addRequirements(drivetrain);
		addRequirements(arm);
	}
	
	@Override
	public void execute() {
		drivetrain.drive(OI.teleopXVelocity(), OI.teleopYVelocity(), OI.teleopTurnVelocity(), true);
		//arm.directDriveArm(OI.getArmDirectDrivePower());
	}

	@Override
	public void end(boolean interrupted) {
		drivetrain.drive(0, 0, 0, false);
	}

	@Override
	public boolean isFinished() {
		return false;
	}
	
}
