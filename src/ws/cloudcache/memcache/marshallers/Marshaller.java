package ws.cloudcache.memcache.marshallers;

import java.io.InputStream;
import java.io.Serializable;

/**
 * User: treeder
 * Date: Sep 22, 2008
 * Time: 6:28:36 PM
 */
public interface Marshaller {
    String CLASS_META_NAME = "class-name";

    byte[] marshal(Serializable object) throws Exception;

    Object unmarshal(InputStream inputStream, String className) throws Exception;

    Object unmarshal(String className, CharSequence buffer) throws Exception;

    String marshalToString(Serializable object) throws Exception;
}
