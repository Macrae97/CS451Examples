package week_7.strategy;

interface SaveStrategy {
    void save(Object data);
}

class ZipCompression implements SaveStrategy{
    @Override
    public void save(Object data) {
        System.out.println("Performing zip compression on " + data);
    }
}

class FlacCompression implements SaveStrategy{
    @Override
    public void save(Object data) {
        System.out.println("Performing FLAC compression on " + data);
    }
}

class PngCompression implements SaveStrategy{
    @Override
    public void save(Object data) {
        System.out.println("Performing PNG compression on " + data);
    }
}

class Application {

    private SaveStrategy strategy;

    public void saveAs(SaveStrategy strategy){
        this.strategy = strategy;
    }

    public void save(Object data){
        strategy.save(data);
    }
}