package animalKingdom;

import java.util.ArrayList;

public class Main
{

  public static void main(String[] args)
  {

    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 2021);

    Bird pigeon = new Bird("Pigeon", 1837);
    Bird peacock = new Bird("Peacock", 1821);
    Bird toucan = new Bird("Toucan", 1758);
    Bird parrot = new Bird("Parrot", 1824);
    Bird swan = new Bird("Swan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    ArrayList<AbstractAnimal> animals = new ArrayList<AbstractAnimal>();
    animals.add(panda);
    animals.add(zebra);
    animals.add(koala);
    animals.add(sloth);
    animals.add(armadillo);
    animals.add(raccoon);
    animals.add(bigfoot);
    animals.add(pigeon);
    animals.add(peacock);
    animals.add(toucan);
    animals.add(parrot);
    animals.add(swan);
    animals.add(salmon);
    animals.add(catfish);
    animals.add(perch);


    System.out.println("*** descending by year named ***");
    animals.sort((a1, a2) -> a1.getYear() - a2.getYear());
    animals.forEach(a -> System.out.println(a));

    System.out.println("*** animals alphabetically ***");
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animals.forEach(a -> System.out.println(a.getName()));

    System.out.println("*** ordered by how they move ***");
    animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    animals.forEach(a -> System.out.println(a.getName() + ": " + a.move()));
    
    System.out.println("*** only animals that breathe with lungs ***");
    animals.forEach(a -> {
      if (a.breathe().equals("lungs")) {
        System.out.println(a.getName() + ": " + a.breathe());
      }
    });
    
    System.out.println("*** breathe with lungs and named in 1758 ***");
    animals.forEach(a -> {
      if ((a.breathe().equals("lungs")) && (a.getYear() == 1758)) {
        System.out.println(a.getName() + ": " + a.breathe() + ", named: " + a.getYear());
      }
    });
    
    System.out.println("*** lay eggs and breathe with lungs ***");
    animals.forEach(a -> {
      if((a.reproduce().equals("eggs")) && (a.breathe().equals("lungs"))) {
        System.out.println(
          a.getName() + ": lays " + a.reproduce() + " and breathes with " + a.breathe()
        );
      }
    });
    
    System.out.println("*** aphabetically those named in 1758 ***");
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animals.forEach(a -> {
      if (a.getYear() == 1758) System.out.println(a.getName() + ": " + a.getYear());
    });

    System.out.println("*** mammals alphabetically  ***");
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animals.forEach(a -> {
      if (a instanceof Mammal) System.out.println(a.getName());
    });

  }

}