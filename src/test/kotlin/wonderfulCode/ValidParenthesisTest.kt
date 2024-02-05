package wonderfulCode

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


class ValidParenthesisTest {

    @Test
    fun TestTrueCase () {
        assertTrue(ValidParenthesis("()"))
        assertTrue(ValidParenthesis("({[)}]"))
    }

    @Test
    fun TestFalseCase (){
        assertFalse(ValidParenthesis("(}"))

    }
}
