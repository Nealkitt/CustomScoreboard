package gay.j10a1n15.customscoreboard.config.objects

import com.teamresourceful.resourcefulconfig.api.annotations.ConfigEntry
import com.teamresourceful.resourcefulconfig.api.annotations.ConfigObject
import tech.thatgravyboat.skyblockapi.helpers.McClient

@ConfigObject
class Position(
    @ConfigEntry(id = "x") var x: Int = 0,
    @ConfigEntry(id = "y") var y: Int = 0,
    @ConfigEntry(id = "scale") var scale: Float = 1.0f,
) {

    private val initialPos = x to y

    operator fun component1(): Int = if (x < 0) McClient.window.guiScaledWidth + x else x
    operator fun component2(): Int = if (y < 0) McClient.window.guiScaledHeight + y else y

    fun reset() {
        x = initialPos.first
        y = initialPos.second
    }
}
