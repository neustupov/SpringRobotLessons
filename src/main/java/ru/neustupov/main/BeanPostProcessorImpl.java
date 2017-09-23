package ru.neustupov.main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
        System.out.println("After init " + name);
        return bean;
    }
}
