// Task 03
class CD extends Product {
    private String band;
    private int duration;
    private String genre;

    // Constructor passing id, title, and price to Product using super
    public CD(int id, String title, int price, String band, int duration, String genre) {
        super(id, title, price);
        this.band = band;
        this.duration = duration;
        this.genre = genre;
    }

    // Combines the parent details with CD specific details
    public String printDetail() {
        return super.getIdTitlePrice() + "\nBand: " + band + " Duration: " + duration + " minutes\nGenre: " + genre;
    }
}