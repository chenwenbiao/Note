package org.java.core.advanced.DesignPatterns.creational.factory.demo01;

public class VeggiePizze extends Pizza{
    @Override
    public void prepare() {
        System.out.println("VeggiePizze披萨正在准备");
    }

    @Override
    public void bak() {
        System.out.println("VeggiePizze披萨正在烘烤");
    }

    @Override
    public void cut() {
        System.out.println("VeggiePizze披萨正在切片");
    }

    @Override
    public void box() {
        System.out.println("VeggiePizze披萨正在装盒");
    }
}