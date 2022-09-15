package mo.atef.amit.daythree.daythree.models;

import android.graphics.drawable.Drawable;

public class Market {
    public String address;
    public Drawable carrotImage;
    public Drawable locationImage;
    public Drawable sliderImage;

    public Market(String address, Drawable carrotImage, Drawable locationImage, Drawable sliderImage) {
        this.address = address;
        this.carrotImage = carrotImage;
        this.locationImage = locationImage;
        this.sliderImage = sliderImage;
    }
}
