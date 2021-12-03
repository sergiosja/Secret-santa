import java.io.File

fun main() {
    val people: List<String> = readLine()!!.split(' ')
    val santas: HashMap<String, String> = hashMapOf()

    for (i in people.indices) {
        var done = false

        while (!done) {
            val value = people[(0..people.size-1).random()]
            if (people[i] != value && !santas.containsValue(value)) {
                santas[people[i]] = value
                done = true
            }
        }
        
        File("${people[i]}.txt").bufferedWriter().use { out -> out.write("${santas.get(people[i])}") }
    }
}
