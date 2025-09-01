package annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Categories.class)
public @interface Category {
    String name();
}
//Categories.class - this is known as containar Class
