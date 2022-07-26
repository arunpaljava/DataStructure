package designpattern.abstractfactroy.client;

import designpattern.abstractfactroy.bean.Computer;
import designpattern.abstractfactroy.factory.ComputerFactory;
import designpattern.abstractfactroy.factory.PCFactory;
import designpattern.abstractfactroy.factory.ServerFactory;

public class ComputerClient {

    public static void main(String s[]){
        Computer pc = ComputerFactory.createComputer(new PCFactory("RAM","CPU"));
        System.out.println(pc);
        Computer server = ComputerFactory.createComputer(new ServerFactory("Server","SERVER_RAM"));
        System.out.println(server);
    }
}
