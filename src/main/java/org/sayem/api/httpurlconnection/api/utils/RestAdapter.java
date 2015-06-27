package org.sayem.api.httpurlconnection.api.utils;

/**
 * Created by syed.sayem on 6/26/15.
 */

@FunctionalInterface
public interface RestAdapter {

    <T> T execute(Class<T> responseClass);
}
