package edu.ntnu.idatt2001.Wargames;
import edu.ntnu.idatt2001.Wargames.Units.Unit;
import java.util.*;

public class Army {
    private String name;
    List<Unit> units = new ArrayList<Unit>();

    public Army(String name, List<Unit> units) {
        this.name = name;
        this.units = units;
    }
    public Army(String name){
        this.name = name;
        this.units = null;
    }

    public void add(Unit unit){
        units.add(unit);
    }

    public void addAll(List<Unit> units){
        for(Unit u: units){
            units.add(u);
        }
    }

    public void remove(Unit unit){
        for(Unit u: this.units){
            units.remove(u);
        }
    }

    public boolean hasUnits(){
        return units.size() > 0;
    }

    public Unit getRandom(){
        Random random = new Random();
        return units.get(random.nextInt(units.size()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Unit> getAllUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                ", units=" + units +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Army)) return false;
        Army army = (Army) o;
        return getName().equals(army.getName()) && units.equals(army.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), units);
    }
}
