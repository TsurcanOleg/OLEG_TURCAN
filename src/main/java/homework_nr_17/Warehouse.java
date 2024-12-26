package homework_nr_17;

import java.util.List;

public class Warehouse <T> {
    Storage<Storage<T>> storage;

    public Warehouse(Storage<Storage<T>> storage) {
        this.storage = storage;
    }

    public void addStorage(Storage<T> storage){
        for (T item : storage.items) {

        }
    }

}

 //   public Warehouse(Storage<Vehicle> s1, Storage<Vehicle> s2) {
   //
    //     this.warehouse = warehouse;
//    }

//    public void addStorage(Storage<Vehicle> storage){

//    }

//    public List<Vehicle> getAllObects(){
//        return warehouse.getItems();
//    }
//}
