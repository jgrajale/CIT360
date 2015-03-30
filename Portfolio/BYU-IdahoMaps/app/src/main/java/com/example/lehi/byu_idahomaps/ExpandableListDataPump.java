package com.example.lehi.byu_idahomaps;

/**
 * Created by Lehi on 3/6/2015.
 */

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.LinkedHashMap;
        import java.util.List;

public class ExpandableListDataPump {
    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> buildings = new ArrayList<String>();
        buildings.add("Campus");
        buildings.add("Austin");
        buildings.add("BYU-I Center");
        buildings.add("Benson");
        buildings.add("Clarke");
        buildings.add("Hart");
        buildings.add("Health Center");
        buildings.add("Hinckley");
        buildings.add("Kimball");
        buildings.add("Kirkham");
        buildings.add("Manwaring");
        buildings.add("McKay");
        buildings.add("Ricks");
        buildings.add("Romney");
        buildings.add("Smith");
        buildings.add("Snow");
        buildings.add("Spori");
        buildings.add("Taylor");



        expandableListDetail.put("Buildings", buildings);
        expandableListDetail.put("Activities", null);
        expandableListDetail.put("Crossroads", null);
        expandableListDetail.put("What\'s On Campus", null);
        expandableListDetail.put("Rexburg Eats", null);

        return expandableListDetail;
    }
}
