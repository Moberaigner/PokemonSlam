import java.io.File
import java.io.FileNotFoundException
import java.util.*

fun main(args: Array<String>) {
    var pokeCnt: Int = 0
    var allCnt: Int = 0

    var scanner: Scanner? = null

    try {
        scanner = Scanner(File("/Users/maxoberaigner/Desktop/PokemonGo/Pokemon.csv"))
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    }

    scanner!!.useDelimiter(";")
    scanner.nextLine()
    //var map = getGelaendetyp(scanner)
    //var map = getWetter(scanner)
    //var map = getKontinent(scanner)
    //var map = getStadt(scanner)
    var map = getTemperatur(scanner)
    scanner.close()

    map.forEach { println(it.key + ":  " + it.value) }
    println(allCnt)
}

fun getGelaendetyp(scanner: Scanner): HashMap<String, Int>{
    var map: HashMap<String, Int> = HashMap<String, Int>()
    while (scanner.hasNext()) {
        val line = scanner.nextLine()
        var p = Pokemon(line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[2], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[3], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[4], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[5], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[6], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[7], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[8], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[9], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[10], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[11], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[12], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[13], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[14], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[15], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[16], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[17], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[18], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[19], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[20])
        if (map.containsKey(p.gelaendetyp))
            map.put(p.gelaendetyp, map.getValue(p.gelaendetyp) + 1)
        else
            map.put(p.gelaendetyp, 1)
    }

    return map;
}

fun getWetter(scanner: Scanner): HashMap<String, Int>{
    var map: HashMap<String, Int> = HashMap<String, Int>()
    while (scanner.hasNext()) {
        val line = scanner.nextLine()
        var p = Pokemon(line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[2], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[3], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[4], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[5], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[6], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[7], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[8], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[9], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[10], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[11], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[12], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[13], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[14], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[15], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[16], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[17], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[18], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[19], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[20])
        if (map.containsKey(p.wetter))
            map.put(p.wetter, map.getValue(p.wetter) + 1)
        else
            map.put(p.wetter, 1)
    }

    return map;
}
fun getKontinent(scanner: Scanner): HashMap<String, Int>{
    var map: HashMap<String, Int> = HashMap<String, Int>()
    while (scanner.hasNext()) {
        val line = scanner.nextLine()
        var p = Pokemon(line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[2], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[3], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[4], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[5], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[6], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[7], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[8], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[9], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[10], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[11], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[12], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[13], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[14], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[15], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[16], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[17], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[18], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[19], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[20])
        if (map.containsKey(p.kontinent))
            map.put(p.kontinent, map.getValue(p.kontinent) + 1)
        else
            map.put(p.kontinent, 1)
    }

    return map;
}

fun getStadt(scanner: Scanner): HashMap<String, Int>{
    var map: HashMap<String, Int> = HashMap<String, Int>()
    while (scanner.hasNext()) {
        val line = scanner.nextLine()
        var p = Pokemon(line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[2], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[3], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[4], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[5], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[6], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[7], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[8], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[9], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[10], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[11], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[12], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[13], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[14], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[15], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[16], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[17], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[18], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[19], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[20])
        if (map.containsKey(p.stadt))
            map.put(p.stadt, map.getValue(p.stadt) + 1)
        else
            map.put(p.stadt, 1)
    }

    return map;
}

fun getTemperatur(scanner: Scanner): HashMap<String, Int>{
    var map: HashMap<String, Int> = HashMap<String, Int>()
    while (scanner.hasNext()) {
        val line = scanner.nextLine()
        var p = Pokemon(line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[2], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[3], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[4], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[5], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[6], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[7], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[8], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[9], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[10], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[11], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[12], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[13], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[14], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[15], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[16], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[17], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[18], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[19], line.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[20])
        if (map.containsKey(p.temperatur))
            map.put(p.temperatur, map.getValue(p.temperatur) + 1)
        else
            map.put(p.temperatur, 1)
    }

    return map;
}