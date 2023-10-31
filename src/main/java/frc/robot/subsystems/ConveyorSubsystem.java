package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ConveyorConstants;

public class ConveyorSubsystem extends SubsystemBase{
    
    private CANSparkMax TopMotor;
    private CANSparkMax BottomMotor;

    public ConveyorSubsystem(){

        
        TopMotor = new CANSparkMax(ConveyorConstants.kConveyerTopMotorCANID, MotorType.kBrushless);
        BottomMotor = new CANSparkMax(ConveyorConstants.kConveyerBottomMotorCANID, MotorType.kBrushless);

        TopMotor.restoreFactoryDefaults();

    }

    public void raiseBall(double speed){

        TopMotor.set(speed);
        BottomMotor.set(speed);


    }

    // public void lowerBall(Double speed){
        
    //     TopMotor.set(-speed);
    //     BottomMotor.set(-speed);

    // }




}
