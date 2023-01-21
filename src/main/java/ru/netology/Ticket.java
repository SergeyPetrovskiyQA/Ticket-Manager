package ru.netology;

public class Ticket implements Comparable<Ticket> {
    protected int id;
    protected int price;
    protected String depAir;
    protected String arrAir;
    protected int travelTime;

    public Ticket(int id, int price, String depAir, String arrAir, int travelTime) {
        this.id = id;
        this.price = price;
        this.depAir = depAir;
        this.arrAir = arrAir;
        this.travelTime = travelTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepAir() {
        return depAir;
    }

    public void setDepAir(String depAir) {
        this.depAir = depAir;
    }

    public String getArrAir() {
        return arrAir;
    }

    public void setArrAir(String arrAir) {
        this.arrAir = arrAir;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
