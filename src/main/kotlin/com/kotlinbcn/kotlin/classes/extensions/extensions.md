## Extensions

Kotlin, allows us to use the concept of extensions very easily, as we don't need to subclass a class to add
new functionality.

```kotlin

class Velociraptor {
  fun grunt() { println("Groarrrrrrrr") }
}

fun Velociraptor.gruntMore() {
  grunt()
  grunt()
  grunt()
}

fun main(args: Array<String>) {
  val velociraptor = Velociraptor()
  velociraptor.gruntMore()
}

```

```java
public class Velociraptor {
  public void grunt() {
    System.out.println("Groarrrrrrrr");
  }
}

public class VelociraptorUtils {
  
  private VelociraptorUtils() {
    throw new Assertion("No instances!");
  }
  
  public static void gruntMore(final Velociraptor velociraptor) {
    velociraptor.grunt();
    velociraptor.grunt();
    velociraptor.grunt();
  }
  
}

```

Normally this extensions are put on a concrete file, but can be added anywhere we want.

From the documentation we can deduce this:

> Extensions do not actually modify classes they extend. By defining an extension, you do not insert new members into a class, but merely make new 
functions callable with the dot-notation on variables of this type.

Please when using extensions, be careful and be strictly related to the class you're extending!