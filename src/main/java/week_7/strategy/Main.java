package week_7.strategy;

public class Main {
    public static void main(String[] args) {
        Application application = new Application();

        String text = "Some text data";
        application.saveAs(new ZipCompression());
        application.save(text);

        application.saveAs(new FlacCompression());
        application.save(text);

        application.saveAs(new PngCompression());
        application.save(text);
    }
}
