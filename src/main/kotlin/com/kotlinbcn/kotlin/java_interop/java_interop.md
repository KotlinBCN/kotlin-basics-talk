## Java Interop

Kotlin is 100% compatible with Java. 

Examples:

**Kotlin class**
```kotlin
class PrinterKotlin {
    fun print(value: String) = println(value)

    fun print(f: () -> String) = println(f())
}
```

**Java class**
```java
public class PrinterJava {

    public void print(final String value) {
        System.out.println(value);
    }

    public void print(final Callable<String> callable) {
        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

**Using PrinterKotlin in Java**
```java
public class JavaInterop {

    public static void main(final String[] args) {
        final PrinterKotlin printer = new PrinterKotlin();

        printer.print("Jose Luis Franconetti");
        printer.print(() -> "Jose Luis Franconeti");
    }
}
```

**Using PrinterJava in Kotlin**
```kotlin
fun main(args: Array<String>) {
    val printerJava = PrinterJava()

    printerJava.print("Jose Luis Franconetti")
    printerJava.print { "Jose" }
}
```

* We can use some kotlin `annotations` to improve the readability of use Kotlin code in Java. 
    * `@file:JvmName("NewName")` --> Change the name of the generated java class to the new one.
    * `@file:JvmMultifileClass` --> Merge multiples kotlin files into a single one.
    * `@JvmField` --> expose a kotlin property into a field in java. 
        * Kotlin properties in a `object` or `companion object` are private. We must use `@JvmField` to expose it.
    * `@JvmStatic` --> It'll generate the function in a companion object as static method in Java. 


More info: https://kotlinlang.org/docs/reference/java-to-kotlin-interop.html