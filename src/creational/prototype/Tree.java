package creational.prototype;

public abstract class Tree implements Cloneable{
    private double latitude ;
    private double longitude;

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
