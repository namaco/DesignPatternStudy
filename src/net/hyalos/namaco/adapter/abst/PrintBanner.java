package net.hyalos.namaco.adapter.abst;

import net.hyalos.namaco.adapter.Banner;

/**
 * User: T.Ebina
 * Date: 2013/02/25
 * Time: 22:39
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);

    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
