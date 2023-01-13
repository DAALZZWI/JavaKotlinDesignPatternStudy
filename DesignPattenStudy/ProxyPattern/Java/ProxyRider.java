package ProxyPattern.Java;

public class ProxyRider implements Rider{

    private FullTimeRider fullTimeRider = null;
    private String name;

    public ProxyRider(String name) {

        this.name = name;
    }

    @Override
    public String delivery() {

        if(fullTimeRider == null) {

            fullTimeRider = new FullTimeRider(name);
        }

        return fullTimeRider.delivery();
    }

    @Override
    public String getPersonalInfo(Integer level) {

        return name;
    }
}
