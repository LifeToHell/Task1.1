import java.util.List;

public  class HotWater implements VendingMachine{

    List<Temp> hotWater;

    public HotWater(List<Temp> products) {
        this.hotWater = products;
    }




    public List<Temp> getHotWater() {
        return hotWater;
    }

    @Override
    public Product getProduct(String name) {
        for (Temp item : hotWater) {
            if (item.getName().equals(name))
                return item;
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        return null;
    }

    public Product getProduct(String name, int temp) {
        for (Temp bottle : hotWater) {
            if (bottle.getName().equals(name) && bottle.getTemp() == temp)
                return bottle;
        }
        return null;
    }
    public void addHotWater(Temp hotWater){
        this.hotWater.add(hotWater);
    }
}
