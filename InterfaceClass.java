public class InterfaceClass {
    public static void main(String[] args) {
        
    }
}
//interface is made as same as class replacing with"interface"
//interface cannot be made object of
interface AnimalDo{
    public void move();
    public boolean eat(String food);
    //functions of interface is automatically public and abstract
        
    }
    //interface can extend another interface
    interface MammalDo extends AnimalDo{
        public int legs();
    }
    //can be extended into multiple layer
    interface DogDo extends MammalDo{
        public void bark();
    }
    interface DomesticAnimalDo{
        public void pet();
    }
    //class can extend multiple interface
    class Husky implements DogDo,DomesticAnimalDo{
        //When implementing multiple interface,all the function from implemented interfaces
       // should be overriden
       @Override
       public void pet(){
        System.out.println("Husky likes pet");
       }
       //when implementing interface that extends another interface
       //must overrise all the function made on top of it
       @Override
       public void bark(){
        System.out.println("BOW WOW");
       }
    
        //when implementing interface that extends another interface
        //must override all the function mode on top of it
        
        @Override
        public int legs(){
            return 4;
        }
        @Override
        public void move(){
            System.out.println("Husky move fast");
        }
        @Override
        public boolean eat(String food){
            System.out.println("Husky eat fish");
            return false;
        }
    }
//"implements" keyword to use interfasce
class Wolf implements AnimalDo{
    //When implementing interface, all the function should be overriden
    @Override
    public void move(){
        System.out.println("Wolf move fast");
    }
    @Override
    public boolean eat(String food){
        System.out.println("Wolf eat meat");
        return false;
    }
}
class Cow implements AnimalDo{
    @Override
    public void move(){
        System.out.println("Cow eat grass");
    }
    @Override
    public boolean eat(String food){
        System.out.println("Cow eat grass");
        return true;
    }
}
/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 */ 
interface Media {
    void play();
    void pause();
    void next();
    void previous();
    String nowPlaying();
}
interface DigitalMedia extends Media {
    double size();
    double remaining(double current);
}
interface OnlineAsset {
    void download();
}
class Spotify implements DigitalMedia, OnlineAsset {
    private String currentTrack;
    private double totalSize;
    private double downloadedSize;
    public Spotify(String currentTrack, double totalSize) {
        this.currentTrack = currentTrack;
        this.totalSize = totalSize;
        this.downloadedSize = 0;
    }
    @Override
    public void play() {
        System.out.println("Playing: " + currentTrack);
    }

    @Override
    public void pause() {
        System.out.println("Pausing: " + currentTrack);
    }

    @Override
    public void next() {
        System.out.println("Skipping to the next track.");
        // Logic to change to the next track
    }

    @Override
    public void previous() {
        System.out.println("Going back to the previous track.");
        // Logic to change to the previous track
    }

    @Override
    public String nowPlaying() {
        return "Now playing: " + currentTrack;
    }

    @Override
    public double size() {
        return totalSize;
    }

    @Override
    public double remaining(double current) {
        return totalSize - current;
    }

    @Override
    public void download() {
        downloadedSize += 1.0; // Simulate downloading 1 MB
        System.out.println("Downloading... " + downloadedSize + "MB of " + totalSize + "MB");
    }
    
    public static void main(String[] args) {
        Spotify spotify = new Spotify("Track 1", 100);
        
        spotify.play();
        System.out.println(spotify.nowPlaying());
        spotify.pause();
        spotify.download();
        System.out.println("Remaining: " + spotify.remaining(spotify.downloadedSize) + "MB");
    }
}



