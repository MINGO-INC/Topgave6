public class Main {

    public static void main(String[] args) {
        Joe biogrande = new Joe(20, 10);


        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 5));

        // Print hele salen pænt
        System.out.println(biogrande);

        // Reserver det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows()-1;
        int numberOfSeats = biogrande.getSeats()-1;
        System.out.println("last row..."+biogrande.reserve(numberOfRows, numberOfSeats));

        // Afbestil reservation på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: " + biogrande.cancelReservation(1, 5));

    }
}