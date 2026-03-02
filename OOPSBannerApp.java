package STEPCLASS;

/**
 * OOPSBannerApp UC3 – Render OOPS as Banner using String.join()
 * Optimized for alignment and readability.
 * @author Akshaya419
 * @version 3.1
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // We use a delimiter of "  " (two spaces) to separate the letters clearly.
        String sep = "  ";

        System.out.println(String.join(sep, "  *** ",  "  *** ",   " ***** ", "  **** "));
        System.out.println(String.join(sep, " *   * ", " *   * ", " *    *", " * "));
        System.out.println(String.join(sep, " *   * ", " *   * ", " *    *", " * "));
        System.out.println(String.join(sep, " *   * ", " *   * ", " ***** ", "  *** "));
        System.out.println(String.join(sep, " *   * ", " *   * ", " *     ", "     * "));
        System.out.println(String.join(sep, " *   * ", " *   * ", " *     ", "     * "));
        System.out.println(String.join(sep, "  *** ",  "  ***   ", " *     "," **** "));
    }
}