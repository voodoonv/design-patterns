package com.patterns.creational.factory;

public class CppDeveloperFactory implements DeveloperFactory{

    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
