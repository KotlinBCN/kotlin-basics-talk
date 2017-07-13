## Lambdas

Let's suppose we have the following code in Java 6/7:

```java
public class Test {

  private ExecutorService executor;

  public Test() {
    this.executor = Executors.newSingleThreadExecutor();
  }

  public void executeTask() {
    executor.submit(new Callable<Boolean>() {
      public Boolean call() throws Exception {
        // Perform complex logic
        return true;
      }
    });
  }

}
```

If we look closely, when we execute the task, we're creating an anonymous inner class (Callable) to be sent and executed 
inside the executor.

With Java 8 this situation improved as we can have the same code rewrriten as:

```java
public class Test {

  private ExecutorService executor;

  public Test() {
    this.executor = Executors.newSingleThreadExecutor();
  }

  public void executeTask() {
    executor.submit(() -> {
      // Complex logic
      return true;
    });
  }

}
```

It's a great improvement. As we can see, our lambdas are like anonymous classes with one method that may return or not something.

In Kotlin, the same representation for a lambda function could be in the following forms:

```kotlin

val sum = { x: Int, y: Int -> x + y } // Inferred return type

// Or

val sum: (Int, Int) -> Int = { x, y -> x + y } // Explicit return type

// Or

val sum = fun(x: Int, y: Int): Int = x + y 

```

Sadly, Java doesn't allow us to pass functions as parameters :'(. In Kotlin we can do the following:

```kotlin
fun random() = Math.random()

fun double(e: Double) = e * e

fun <T> compose(g: () -> T, f: (T) -> T): () -> T {
  return { f(g()) }
}


fun main(args: Array<String>) {
  val randomDoubleFun: () -> Double = compose(::random, ::double)
  
  println("Random double function: ${randomDoubleFun()}")
}
```

This is called High Order Functions, and is a very powerful concept. It allows to compose multiple functions to express virtually anything.