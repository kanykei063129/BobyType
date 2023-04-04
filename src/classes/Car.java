package classes;

import enums.BodyType;
import enums.CarModel;

import java.time.LocalDate;

public class Car {
    private CarModel carModel;
    private LocalDate localDate;
    private int price;
    private BodyType bodyType;

    public Car() {
    }

    public Car(CarModel carModel, LocalDate localDate, int price, BodyType bodyType) {
        this.carModel = carModel;
        this.localDate = localDate;
        this.price = price;
        this.bodyType = bodyType;
    }

    public Car(BodyType sedan) {
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel=" + carModel +
                ", localDate=" + localDate +
                ", price=" + price +
                ", bodyType=" + bodyType +
                '}'+"\n";
    }
}
