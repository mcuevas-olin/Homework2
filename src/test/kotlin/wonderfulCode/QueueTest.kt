package wonderfulCode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


class QueueTest {
    //assumes peek is working correctly
    private var queueTestInt = implementQueue<Int>()
    private var queueTestString = implementQueue<String>()


    @Test
    fun enqueue(){
        //test enqueue on empty queue
        queueTestInt.enqueue(1)
        queueTestString.enqueue("One")

        assertEquals(1, queueTestInt.peek())
        assertEquals("One", queueTestString.peek())

        //test enqueue on queue with one element

        queueTestInt.enqueue(2)
        queueTestString.enqueue("Two")

        assertEquals(1, queueTestInt.peek())
        assertEquals("One", queueTestString.peek())
    }
    @Test
    fun dequeue(){
        //setup
        queueTestInt.enqueue(1)
        queueTestInt.enqueue(2)

        queueTestString.enqueue("One")
        queueTestString.enqueue("Two")

        //test dequeue on queue with two elements
        assertEquals(1, queueTestInt.dequeue())
        assertEquals(2, queueTestInt.peek())

        assertEquals("One", queueTestString.dequeue())
        assertEquals("Two", queueTestString.peek())

        //test dequeue on queue with one element

        assertEquals(2, queueTestInt.dequeue())
        assertNull(queueTestInt.peek())

        assertEquals("Two", queueTestString.dequeue())
        assertNull(queueTestString.peek())

        // test dequeue on queue with no elements

        assertNull(queueTestInt.dequeue())
        assertNull(queueTestInt.peek())

        assertNull(queueTestString.dequeue())
        assertNull(queueTestString.peek())
    }

    @Test

    fun isEmpty(){
        //test return true on empty queue
        assertTrue(queueTestInt.isEmpty())
        assertTrue(queueTestString.isEmpty())

        //setup
        queueTestInt.enqueue(1)
        queueTestInt.enqueue( 2)

        queueTestString.enqueue("One")
        queueTestString.enqueue("Two")

        //test return false on queue with one or more elements
        assertFalse(queueTestInt.isEmpty())
        assertFalse(queueTestString.isEmpty())

    }

}