package wonderfulCode

class LinkedList <T>{
    var head: Node<T>?= null
    var tail: Node<T>?= null

    /**
     * Adds the element [data] to the front of the linked list.
     */
    fun pushFront(data: T){
        /**
         * create new node with input data, and next being head
         * head prev is the newly created node
         */

        var newNode: Node<T> = Node(value = data, next = head)

        if (head != null) {
            head!!.prev = newNode

            head = newNode
        } else {
           head = newNode
           tail = newNode
        }


/**
            if checkNotNull(head){
            head!!.prev = WonderfulCode.Node(value = data, next = head);
            /**
             * set new node as head node
             */
            head = head!!.prev

        } else{
            head = WonderfulCode.Node (value = data, next = head);
            tail = head;
        }
*/
    }


    /**
     * Adds the element [data] to the back of the linked list.
     */

    fun pushBack(data: T){
        if (head == null) {
            pushFront(data)
        } else {
            tail!!.next =  Node(value = data, prev = tail)
            tail = tail!!.next
        }
    }

    /**
     * Removes an element from the front of the list. If the list is empty, it is unchanged.
     * @return the value at the front of the list or nil if none exists
     */
    fun popFront(): T?{
        //sets second value as the first in the list
        val poppedVal = head?.value
        head = head?.next

        if (head == null){
            tail = null
        }

        //sets now first value previous link to null
        head?.prev = null
        //returns the popped value
        return poppedVal
    }
    /**
     * Removes an element from the back of the list. If the list is empty, it is unchanged.
     * @return the value at the back of the list or nil if none exists
     */

    fun popBack(): T? {
        //sets second to last value as the last in the list
        val poppedVal = tail?.value
        tail = tail?.prev

        if (tail == null){
            head = null
        }
        //sets now last value next link to null
        tail?.next = null
        //returns the now last value
        return poppedVal
    }

    /**
     * @return the value at the front of the list or nil if none exists
     */
    fun peekFront(): T?{
       return head?.value
    }

    /**
     * @return the value at the back of the list or nil if none exists
     */
    fun peekBack(): T?{
        return tail?.value
    }


    /**
     * @return true if the list is empty and false otherwise
     */
    fun isEmpty(): Boolean{
        if (head == null){
            return true
        } else {
            return false
        }
    }

}