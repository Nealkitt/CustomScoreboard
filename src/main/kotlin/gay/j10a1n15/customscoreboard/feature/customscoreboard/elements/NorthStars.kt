package gay.j10a1n15.customscoreboard.feature.customscoreboard.elements

import tech.thatgravyboat.skyblockapi.api.location.SkyblockIsland
import tech.thatgravyboat.skyblockapi.api.profile.CurrencyAPI

object NorthStars : ScoreboardElement() {
    override fun getDisplay() = "North Stars: §d${CurrencyAPI.northStars}"

    override fun showIsland() = SkyblockIsland.inAnyIsland(SkyblockIsland.JERRYS_WORKSHOP)

    override val configLine = "North Stars"
}
