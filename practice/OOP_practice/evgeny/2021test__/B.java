
/**
 * Write a description of class B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class B extends A
{
    public boolean equals(Object obj) {
        System.out.println("3");
        return true;
    }
    public boolean equals(B obj) {
        System.out.println("4");
        return true;
    }
}
