package net.hyalos.namaco.adapter;

/**
 * User: T.Ebina
 * Date: 2013/02/25
 * Time: 22:26
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
