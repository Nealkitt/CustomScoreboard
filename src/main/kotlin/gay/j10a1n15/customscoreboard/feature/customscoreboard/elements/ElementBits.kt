package gay.j10a1n15.customscoreboard.feature.customscoreboard.elements

import gay.j10a1n15.customscoreboard.config.categories.LinesConfig
import gay.j10a1n15.customscoreboard.feature.customscoreboard.CustomScoreboardRenderer
import gay.j10a1n15.customscoreboard.utils.NumberUtils.format
import tech.thatgravyboat.skyblockapi.api.location.SkyBlockIsland
import tech.thatgravyboat.skyblockapi.api.profile.CurrencyAPI
import tech.thatgravyboat.skyblockapi.api.profile.community.CommunityCenterAPI

object ElementBits : Element() {
    override fun getDisplay() = CustomScoreboardRenderer.formatNumberDisplayDisplay(
        "Bits",
        CurrencyAPI.bits.format() + if (LinesConfig.showBitsAvailable) "§7/§b${CommunityCenterAPI.bitsAvailable.format()}" else "",
        "§b",
    )

    override fun showIsland() = !SkyBlockIsland.inAnyIsland(SkyBlockIsland.THE_RIFT, SkyBlockIsland.THE_CATACOMBS)

    override val configLine: String = "Bits"
}
