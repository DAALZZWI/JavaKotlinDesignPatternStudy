package FacadePattern.Java;

public class Image {

    private String name;
    private String loacation;

    Image() {}

    Image(String name,String location) {

        this.name = name;
        this.loacation = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoacation() {
        return loacation;
    }

    public void setLoacation(String loacation) {
        this.loacation = loacation;
    }

    public Boolean upload() {
        return true;
    }
}
