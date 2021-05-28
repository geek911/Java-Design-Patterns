package prototype;

import java.util.HashMap;
import java.util.Map;

public class Register {
    private Map<String, Item> items = new HashMap<>();

    public Register() {
        loadItems();
    }

    public Item createItem(String name) {
        Item item = null;
        try {
            item = (Item) items.get(name).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        } finally {
            return item;
        }
    }

    public void loadItems() {
        TV tv = new TV();
        tv.setName("JVC");
        tv.setPrice(3300.33);
        this.items.put("tv", tv);


        Radio radio = new Radio();
        radio.setName("Sony");
        radio.setPrice(1400);
        this.items.put("radio", radio);
    }
}
