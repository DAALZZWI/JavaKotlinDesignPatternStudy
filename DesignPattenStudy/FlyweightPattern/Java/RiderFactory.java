package FlyweightPattern.Java;

import java.util.HashMap;
import java.util.Map;

public class RiderFactory {

    private Map<String,Rider> map;

    RiderFactory() {

        map = new HashMap<String,Rider>();
    }

    public String getRider(String center, String type) {

        if(map.containsKey(type)) {

            return getInstance(type);
        } else {

            switch (type) {

                case "FullTimeRider": {

                    return setInstance(type, new FullTimeRider(center));
                }

                case "PartTimeRider": {

                    return setInstance(type, new PartTimeRider(center));
                }

                default: {
                    return "배달원이 없습니다.";
                }
            }
        }
    }

    public String getInstance(String type) {

        System.out.println("> 이미 생성되었습니다.");
        return map.get(type).delivery();
    }

    public String setInstance(String type, Rider rider) {

        System.out.println("> 생성되었습니다.");
        map.put(type, rider);
        return map.get(type).delivery();
    }
}
