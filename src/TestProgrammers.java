public class TestProgrammers {
    public static void main(String[] args) {
        Programmer miriana = new Programmer("Miriana", 26, true);
        Programmer renato = new Programmer("Reanato", 22, true);

        miriana.drinkCoffe();
        miriana.printDetails();

        renato.printDetails();
        renato.hasGlasses();
    }
}
