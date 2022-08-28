package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
public @interface MethodInfo {
    String author() default "Nick";
    int dateOfCreation() default 2022;
    String purpose();
}
