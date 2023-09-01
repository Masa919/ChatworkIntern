fun main() {
    val n = readLine()!!.toInt()
    repeat(n) { i ->
        print(" ".repeat(n-i-1))
        repeat(i){
            print((it+1)%10)
        }
        print((i+1)%10)
        repeat(i){
            print((i-it)%10)
        }
        print("\n")
    }
}