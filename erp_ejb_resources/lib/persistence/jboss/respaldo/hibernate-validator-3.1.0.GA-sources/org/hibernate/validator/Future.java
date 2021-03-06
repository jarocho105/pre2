//$Id: Future.java 15133 2008-08-20 10:05:57Z hardy.ferentschik $
package org.hibernate.validator;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;

/**
 * Check that a Date, a Calendar, or a string representation apply in the future
 *
 * @author Gavin King
 */
@Documented
@ValidatorClass(FutureValidator.class)
@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface Future {
	String message() default "{validator.future}";
}
