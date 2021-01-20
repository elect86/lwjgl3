package lwjgl

/**
 * Precompiled [build.gradle.kts][lwjgl.Build_gradle] script plugin.
 *
 * @see lwjgl.Build_gradle
 */
class BuildPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("lwjgl.Build_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
