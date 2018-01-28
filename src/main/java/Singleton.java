public class Singleton {

  private static Singleton instance = null;
  private int x;

  private Singleton() {
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getInt() {
    return this.x;
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public static void main(String args[]) {
    Singleton instance = Singleton.getInstance();
    instance.setX(2);
    instance = Singleton.getInstance(); // returns same instance
    System.out.println(instance.getInt());
  }
}
