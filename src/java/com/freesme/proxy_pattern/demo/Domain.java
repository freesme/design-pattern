package com.freesme.proxy_pattern.demo;

public class Domain {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("yaoo.mp4");
        proxyImage.display();
    }
}
