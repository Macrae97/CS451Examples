package week_7.template;

abstract class TemplateHouse {

    //final so subclasses cannot override
    //this is the template method
    public final void buildHouse(){
        buildFoundation();
        buildWalls();
        addInsulation();
        buildRoof();
        buildWindows();
        System.out.println(this.getClass().getSimpleName() + " is built");
    }

    //can't change this
    private void buildFoundation(){
        System.out.println("Pouring concrete for the foundation");
    }

    //default but can be changed/overridden
    void buildWindows(){
        System.out.println("Installing double glazed windows");
    }

    void buildRoof(){
        System.out.println("Adding slate tiles to roof");
    }

    abstract void addInsulation();
    abstract void buildWalls();
}

class WoodenHouse extends TemplateHouse {

    @Override
    void addInsulation() {
        System.out.println("Using sawdust insulation");
    }

    @Override
    void buildWalls() {
        System.out.println("Building wooden walls");
    }
}

class GlassHouse extends TemplateHouse {

    @Override
    void addInsulation() {
        System.out.println("No insulation in a glasshouse");
    }

    @Override
    void buildWalls() {
        System.out.println("Using steel supports and layered glass for walls");
    }

    void buildRoof(){
        System.out.println("Using triple layered glass for the roof");
    }

    void buildWindows(){
        System.out.println("Don't need windows, walls are glass");
    }
}