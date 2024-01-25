data class AnimeDetails(
    val name: String,
    val description: String,
    val coverImage: String,
    val episodes: Map<String, Map<String, String>>
)
