package thi.hatuhuy63133302.Dethi2;

public class LandScape {
    String landImg;
    String landName;
    String landAdd;

    public LandScape(String landImg, String landName, String landAdd) {
        this.landImg = landImg;
        this.landName = landName;
        this.landAdd = landAdd;
    }

    public String getLandImg() {
        return landImg;
    }

    public void setLandImg(String landImg) {
        this.landImg = landImg;
    }

    public String getLandName() {
        return landName;
    }

    public void setLandName(String landName) {
        this.landName = landName;
    }

    public String getLandAdd() {
        return landAdd;
    }

    public void setLandAdd(String landAdd) {
        this.landAdd = landAdd;
    }
}
