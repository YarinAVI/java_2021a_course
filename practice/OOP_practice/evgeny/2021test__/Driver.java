
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
 public static void main(String args[]) {
  A a1 = new A();
  B b1 = new B();
  C c1 = new C();
  D d1 = new D();
  Object a2 = new A();
  A b2 = new B();
  A c2 = new C();
  C d2 = new D();
  A d3 = new D();
  a1.equals(d2);
  c1.equals(c2);
  d2.equals(d3);
  d1.equals((C)a1);
 }
}
