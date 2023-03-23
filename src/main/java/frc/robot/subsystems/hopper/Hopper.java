package frc.robot.subsystems.hopper;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.subsystems.arm.ArmState;
import frc.robot.util.statemachine.IStateControllable;

public class Hopper extends SubsystemBase implements IStateControllable<ArmState> {
    private DoubleSolenoid hopperPiston;

    public Hopper() {
        hopperPiston = new DoubleSolenoid(
                Constants.Subsystems.Pneumatics.BASE_PCM, PneumaticsModuleType.REVPH,
                Constants.Subsystems.Hopper.HOPPER_SOLENOID_CHANNEL,
                Constants.Subsystems.Hopper.HOPPER_SOLENOID_CHANNEL + 1);
    }

    void setHopperPiston(Value value) {
        hopperPiston.set((value == Value.kForward) ? Value.kForward
                : Value.kReverse);
    }

    long lastHopperActuationTime = System.currentTimeMillis();

    public void setState(ArmState newState) {
        hopperPiston.set((newState.hopperState == HopperState.Extended) ? Value.kForward
                : Value.kReverse);

        lastHopperActuationTime = System.currentTimeMillis();

        System.out.println("Hopper: " + newState.hopperState.toString());
    }

    public boolean isAt(ArmState state) {
        return (System.currentTimeMillis() - lastHopperActuationTime) >= 500; // we don't actually have a sensor
        // for
        // this, might as well have a way
        // just in
        // case though
    }

    public boolean crashDetected() {
        return false;
    }
}