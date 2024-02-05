package wonderfulCode

data class Node<T>(var value: T, var prev: Node<T>?= null, var next: Node<T>?= null){
    override fun toString(): String {
        return "$value"
    }
}