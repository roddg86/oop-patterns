package builder.item;


import java.util.Locale;

public class Characteristic {
    private String brand;
    private String color;
    private String ram;

    // приватный конструктор, для того чтобы создать обьект можно было только через билдер
    private Characteristic(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.ram = builder.ram;
    }
//    private String cpu;
//    private String os;
//    private String weight;
//    private String memory;
//    private String memoryType;
//    private String battery;
//    private String body;
//    private String wheel;

    // метод получения билдера
    public static Builder builder() {
        return new Builder();
    }

    // внутренний статический класс, билдер построитель обьектов
    public static class Builder {
        private String brand;
        private String color;
        private String ram;
//        private String cpu;
//        private String os;
//        private String weight;
//        private String memory;
//        private String memoryType;
//        private String battery;
//        private String body;
//        private String wheel;


        public Builder brand(String brand){
            this.brand = brand;
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Builder ram(String ram){
            this.ram = ram;
            return this;
        }

        public Characteristic build(){
            return new Characteristic(this);
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getRam() {
        return ram;
    }

//    public String getCpu() {
//        return cpu;
//    }
//
//    public String getOs() {
//        return os;
//    }
//
//    public String getWeight() {
//        return weight;
//    }
//
//    public String getMemory() {
//        return memory;
//    }
//
//    public String getMemoryType() {
//        return memoryType;
//    }
//
//    public String getBattery() {
//        return battery;
//    }
//
//    public String getBody() {
//        return body;
//    }
//
//    public String getWheel() {
//        return wheel;
//    }
}
