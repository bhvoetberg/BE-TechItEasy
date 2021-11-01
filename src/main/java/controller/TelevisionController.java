package controller;

import Television.Television;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TelevisionController {

    private ArrayList<Television> inventory = new ArrayList<Television>();

    Television tv1 = new Television("Philips", "43PUS6504/12", "4K TV");
    Television tv2 = new Television("Samsung", "QE55Q60T", "4K QLED TV");
    Television tv3 = new Television("Hitachi", "43HAK6152", "Ultra HD SMART TV");

    public TelevisionController(ArrayList<Television> inventory) {
        this.inventory = inventory;
        inventory.add(tv1);
        inventory.add(tv2);
        inventory.add(tv3);
    }

    @GetMapping(value = "/televisions")
//    public String getTelevisions() {
//        return "Hallo";
//    }
    public List<Television> getTelevisions() {
        return inventory;
    }
}
