import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Nogometas nogometas01 = new Nogometas("Ronaldinho", 10, 321);
        Nogometas nogometas02 = new Nogometas("Filip Krovinović", 23, 9999);
        Nogometas nogometas03 = new Nogometas("Harry Maguire", 5, 22);

        Lista ispisNogometasa = new Lista();
        ispisNogometasa.getLista().add(nogometas01);
        ispisNogometasa.getLista().add(nogometas02);
        ispisNogometasa.getLista().add(nogometas03);

        System.out.println(ispisNogometasa.getLista());

        Collections.sort(ispisNogometasa.getLista());
        for (Nogometas nogometas : ispisNogometasa.getLista()) {
            System.out.println(nogometas);
        }
    }
}
