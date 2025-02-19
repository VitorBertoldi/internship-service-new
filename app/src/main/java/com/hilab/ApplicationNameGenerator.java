package com.hilab;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;

public class ApplicationNameGenerator extends AnnotationBeanNameGenerator {
    public ApplicationNameGenerator() {
    }

    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
        String beanName = definition.getBeanClassName();
        return beanName;
    }
}
