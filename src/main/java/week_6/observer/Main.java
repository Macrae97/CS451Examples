package week_6.observer;

public class Main {
    public static void main(String[] args) {
        WeatherChannel metOffice = new WeatherChannel();

        ShortsPerson shortsPerson = new ShortsPerson();
        UmbrellaPerson umbrellaPerson = new UmbrellaPerson();

        metOffice.attach(shortsPerson);
        metOffice.attach(umbrellaPerson);

        metOffice.notify(new WeatherMessage(true, false, false));
        metOffice.notify(new WeatherMessage(false, true, false));

        GrumpyPerson grumpyPerson = new GrumpyPerson();
        metOffice.attach(grumpyPerson);

        metOffice.notify(new WeatherMessage(true, true, true));
        metOffice.notify(new WeatherMessage(false, false, false));
    }
}
