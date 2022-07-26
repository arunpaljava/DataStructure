package designpattern.abstractfactroy.factory;

import designpattern.abstractfactroy.bean.Computer;
import designpattern.abstractfactroy.bean.PC;

public class ComputerFactory {

    public static Computer createComputer(ComputerAbstractFactory caf){
        return caf.createComputer();
    }

}
