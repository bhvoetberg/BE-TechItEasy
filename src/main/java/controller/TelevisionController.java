package controller;

import Exceptions.RecordNotFoundException;
import Television.Television;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TelevisionController {

    private ArrayList<Television> inventory;

    Television tv1 = new Television("Philips", "43PUS6504/12", "4K TV");
    Television tv2 = new Television("Samsung", "QE55Q60T", "4K QLED TV");
    Television tv3 = new Television("Hitachi", "43HAK6152", "Ultra HD SMART TV");
    private String brand;
    private String name;
    private String type;

    public TelevisionController(ArrayList<Television> inventory) {
        this.inventory = inventory;
        inventory.add(tv1);
        inventory.add(tv2);
        inventory.add(tv3);
    }

    @GetMapping(value = "/televisions")
    public List<Television> getTelevisions() {
        return inventory;
    }

    @GetMapping(value = "/televisions/{id}")
    public Television getTelevision(@PathVariable int id) {
        try {
            ResponseEntity.ok();
            return inventory.get(id);
        }
        catch (RecordNotFoundException exception) {
            System.out.println("ID not found");
            throw new RecordNotFoundException("ID not found");
        }
    }

    @PostMapping(value = "/televisions", consumes = "application/json", produces = "application/json")
    public Television addTelevision(@RequestBody Television television) {
        inventory.add(television);
        return television;
    }

    @PutMapping(value = "/televisions/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Television updateTelevision(@PathVariable int id, @RequestBody Television television) {
        inventory.set(id, television);
        return television;
    }

    @DeleteMapping(value = "/televisions/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteTelevision(@PathVariable int id) {
        inventory.remove(id);
        return "Nummer " + id + " is deleted";
    }
}
