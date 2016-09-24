package frc.team4828.testmodule1;

import jaci.openrio.toast.core.command.AbstractCommand;
import jaci.openrio.toast.core.command.CommandBus;
import jaci.openrio.toast.core.command.IHelpable;
import jaci.openrio.toast.core.thread.Heartbeat;
import jaci.openrio.toast.core.thread.HeartbeatListener;
import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;
import jaci.openrio.toast.lib.module.ModuleConfig;
import sun.security.pkcs11.Secmod;

import java.util.Arrays;

public class RobotModule extends IterativeModule {

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
        Logger logger = new Logger("TestModule1", Logger.ATTR_DEFAULT);
        //TODO: Heartbeat
        //Heartbeat.add(skipped -> RobotModule.logger.info("Beep"));
        //TODO: Commands
        //TODO: USB Implementation
        //TODO: Module Init
        logger.info("It's Alive!!!");
        logger.info("The team name is: " + config.getObject("robot.team"));
    }
}
