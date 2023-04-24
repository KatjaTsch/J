import java.util.ArrayList;
import java.util.List;

public class Notebooks{
    private String name;
    private int amountRAM;
    private String operSystem;
    private int price;
    private String model;

    public Notebooks(String name, int amountRAM, String operSystem, int price, String model){
        this.name = name;
        this.amountRAM = amountRAM;
        this.operSystem = operSystem;
        this.price = price;
        this.model = model;
    }
public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("operatingSystem");
        list.add("price");
        list.add("model");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", операционная система: " + operSystem + '\'' +
                ", цена: " + price +
                ", модель: " + model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getOperatingSystem() {
        return operSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
