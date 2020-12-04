package com.company;

public class Game {   // id = 3 is the end of the Game (look at 11th line)
    private Location curLocation = Repo.getStartLocation();
    private UI ui = new UI();

    public void changeLocation() {
        ui.showLocation(curLocation);
        int id = curLocation.actions[ui.getChoice(curLocation)].getN();
        curLocation = Repo.getLocation(id);
        if (id == 3){
            System.out.println("The end of the quest");
        }

    }

    public Location getCurLocation() {
        return curLocation;
    }
}
