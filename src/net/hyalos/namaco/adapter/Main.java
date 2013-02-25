package net.hyalos.namaco.adapter;

import net.hyalos.namaco.adapter.abst.Print;
import net.hyalos.namaco.adapter.abst.PrintBanner;

/**
 * User: T.Ebina
 * Date: 2013/02/25
 * Time: 22:29
 */
public class Main {
    public static void main(String... args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
