package com.writeoncereadmany.minstrel.runtime.numbers.formatter;

/**
 * Created by tom on 24/11/2013.
 */
public interface Formatter<T> {

    public String format(T toFormat);
}
