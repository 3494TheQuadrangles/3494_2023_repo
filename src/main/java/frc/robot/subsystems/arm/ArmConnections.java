package frc.robot.subsystems.arm;

import java.util.ArrayList;
import java.util.List;

import frc.robot.subsystems.forearm.ForearmState;
import frc.robot.subsystems.shoulder.ShoulderState;
import frc.robot.subsystems.wrist.WristState;
import frc.robot.util.statemachine.StateConnection;

// WARNING:
// This file was autogenerated by FizzyApple12's StateGenerator
// !!!Edit at your own risk!!!
public class ArmConnections {
    public static List<StateConnection<ArmState>> connections = new ArrayList<>() {
        {
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone2, WristState.Base4Cone2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube2, WristState.Base4Cube2),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cone1, WristState.Base4Cone1),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCube),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.DoubleSubstation, WristState.DoubleSubCone),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base4, ForearmState.Base4Cube1, WristState.Base4Cube1),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.SingleSubstation, WristState.SingleSub),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base2, ForearmState.Store, WristState.Store)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube),
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone),
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.Base1Hybrid, WristState.Hybrid),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCube, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone),
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Intermediate, WristState.GroundCube),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone),
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, WristState.Base2Cone1, ForearmState.Base2Cone1),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone),
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1)));
            add(new StateConnection<ArmState>(
                    new ArmState(ShoulderState.Base2, ForearmState.Base2Cube1, WristState.Base2Cube1),
                    new ArmState(ShoulderState.Base1, ForearmState.GroundIntakeCone, WristState.GroundCone)));
        }
    };
}
