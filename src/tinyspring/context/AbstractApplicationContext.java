package tinyspring.context;

import tinyspring.BeanDefinition;
import tinyspring.factory.AbstractBeanFactory;

public abstract class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    @Override
    public Object getBean(String name) throws Exception {
        return beanFactory.getBean(name);
    }

    public abstract void refresh() throws Exception;


}
