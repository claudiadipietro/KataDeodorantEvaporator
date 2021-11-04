class KataDeodorant {
    fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
        var day = 0
        var availableContent = content
        var percentage = threshold/100.0
        var absoulteThreshold = content * percentage
        while (availableContent >= absoulteThreshold){
            var evaporatedContent = (availableContent * evap_per_day/100)
            availableContent = availableContent - evaporatedContent
            day++
        }
        return day
    }
}