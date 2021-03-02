package com.example.androiddevchallenge

data class Pet(
    val id: Int,
    val name: String,
    val pic: Int,
    val sex: String,
    val weight: Float,
    val desc: String
)

// Tony，Sam，Elina，Shef，Sunny，moon，Candy，jojo，Lisa，
val PETS = listOf(
    Pet(0, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(
        1,
        "Sam",
        R.drawable.ic_tony,
        "Female",
        5.62F,
        """
            descdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdes
            cdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescde
            scdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescd
            escdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdesc
            descdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdes
            cdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescde
            scdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescd
            escdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdesc
            descdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdes
            cdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescde
            scdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescd
            escdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdesc
            descdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdes
            cdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescde
            scdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescd
            escdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdesc
            descdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdescdes
            cdescdescdescdescdescdescdescdescdescdescdesc
        """.trimIndent()
    ),
    Pet(2, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(3, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(4, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(5, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(6, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(7, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(8, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(9, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(10, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(11, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(12, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
    Pet(13, "Tony", R.drawable.ic_tony, "Male", 3.63F, "desc"),
)

fun getPetById(id: Int): Pet? {
    return PETS.find { it.id == id }
}