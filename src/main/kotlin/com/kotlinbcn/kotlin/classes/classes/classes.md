## Classes

Creating classes in Kotlin is super easy. Syntax is almost the same as you do in Java, but with less verbosity. Let's see a couple of examples:

### Basic Classes

If we want to create a simple class we can do this way:

Kotlin:

```kotlin
class Empty
```

Java:

```java
public class Empty {}
```

As you can see:

* No need to add brackets
* No need to add public (by default in Kotlin everything is public)

One class with one constructor:

Kotlin:

```kotlin
class Dog(val name: String)
```

Java:

```java
public class Dog {
  
  private final String name;
  
  public Dog(final String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
}
```

One class with default parameters:

```kotlin
class Dog(val name: String, val age: Int = 1)
```

```java
public class Dog {
  
  private final String name;
  private final int age;
  
  public Dog(final String name) {
    this.name = name;
    this.age = 1;
  }
  
  public Dog(final String name, final int age) {
    this.name = name;
    this.age = age;
  }
  
  public String getName() {
    return this.name;
  }
  
}
```

Multiple constructors:

```kotlin
class Dog(val name: String, val age: Int = 1) {
  constructor(val original: Dog) : this(original.name, original.age)
}
```

```java
public class Dog {
  
  private final String name;
  private final int age;
  
  public Dog(final String name) {
    this.name = name;
    this.age = 1;
  }
  
  public Dog(final String name, final int age) {
    this.name = name;
    this.age = age;
  }
  
  public String getName() {
    return this.name;
  }
  
}
```

Private constructors:

```kotlin
class Dog private(val name: String)
```

```java
public class Dog {
  
  private final String name;
  
  private Dog(final String name) {
    this.name = name;
  }
    
  public String getName() {
    return this.name;
  }
  
}
```

###  Data Classes

Data classes are Kotlin special way of saying: "Do you need to store just simply data?". In Java, we create those classes just only to transmit 
information, but per se, those classes doesn't do anything special by itself.

Kotlin:
```kotlin
data class User(val name: String, val age: Int)
```

Java:
```java
public class User {

  private final String name;
  private final int age;

  public User(final String name, final int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + age;
    return result;
  }

  @Override public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final User user = (User) o;

    return age == user.age && name.equals(user.name);
  }

  @Override public String toString() {
    return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
```

As you can see, Kotlin code is tons of magnitude less verbose. Just keep in mind (extracted from documentation):

* The primary constructor needs to have at least one parameter
* All primary constructor parameters need to be marked as val or var
* Data classes cannot be abstract, open, sealed or inner;

###  Sealed Classes

Sealed classes are kind of enums but applied to classes (this is for applying restricted class hierarchies):

```kotlin
sealed class Error

class NetworkError : Error()

class DataSourceError : Error()

```

###  Delegate Classes

Some times in Java we tend to use delegation pattern. Kotlin has added support for this natively requiring zero boilerplate code.

```kotlin
interface Printer {
  fun print()
}

class HPPrinter(val x: Int) : Printer {
  override fun print() {
    println("HP")
    println(x)
  }
}

class DelegatePrinter(printer: Printer) : Printer by printer

fun main(args: Array<String>) {
  val hpPrinter = HPPrinter(10)
  DelegatePrinter(hpPrinter).print()
}
```