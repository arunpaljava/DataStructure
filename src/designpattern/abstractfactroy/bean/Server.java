package designpattern.abstractfactroy.bean;

public class Server implements Computer{
    private String ram;
    private String cpu;

    public Server(String ram, String cpu){
        this.ram=ram;
        this.cpu=cpu;
    }
    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getCpu() {
        return cpu;
    }
}
