package frc.team4828.testmodule1;

import jaci.openrio.toast.core.StateTracker;
import jaci.openrio.toast.core.command.CommandBus;
import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;
import jaci.openrio.toast.lib.module.ModuleConfig;

public class RobotModule extends IterativeModule {

    private static Logger logger;

    @Override
    public String getModuleName() {
        return "TestModule1";
    }

    @Override
    public String getModuleVersion() {
        return "0.0.1";
    }

    @Override
    public void robotInit() {


        ModuleConfig config = new ModuleConfig("Toast.conf");

        logger = new Logger("TestModule1", Logger.ATTR_DEFAULT);
        //TODO: Heartbeat
//        Heartbeat.add(skipped -> RobotModule.logger.info("Beep"));
        //TODO: Commands
        CommandBus.registerCommand(new TestCommand.MyCommand());
        //TODO: USB Implementation
        //StateTracker.addTicker(state -> logger.info("Tick"));
        StateTracker.addTransition((AUTONOMOUS, TELEOP) -> logger.info("Transition"));
        //TODO: Module Init
        logger.info("It's Alive!!!");
        logger.info("The team name is: " + config.getObject("robot.team"));
    }
}
