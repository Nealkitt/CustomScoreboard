package gay.j10a1n15.customscoreboard.feature.customscoreboard.events

import net.minecraft.network.chat.Component
import tech.thatgravyboat.skyblockapi.api.events.base.Subscription
import tech.thatgravyboat.skyblockapi.api.events.info.ScoreboardUpdateEvent
import tech.thatgravyboat.skyblockapi.api.location.SkyBlockIsland
import tech.thatgravyboat.skyblockapi.utils.regex.component.ComponentRegex

object EventRift : Event() {
    override fun getDisplay() = ""

    override fun showIsland() = SkyBlockIsland.inAnyIsland(SkyBlockIsland.THE_RIFT)

    override val configLine = "Rift"


    private var formattedLines = mutableListOf<Component>()

    private val hotdogContestRegex = ComponentRegex("Hot Dog Contest|Eaten: \\d+/\\d+")
    private val aveikxRegex = ComponentRegex("Time spent sitting|with Ävaeìkx: .*")
    private val cluesRegex = ComponentRegex("Clues: \\d+/\\d+")
    private val barryProtestRegex = ComponentRegex("First Up|Find and talk with Barry")
    private val protestorsHandledRegex = ComponentRegex("Protestors handled: \\d+/\\d+")

    private val patterns = listOf(hotdogContestRegex, aveikxRegex, cluesRegex, barryProtestRegex, protestorsHandledRegex)


    @Subscription
    fun onScoreboardUpdate(event: ScoreboardUpdateEvent) {
        formattedLines.clear()
        formattedLines.addAll(
            event.components.filter { component ->
                patterns.any { it.matches(component) }
            },
        )
    }
}
