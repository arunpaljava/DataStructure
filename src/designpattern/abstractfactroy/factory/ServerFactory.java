package designpattern.abstractfactroy.factory;

import designpattern.abstractfactroy.bean.Computer;
import designpattern.abstractfactroy.bean.PC;
import designpattern.abstractfactroy.bean.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String cpu;

    public ServerFactory(String ram, String cpu){
        this.ram=ram;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(this.ram,this.cpu);
    }
}
