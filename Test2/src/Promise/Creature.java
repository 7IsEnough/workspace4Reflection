package Promise;

import java.io.Serializable;

public class Creature<T> implements Serializable {

  public double weight;
  private char gender;

  private void breath() {
    System.out.println("生物呼吸");
  }

  public void eat() {
    System.out.println("生物吃东西");
  }
}
