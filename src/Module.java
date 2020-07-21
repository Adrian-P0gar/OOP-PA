public enum Module {

    BASIC("Python"),
    WEB("Web"),
    OOP("Java"),
    ADVANCED("Java");


    Module(String python) {
    }

    private static Module[] vals = values();
    public Module next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }

}
