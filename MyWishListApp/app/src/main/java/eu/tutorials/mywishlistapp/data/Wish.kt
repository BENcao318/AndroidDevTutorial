package eu.tutorials.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = " An Android Watch"),
        Wish(title = "Oculus Quest 3", description = " A VR headset for playing games"),
        Wish(title = "A Sci-fi, Book", description = " A science friction book from any best seller"),
        Wish(title = "Bean bag", description = " A comfy bean bag to substitute for a chair"),
    )
}
