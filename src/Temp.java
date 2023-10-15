public class Temp extends BottleOfWatter {

    private int temp;
    public Temp(String name, double cost, double volume,int temp) {
        super(name, cost, volume);
        this.temp = temp;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "BottleOfWatter{" +
                "name = " + super.getName() +
                ";volume = " + super.getVolume() +
                ";cost = " + super.getCost() +
                ";temperature = " + temp +
                '}';
    }

}