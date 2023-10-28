package jarvis.ca

sealed class DisplayTime(val time: kotlin.Long) {
    object Short : DisplayTime(2000L)
    object Medium : DisplayTime(3000L)
    object Long : DisplayTime(4000L)
    object ExtraLong : DisplayTime(6000L)
}
