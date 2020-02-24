package animalKingdom;

public class Mammal extends AbstractAnimal
{

  public Mammal(String name, int year)
  {
    super(name, year);
  }

  @Override
  public String move()
  {
    return "walk";
  }

  @Override
  public String breathe()
  {
    return "lungs";
  }

  @Override
  public String reproduce()
  {
    return "live births";
  }

}