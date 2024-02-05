package wonderfulCode

interface Queue<T> {
    /**
     * Add [data] to the end of the queue.
     */
    fun enqueue(data: T)
    /**
     * Remove the element at the front of the queue.  If the queue is empty, it remains unchanged.
     * @return the value at the front of the queue or nil if none exists
     */
    fun dequeue(): T?
    /**
     * @return the value at the front of the queue or nil if none exists
     */
    fun peek(): T?
    /**
     * @return true if the queue is empty and false otherwise
     */
    fun isEmpty(): Boolean
}

class implementQueue <T>: Queue<T> {

    private var QueueLL :LinkedList <T> = LinkedList<T>()

    override fun enqueue(data: T) {
        QueueLL.pushBack(data)
    }

    override fun dequeue(): T? {
       return QueueLL.popFront()
    }

    override fun peek(): T? {
        return QueueLL.peekFront()
    }

    override fun isEmpty(): Boolean {
        return QueueLL.isEmpty()
    }
}