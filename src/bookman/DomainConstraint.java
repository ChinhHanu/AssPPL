package bookman;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @overview Defines a domain constraint of some attribute.
 * @author dmle
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DomainConstraint {
  
  /**the data type, e.g. String, Integer... */
  public String type();
  /**whether or not the data value can changed*/
  public boolean mutable() default true;
  /**whether or not the data value is required*/
  public boolean optional() default true;
  /**the maximum length of data values*/
  public int length() default  -1;
  /**the lower bound of data values (applicable to numeric types only)*/
  public double min() default Double.NaN;
  /**the upper bound of data values (applicable to numeric types only)*/
  public double max() default Double.NaN;
}
