/*
 * File: My Exceptions
 * Date: 27th October, 2019.
 */
package myExceptions;

/**
 *
 * @author Justech@ubuntusystems.com
 */
public class InvalidMeanException extends Exception {
    public InvalidMeanException (){
        super ("Error! Meangrade should be between 0-100.");
    }
    
    public InvalidMeanException (String message){
        super (message);
    }
}