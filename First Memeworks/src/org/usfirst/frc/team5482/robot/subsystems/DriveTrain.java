package org.usfirst.frc.team5482.robot.subsystems;

import org.usfirst.frc.team5482.robot.Robot;
import org.usfirst.frc.team5482.robot.RobotMap;
import org.usfirst.frc.team5482.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	RobotDrive drive;
	
	Talon left;
	Talon right;

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoysticks());
    }
    
    public void init(){
    	Robot.log("DriveTrain", "Initializing...");
    	left = new Talon(RobotMap.leftMotor);
    	right = new Talon(RobotMap.rightMotor);
    	drive = new RobotDrive(left, right);
    	Robot.log("DriveTrain", "Initialized!");
    }
    
    public void arcadeDrive(){
    	drive.arcadeDrive(Robot.oi.getThrottle(), Robot.oi.getTurn());
    }
}

