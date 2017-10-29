package com.patterns.creational.factory;

public class PhpDeveloperFactory implements DeveloperFactory{
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
