package wonderfulCode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LinkedListTest {
    var testingList1a = LinkedList<Int>()
    var testingList1b = LinkedList<String>()
    var testingList2a = LinkedList<Int>()
    var testingList2b = LinkedList<String>()
    val one = 1
    val two = 2
    val ones = "1111"
    val twos = "2222"

    var expected :Int ?= two

    var expecteds : String ?= twos
    @Test
    fun pushFront() {
        //in all tests, it adds to the front
        //adding int to empty
        testingList1a.pushFront(one)
        expected = one
        assertEquals(expected,testingList1a.head?.value)
        assertEquals(expected,testingList1a.tail?.value)
        //adding int to not empty
        testingList1a.pushFront(two)
        expected = two
        assertEquals(expected,testingList1a.head?.value)
        //adding string to empty
        testingList1b.pushFront(ones)
        expecteds = ones
        assertEquals(expecteds,testingList1b.head?.value)
        assertEquals(expecteds,testingList1b.tail?.value)
        //adding string to not empty
        testingList1b.pushFront(twos)
        expecteds = twos
        assertEquals(expecteds,testingList1b.head?.value)
    }

    @Test
    fun pushBack(){
        //In all tests, it adds to the back
        //adding int to empty
        testingList2a.pushBack(one)
        expected = one
        assertEquals(expected,testingList2a.head?.value)
        assertEquals(expected,testingList2a.tail?.value)

        //adding int to not empty
        testingList2a.pushBack(two)
        expected = two
        assertEquals(expected,testingList2a.tail?.value)
        //adding string to empty
        testingList2b.pushBack(ones)
        expecteds = ones
        assertEquals(expecteds,testingList2b.head?.value)
        assertEquals(expecteds,testingList2b.tail?.value)
        //adding string to not empty
        testingList2b.pushBack(twos)
        expecteds = twos
        assertEquals(expecteds,testingList2b.tail?.value)

    }

    @Test
    fun popFront(){

        //set up arrays

        testingList1a.pushFront(one)
        testingList1a.pushFront(two)

        testingList1b.pushFront(ones)
        testingList1b.pushFront(twos)
        //in all tests removes element from the front of list

        //removes from int LL with two elements
        expected = 2
        assertEquals(expected, testingList1a.popFront())

        expected = 1
        assertEquals(expected, testingList1a.head?.value)
        assertEquals(expected, testingList1a.tail?.value)
        //removes from int LL with one element

        assertEquals (expected, testingList1a.popFront())

        assertNull(testingList1a.head?.value)
        assertNull(testingList1a.tail?.value)
        //removes from int LL with no element
        assertNull(testingList1a.popFront())
        assertNull(testingList1a.head)
        assertNull(testingList1a.tail)

        //removes from string LL with two elements
        expecteds = twos
        assertEquals(expecteds,testingList1b.popFront())

        expecteds = ones
        assertEquals(expecteds, testingList1b.head?.value)
        assertEquals(expecteds, testingList1b.tail?.value)

        //removes from string LL with one element
        assertEquals(expecteds, testingList1b.popFront())
        assertNull(testingList1b.head?.value)
        assertNull(testingList1b.tail?.value)
        //removes from string LL with no element
        assertNull(testingList1b.popFront())
        assertNull(testingList1b.head?.value)
        assertNull(testingList1b.tail?.value)


    }

    @Test
    fun popBack(){

        //set up arrays

        testingList1a.pushFront(one)
        testingList1a.pushFront(two)

        testingList1b.pushFront(ones)
        testingList1b.pushFront(twos)
        //removes element from the back of list

        //removes from int LL with two elements
        expected = one
        assertEquals(expected, testingList1a.popBack())

        expected = two
        assertEquals(expected, testingList1a.head?.value)
        assertEquals(expected, testingList1a.tail?.value)

        //removes from int LL with one element
        assertEquals(expected, testingList1a.popBack())

        assertNull(testingList1a.head?.value)
        assertNull(testingList1a.tail?.value)
        //removes from int LL with no element
        assertNull(testingList1a.popBack())
        assertNull(testingList1a.head)
        assertNull(testingList1a.tail)

        //removes from string LL with two elements
        expecteds = ones
        assertEquals(expecteds,testingList1b.popBack())

        expecteds = twos

        assertEquals(expecteds, testingList1b.head?.value)
        assertEquals(expecteds, testingList1b.tail?.value)

        //removes from string LL with one element
        assertEquals(expecteds, testingList1b.popBack())

        assertNull(testingList1b.head?.value)
        assertNull(testingList1b.tail?.value)

        //removes from string LL with no element

        assertNull(testingList1b.popBack())
        assertNull(testingList1b.head?.value)
        assertNull(testingList1b.tail?.value)



    }

    @Test

    fun peekFront(){
        //set up arrays

        testingList1a.pushFront(one)
        testingList1a.pushFront(two)

        testingList1b.pushFront(ones)
        testingList1b.pushFront(twos)

        //check peek front for int LL
        assertEquals(testingList1a.head?.value, testingList1a.peekFront())

        //check peek front for string LL
        assertEquals(testingList1b.head?.value, testingList1b.peekFront())

    }

    @Test

    fun peekBack(){
        //set up arrays

        testingList1a.pushFront(one)
        testingList1a.pushFront(two)

        testingList1b.pushFront(ones)
        testingList1b.pushFront(twos)

        //check peek back for int LL
        assertEquals(testingList1a.tail?.value, testingList1a.peekBack())

        //check peek back for string LL
        assertEquals(testingList1b.tail?.value, testingList1b.peekBack())
    }

    @Test

    fun isEmpty(){
        //set up arrays

        testingList1a.pushFront(one)
        testingList1a.pushFront(two)

        testingList1b.pushFront(ones)
        testingList1b.pushFront(twos)

        //test will return negative for int LL with 2 elements
        assertFalse(testingList1a.isEmpty())

        //test will return negative for string LL with 2 elements
        assertFalse(testingList1b.isEmpty())

        //test will return positive for empty int LL
        assertTrue(testingList2b.isEmpty())

        //test will return negative for empty string LL
        assertTrue(testingList2b.isEmpty())
    }

}