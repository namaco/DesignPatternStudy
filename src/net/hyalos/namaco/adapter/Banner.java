package net.hyalos.namaco.adapter;

/**
 * User: T.Ebina
 * Date: 2013/02/25
 * Time: 22:04
 */
public class Banner {
    private String string;
    public Banner(String string){
        this.string = string;
    }
    public void showWithParen(){
        System.out.println("(" + string + ")");
    }
    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
