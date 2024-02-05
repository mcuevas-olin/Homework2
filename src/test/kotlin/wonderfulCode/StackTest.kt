package wonderfulCode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StackTest {
    var teststackInt = implementStack<Int>()
    var teststackString = implementStack<String>()

    //assumes function peek is working

    @Test
    fun push (){
        //test push on empty

        teststackInt.push(1)
        assertEquals(1, teststackInt.peek())

        teststackString.push("One")
        assertEquals("One", teststackString.peek())

        //test push with on nonempty stack

        teststackInt.push(2)
        assertEquals(2, teststackInt.peek())

        teststackString.push("Two")
        assertEquals("Two", teststackString.peek())

    }

    @Test
    fun pop(){
        //Setup
        teststackInt.push(1)
        teststackInt.push(2)

        teststackString.push("One")
        teststackString.push("Two")

        //test pop on stack with two elements

        assertEquals(2, teststackInt.pop())
        assertEquals(1, teststackInt.peek())

        assertEquals("Two", teststackString.pop())
        assertEquals("One", teststackString.peek())

        //test pop on stack with one element

        assertEquals(1, teststackInt.pop())
        assertNull(teststackInt.peek())

        assertEquals("One", teststackString.pop())
        assertNull(teststackString.peek())

        //test pop on stack with no elements

        assertNull(teststackInt.pop())
        assertNull(teststackInt.peek())

        assertNull(teststackString.pop())
        assertNull(teststackString.peek())

    }

    @Test
    fun isEmpty(){
        //test will return true on empty Stack
        assertTrue(teststackInt.isEmpty())
        assertTrue(teststackString.isEmpty())

        //Set up for next test
        teststackInt.push(1)
        teststackString.push("One")

        //test will return false on stack with one or more elements
        assertFalse(teststackInt.isEmpty())
        assertFalse(teststackString.isEmpty())

    }
}