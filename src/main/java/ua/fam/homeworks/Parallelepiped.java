package ua.fam.homeworks;

public class Parallelepiped {

    static float Volume;
    static float L;
    static float W;
    static float H;
    static float length;
    public static void main(String[] args) {

        L = 1.5f;
        W = 2.0f;
        H = 3.9f;
        Volume = L * W * H;
        length = (4 * W) + (4 * L) + (4 * H);

        System.out.println("Volume of Parallelepiped: " + Volume);
        // <== Sorry, don't have Ukrainian Keyborard,  only English!
        System.out.println("Full length of Parallelepiped: " + length);
    }
}
