public class ConstructorRevise {
    public static void main (String[] args){
        NonParameterizedConstructor np= new NonParameterizedConstructor();
        System.out.println(np.data2);
        ParameterizedConstructor pc = new ParameterizedConstructor(10, "Ram2");
        System.out.println(pc.data2);
        pc.data2="Changing";
        //pc.data1=100;//
        pc.setData1(100);
        //System.out.println(pc.data1);//
        System.out.println(pc.getData1());
    }
}
// Task 
// Make a class Song
// make 4 private property id, title, duration and artists
// make 2 public property album and description
// make constructor to set title and duration only
// make setter for id, duration and artists
// make getter for id, title, duration and artists
// make 2 object of Song
// Fill all the attributes
// Change the duration of 1st object
// Change the artists of 2nd object
// Print the following for both object
// Output
// Song 1
// Title: ABC
// Duration: 10
// Artists: XYZ
// Album: XX
// Description: Lorem Ipsum
// Song 2
//..
class Song {
    // Private properties
    private int id;
    private String title;
    private double duration;
    private String artists;

    // Public properties
    public String album;
    public String description;

    // Constructor to set title and duration only
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Setter for duration
    public void setDuration(double duration) {
        this.duration = duration;
    }

    // Setter for artists
    public void setArtists(String artists) {
        this.artists = artists;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for duration
    public double getDuration() {
        return duration;
    }

    // Getter for artists
    public String getArtists() {
        return artists;
    }

    // Method to display song details
    public void displaySongDetails() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
        System.out.println("Artists: " + artists);
        System.out.println("Album: " + album);
        System.out.println("Description: " + description);
    }

    public static void main(String[] args) {
        // Creating 2 objects of Song
        Song song1 = new Song("ABC", 10);
        Song song2 = new Song("DEF", 15);

        // Filling all the attributes
        song1.setId(1);
        song1.setArtists("XYZ");
        song1.album = "XX";
        song1.description = "Lorem Ipsum";

        song2.setId(2);
        song2.setArtists("PQR");
        song2.album = "YY";
        song2.description = "Lorem Ipsum Dolor";

        // Changing the duration of 1st object
        song1.setDuration(12);

        // Changing the artists of 2nd object
        song2.setArtists("LMN");

        // Printing the details of both songs
        System.out.println("Song 1");
        song1.displaySongDetails();

        System.out.println("\nSong 2");
        song2.displaySongDetails();
    }
}


class ParameterizedConstructor{
    private int data1;
    String data2;
    void setData1(int data1){
        this.data1=data1;
    }
    //read only access to private property
    int getData1(){
        return this.data1;
    }

    ParameterizedConstructor(int data1,String data2){
        this.data1=data1;
        this.data2=data2;
    }
}


class NonParameterizedConstructor{
    private int data1;
    String data2;

    NonParameterizedConstructor(){
        data1=10;
        data2="Ram";
        System.out.println("Running in object creation");
    }
}
