package zerda.software

import kotlin.test.Test
import kotlin.test.assertContains

class HelloWorldTest {

    @Test
    fun testSayHello() {
        val helloWorld = HelloWorld("Zerda")
        assertContains(helloWorld.sayHello(),"Hello Zerda")
    }
}