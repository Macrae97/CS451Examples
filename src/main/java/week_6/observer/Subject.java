package week_6.observer;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    void attach(Observer o);
    void dettach(Observer o);
    void notify(WeatherMessage wm);

}

interface Observer {
    void update(WeatherMessage wm);
}

class WeatherMessage {
    private boolean sunny, rainy, windy;
    public WeatherMessage(boolean sunny, boolean rainy, boolean windy) {
        this.sunny = sunny;
        this.rainy = rainy;
        this.windy = windy;
    }

    public String toString(){
        String temp = "The weather is going to be ";
        if (sunny){
            temp = temp + "sunny ";
        }
        if (rainy){
            temp = temp + "rainy ";
        }
        if (windy){
            temp = temp + "windy ";
        }
        return temp;
    }

    public String content(){return this.toString();}
}

class WeatherChannel implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void dettach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notify(WeatherMessage wm) {
        System.out.println("Weather announcement..." + wm);
        for (Observer observer : observers) {
            observer.update(wm);
        }
        System.out.println();
    }
}

class ShortsPerson implements Observer {
    public void update(WeatherMessage wm) {
        if (wm.content().contains("sunny")){
            System.out.println("ShortsPerson: Im wearing shorts today");
        }
    }
}

class UmbrellaPerson implements Observer {
    public void update(WeatherMessage wm) {
        if (wm.content().contains("rainy")){
            System.out.println("UmbrellaPerson: Im bringing my umbrella today");
        }
    }
}

class GrumpyPerson implements Observer {
    public void update(WeatherMessage wm) {
        System.out.print("GrumpyPerson: ");
        if (wm.content().contains("sunny")){
            System.out.println("Its too hot to go out today");
        } else if (wm.content().contains("rainy")){
            System.out.println("Its too wet to go out today");
        } else if (wm.content().contains("windy")){
            System.out.println("Its too windy to go out today");
        } else {
            System.out.println("Its a boring day, gonna stay in");
        }
    }
}


