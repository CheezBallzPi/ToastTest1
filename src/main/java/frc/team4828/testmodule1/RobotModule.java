package frc.team4828.testmodule1;

import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;
import jaci.openrio.toast.lib.module.ModuleConfig;
import sun.security.pkcs11.Secmod;

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
        //TODO: Module Init
        logger.info("It's Alive!!!");
        logger.info("The team name is: " + config.getObject("robot.team"));
    }
}
