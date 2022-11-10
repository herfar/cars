package web.model;

public class Car {
    private String model;
    private int series;
    private int seriesOfEngine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getSeriesOfEngine() {
        return seriesOfEngine;
    }

    public void setSeriesOfEngine(int seriesOfEngine) {
        this.seriesOfEngine = seriesOfEngine;
    }
    public Car(){}

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", seriesOfEngine=" + seriesOfEngine +
                '}';
    }

    public Car(String model, int series, int seriesOfEngine) {
        this.model = model;
        this.series = series;
        this.seriesOfEngine = seriesOfEngine;
    }
}