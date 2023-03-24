package builder;

import builder.item.Characteristic;
import builder.item.impl.Laptop;

public class Main {
    public static void main(String[] args) {
        Characteristic mac = Characteristic.builder()
                .brand("Apple")
                .color("spacegray")
                .build();

        Laptop macbook = new Laptop(mac);
    }
}
