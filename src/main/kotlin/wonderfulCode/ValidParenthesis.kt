package wonderfulCode

fun ValidParenthesis (inputString: String) : Boolean {
    var openParenthesesQueue = implementQueue<Char>();
    for (i in inputString){
        when (i){
            in "({[" -> {
                when(i) {
                    '(' -> openParenthesesQueue.enqueue(')')
                    '{' -> openParenthesesQueue.enqueue('}')
                    '[' -> openParenthesesQueue.enqueue(']')
                }
            }
            in ")}]"->{
                if (i == openParenthesesQueue.peek())
                { openParenthesesQueue.dequeue()
                }
                else{
                    //println(i)
                    //println(openParenthesesQueue.peek())
                    return false
                }
            }
            else -> error("String contains unsupported characters")
        }
    }
    return true

}