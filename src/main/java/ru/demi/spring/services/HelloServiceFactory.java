package ru.demi.spring.services;

public class HelloServiceFactory {

    public enum LANG {
        GE,
        EN,
        IT,
        RU,
        SP
    }

    public HelloService createHelloService(LANG language) {
        switch (language) {
            case GE:
                return new HelloServiceGermanImpl();
            case EN:
                return new HelloServiceEnglishImpl();
            case IT:
                return new HelloServiceItalianImpl();
            case RU:
                return new HelloServiceRussianImpl();
            case SP:
                return new HelloServiceSpanishImpl();
            default:
                return new HelloServiceRussianImpl();
        }
    }
}
