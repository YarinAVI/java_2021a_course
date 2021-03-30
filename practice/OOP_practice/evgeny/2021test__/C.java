
/**
 * Write a description of class C here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class C extends A
{
 public boolean equals(A obj) {
     System.out.println("5");
     return true;
}
public boolean equals(C obj) {
    System.out.println("HELLO");
    return false;
}
}