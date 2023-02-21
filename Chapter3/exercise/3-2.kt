fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { f(g(it)) }

fun square(n: Int) = n * n
fun triple(n: Int) = n * 3

fun main() {
    val res = compose(::square, ::triple)(2)
    println(res)
}
