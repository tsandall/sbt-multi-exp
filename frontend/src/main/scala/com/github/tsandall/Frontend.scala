import com.github.tsandall.Backend

object Frontend {
    def func(): Unit = {
        println("FRONTEND")
        Backend.func()
    }
}

object Main extends App {

    Frontend.func()

}
// vim: set ts=4 sw=4 et:
