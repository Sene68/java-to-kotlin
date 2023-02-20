package chapter17

fun main() {
    val watches = listOf(
        Watch("Apple Watch", 460000),
        Watch("Apple Watch pro", 560000),
        Watch("Apple Watch m1", 660000),
        Watch("Apple Watch m2", 860000),
        Watch("Galaxy Watch", 460000),
        Watch("Galaxy Watch 2", 560000),
        Watch("Galaxy Watch 3", 660000),
        Watch("Galaxy Watch 4", 860000),
    )

    val isAppleWatch = { watch: Watch -> watch.name == "Apple Watch"}

    println(isAppleWatch(watches[0]))

    val filterWatches = filterWatches(watches) { it.name == "Apple Watch" }
    println(filterWatches.size)
}

private fun filterWatches(
    watches: List<Watch>, filter: (Watch) -> Boolean
): List<Watch> {
    val results = mutableListOf<Watch>()
    for (watch in watches) {
        if (filter(watch))
            results.add(watch)
    }

    return results
}

class Watch(
    val name: String,
    val price: Int
) {
}