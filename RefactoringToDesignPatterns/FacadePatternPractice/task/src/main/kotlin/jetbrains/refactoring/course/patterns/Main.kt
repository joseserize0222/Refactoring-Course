package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val videoConverter = VideoConversionFacade()
    videoConverter.convertVideo(args[0], args[1])
}
