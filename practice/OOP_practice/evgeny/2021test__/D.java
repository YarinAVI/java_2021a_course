
/**
 * Write a description of class D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class D extends C
{
 public boolean equals(A obj) {
     System.out.println("6");
     return true;
    }
    public boolean equals(B obj) {
        System.out.println("7");
        return true;
    }
    public boolean equals(D obj) {
        System.out.println("8");
        return true;
    }
    public boolean equals(Object obj) {
        System.out.println("9");
        return true;
    }
}
