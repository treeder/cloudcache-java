# Dependencies #

You'll need the following libs, all can be downloaded from: http://commons.apache.org/

  * commons-lang
  * commons-logging
  * commons-httpclient
  * commons-codec

# Create the Cache #

```
CloudCache cache = new CloudCache(accessKey, secretKey);
```

# Put an Object into the Cache #

```
String myobject = "I want to cache this."
int expiryTimeInSeconds = 3600;
cache.put("mykey", myobject, expiryTimeInSeconds);
```

# Get and Object from the Cache #

```
String myobject = (String)cache.get("mykey");
```

# Remove an Object from the Cache #

```
cache.remove("mykey");
```

# Counters #

You can use cloudcache for counters too (like memcached).

```
// You have to put something into your counter key first
String key = "counter";
cache.put(key, 0L, 50000);   
long val = cache.increment(key);
```

You can also decrement:

```
long val = cache.increment(key);
```

# List All Keys in Cache #

```
List<String> keys = cache.listKeys();
```