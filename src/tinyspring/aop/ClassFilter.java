package tinyspring.aop;

public interface ClassFilter {
    boolean matches(Class targetClass);
}
