## Interfaces

Interfaces are very similar to those found in Java:

```kotlin
interface Clock {
    fun tick()
}
```

So implementing one interface:

```kotlin
interface Clock {
  fun tick()
}

class RealClock : Clock {
  override fun tick() {
    
  }
}

```

So far, so good. But in Kotlin we can have properties inside interfaces:

```kotlin
interface Clock {
  val time: Int

  fun tick()
}

class RealClock(override val time: Int) : Clock {
  override fun tick() {

  }
}

```

But also, to those properties we can add default values:

```kotlin
interface Clock {
  val time: Int get() = 24

  fun tick()
}

class RealClock : Clock {
  override fun tick() {

  }
}

```