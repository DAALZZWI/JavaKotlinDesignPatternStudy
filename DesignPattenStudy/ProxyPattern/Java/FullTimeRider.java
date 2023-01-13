package ProxyPattern.Java;

public class FullTimeRider implements Rider {

    private String name;

    public FullTimeRider(String name) {

        this.name = name;
    }

    @Override
    public String delivery() {

        return "음식 배달";
    }

    @Override
    public String getPersonalInfo(Integer level) {

        return name;
    }
}
