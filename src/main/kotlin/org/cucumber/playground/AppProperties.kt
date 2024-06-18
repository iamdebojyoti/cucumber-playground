package org.cucumber.playground

data class AppProperties(
    val name: String,
    val secret: String
) {
    companion object {
        fun load(): AppProperties {
            val nameProp = System.getenv("NAME")
            val secretProp = System.getenv("SECRET")

            return AppProperties(
                name = nameProp,
                secret = secretProp
            )
        }
    }
}