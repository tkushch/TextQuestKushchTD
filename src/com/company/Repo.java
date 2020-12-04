package com.company;

public class Repo {
    private static String[] LocationsData = {
            "Start",
            "Forest",
            "Home",
            "End"
    };
    private static Action[] StartActions = new Action[]{
            new Action("toForest", 1),
            new Action("toHome", 2)
    };
    private static Action[] ForestActions = new Action[]{
            new Action("toStart", 0),
            new Action("toHome", 2)
    };
    private static Action[] HomeActions = new Action[]{
            new Action("toForest", 1),
            new Action("toEnd", 3)
    };

    private static Action[][] actions = new Action[][]{
            StartActions,
            ForestActions,
            HomeActions
    };

    public static Location getStartLocation(){
        return new Location(LocationsData[0], actions[0]);
    }

    static Location getLocation(int idLoc) {
        if (idLoc == 3) {
            return null;
        } else {
            Location loc = new Location(
                    LocationsData[idLoc],
                    actions[idLoc]
            );
            return loc;
        }
    }
}
