## Objects

Objects is a special construct to respect particularly the Singleton pattern (those objects where there's one and only one instance):

```kotlin
object DataProviderManager {
  fun registerNumber(provider: Int) {
  }
}
```

Is the same equivalent in Java as:

```java
public class DataProviderManager {
  
  private static final DataProviderManager INSTANCE;
  
  public static final DataProviderManager() {
    if (INSTANCE == null) {
      INSTANCE = new DataProviderManager();
    }
    return INSTANCE;
  }
  
  public static void registerNumber(final int provider) {
  }
  
  private DataProviderManager() {
    throw new AssertionError("No instances!");
  }
}
```

Also a class may has a companion object:

```kotlin
interface Factory<out T> {
  fun create(): T
}


class Dog {
  companion object : Factory<MyClass> {
    override fun create(): MyClass = MyClass()
  }
}
```

They look quite similar to static in Java, but in the end those objects are instances that are created at runtime the very first time you access them.