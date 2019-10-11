package gloomyfolken.hooklib.asm;

public enum InjectionPoint {

    /**
     * Начало метода
     */
    HEAD,

    /**
     * Конец метода
     */
    RETURN,

    /**
     * Когда происходит вызов другого метода где-то в теле хукнутого
     */
    METHOD_CALL,

    /**
     * Когда происходит присвоение переменной где-то в теле хукнутого
     */
    VAR_ASSIGNMENT

}
