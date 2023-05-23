import java.time.LocalDateTime
import java.time.ZoneId

fun main() {
    val zones = listOf("Europe/London", "America/New_York", "Asia/Tokyo", "Australia/Sydney")

    println("World Clock")
    println("------------")

    while (true) {
        for (zone in zones) {
            val time = LocalDateTime.now(ZoneId.of(zone))
            println("$zone: $time")
        }
        println()

        Thread.sleep(1000)
    }
}
