package tinyspring.aop;

import org.aopalliance.intercept.MethodInterceptor;

public class AdvisedSupport {

    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;
    private MethodMatcher methodMatcher;

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

    public void setMethodMatcher(MethodMatcher methodMatcher) {
        this.methodMatcher = methodMatcher;
    }

    public MethodMatcher getMethodMatcher() {
        return methodMatcher;
    }
}
