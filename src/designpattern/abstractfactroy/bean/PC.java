package designpattern.abstractfactroy.bean;

public class PC implements Computer{
    private String ram;
    private String cpu;

    public PC(String ram,String cpu){
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
