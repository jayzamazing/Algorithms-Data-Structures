package com.adrianjaylopez;

import java.lang.reflect.Field;

/**
 * Extracted methods and made them static to help with reflection in the test classes.
 * @version 1.0
 * @author Adrian J Lopez
 * @since <pre>7/12/15</pre>
 */
public class HelperMethods {
    static Field field;//declarations

    /**
     * Helper method for getting a field without using a getter.
     * @param fieldName name of field I am trying to gleam
     * @return Object inside field
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static <T> Object reflectionGetHelper(String fieldName, T instance) throws NoSuchFieldException, IllegalAccessException {
        field = instance.getClass().getDeclaredField(fieldName);//get the field from the class
        field.setAccessible(true);//allows modification of the field
        return field.get(instance);//return the object for the field
    }

    /**
     * Helper method for setting a field without using setter.
     * @param fieldName name of the field I am trying to gleam
     * @param data the data that will be passed into the field
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static <T> void reflectionSetHelper(String fieldName, Object data, T instance) throws NoSuchFieldException, IllegalAccessException {
        field = instance.getClass().getDeclaredField(fieldName); //get the field from the class
        field.setAccessible(true);//allows modification of the field
        field.set(instance, data);//set the data for this field
    }
}
