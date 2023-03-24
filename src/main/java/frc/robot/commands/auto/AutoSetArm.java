package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.arm.Arm;
import frc.robot.subsystems.arm.ArmPosition;
import frc.robot.subsystems.arm.ArmState;

public class AutoSetArm extends CommandBase {
    private Arm arm;
    private ArmPosition armPosition;

    public AutoSetArm(Arm arm, ArmPosition armPosition) {
        this.arm = arm;
        this.armPosition = armPosition;
        
		addRequirements(arm);
    }

    @Override
    public void initialize() {
        //arm.setArmState(armPosition);
        //arm.setTarget(armPosition);
        arm.setTarget(Constants.Subsystems.Arm.KEY_POSITIONS.get(armPosition));
    }

    @Override
    public boolean isFinished() {
        return true;
        //return arm.isDoneMoving();
    }
}
