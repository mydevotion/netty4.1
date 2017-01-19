package io.netty.channel;

/**
 * Created with IntelliJ IDEA.
 * User: qinfajia
 * Date: 17-1-17
 * Time: 下午4:10
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {
        SelectStrategyFactory factory = DefaultSelectStrategyFactory.INSTANCE;
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(System.getProperty("sun.nio.ch.bugLevel"));
    }
}
