public class Thing {
    private String name;
    private int volume;
    /**
     * Instancie une chose avec nom
     * 
     * @param name (string):nom
     */
    public Thing(String name,int volume){
        this.name =name;
        this.volume=volume;
    }
    public String getName(){
        return this.name;
    }
    public int getVolume(){
        return this.volume;
    }
}
