package Mathprograms;

public class pyramide {
    private Double side;
    private Double height; //her erklære jeg hvilke egenskaber mine objekter har


    public pyramide(Double side, Double height) {
        this.side = side; //parametre jeg har givet til constructor
        this.height = height; //Tænk på en constructor som opskriften, der fortæller:
//“Når du laver en ny pyramide, skal du fortælle mig hvor bred og hvor høj den er – så gemmer jeg de oplysninger i den.”
    }

    public Double udregnVolume() {
        return (side * side * height) / 4; //lokal variable, ligger på stack
    }

    @Override
    public String toString() {
        return String.format("Pyramide med side=%.2f, højde=%.2f, Volume=%.2f",
                side, height,udregnVolume());
    }

    public static void main(String[] args) {
        pyramide p1= new pyramide(8.3, 5.5);
        pyramide p2= new pyramide(10.5,3.2);
        pyramide p3= new pyramide(60.4,40.2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
