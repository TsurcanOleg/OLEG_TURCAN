package homework_nr_17;

import java.util.ArrayList;
import java.util.List;

public class Storage <T> {
    List<T> items;

    public Storage(String item) {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getItems(){
        return new ArrayList<>(items);
    }
}


