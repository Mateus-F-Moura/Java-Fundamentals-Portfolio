package Interfaces.Cinema.model.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Entrance> entrances = new ArrayList<>();

    public Order() {
    }

    public List<Entrance> getEntrances() {
        return entrances;
    }

    public void addEntrance(Entrance entrance) {
        this.entrances.add(entrance);
    }

    public void removeEntrance(Entrance entrance) {
        this.entrances.remove(entrance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        for (Entrance e : entrances) {
            sb.append("- ").append(e).append("\n");
        }
        return sb.toString();
    }
}
