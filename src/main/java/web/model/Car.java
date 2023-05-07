package web.model;

import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private String series;

    public Car(int id, String model, String series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, series);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + id + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
