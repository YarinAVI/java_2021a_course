
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A
{
    public boolean equals(Object obj) { 
        System.out.println("1");
        return true;
    }
    public boolean equals(A obj) {
        System.out.println("2");
        return true;
}
}
