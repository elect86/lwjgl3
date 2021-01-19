/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lwjgl

object Lwjgl {

    val properties = mutableMapOf<String, String>()

    operator fun get(key: String): String? = properties[key]
    operator fun invoke(key: String): Boolean? = properties[key]?.equals("true")
    operator fun set(key: String, value: String) = properties.put(key, value)
    operator fun set(key: String, value: Boolean?) = properties.put(key, if(value == true) "true" else "false")
}

object env {
    operator fun get(variable: String): String? = System.getenv(variable)
}