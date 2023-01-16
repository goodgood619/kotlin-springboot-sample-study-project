package com.group.libraryapp.calculator
fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
}
class CalculatorTest {

    fun addTest() {
        val calculator = Calculator(5)
        calculator.add(3)

        if (calculator.number != 8) {
            throw IllegalStateException()
        }
    }

    fun minusTest() {
        val calculator = Calculator(5)
        calculator.minus(2)

        if (calculator.number != 3) {
            throw IllegalStateException()
        }
    }

    fun multiplyTest() {
        val calculator = Calculator(5)
        calculator.multiply(3)

        if (calculator.number != 15) {
            throw IllegalStateException()
        }
    }

    fun divideExceptionTest() {

        // given

        val calculator = Calculator(5)

        //  when
        try {
            calculator.divide(0)
        } catch (e : IllegalArgumentException) {
            return
        } catch (e : Exception) {
            throw IllegalStateException()
        }

        throw IllegalStateException("예상되는 예외가 발생하지 않음")
    }

    
}