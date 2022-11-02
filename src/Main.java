public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<>(3);

        boolean sasha = stringMagicBox.add("Sasha");
        boolean petya = stringMagicBox.add("Petya");
        boolean kolya = stringMagicBox.add("Kolya");

        System.out.println(sasha);
        System.out.println(petya);
        System.out.println(kolya);

        System.out.println(stringMagicBox.pick());

        MagicBox<Integer> intMagicBox = new MagicBox<>(3);

        boolean firstNumber = intMagicBox.add(10);
        boolean secondNumber = intMagicBox.add(20);
//        boolean thirdNumber = intMagicBox.add(30);

        System.out.println(firstNumber);
        System.out.println(secondNumber);
//        System.out.println(thirdNumber);

        System.out.println(intMagicBox.pick());
    }
}
