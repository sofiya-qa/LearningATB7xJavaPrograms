package aug.ex_17082024.enumclass;

public enum COLOR {
    RED("#ff0000"),
    GREEN("#f0d0d0d"),
    BLUE("#f0df0f02");


    private String hexValue;
    COLOR(String hexValue){
        this.hexValue = hexValue;
    }

    public String getValue(){
        return hexValue;
    }
}
