package gay.j10a1n15.customscoreboard.config

import com.teamresourceful.resourcefulconfig.api.annotations.*
import com.teamresourceful.resourcefulconfig.api.types.entries.Observable
import gay.j10a1n15.customscoreboard.config.categories.BackgroundConfig
import gay.j10a1n15.customscoreboard.config.categories.LinesConfig
import gay.j10a1n15.customscoreboard.config.objects.TitleOrFooterObject
import gay.j10a1n15.customscoreboard.feature.customscoreboard.CustomScoreboardRenderer
import gay.j10a1n15.customscoreboard.feature.customscoreboard.ScoreboardEntry
import gay.j10a1n15.customscoreboard.feature.customscoreboard.ScoreboardEventEntry
import gay.j10a1n15.customscoreboard.utils.NumberFormatType
import gay.j10a1n15.customscoreboard.utils.rendering.alignment.HorizontalAlignment
import gay.j10a1n15.customscoreboard.utils.rendering.alignment.VerticalAlignment

@ConfigInfo.Provider(InfoProvider::class)
@Config(
    value = "customscoreboard/config",
    categories = [BackgroundConfig::class, LinesConfig::class],
)
object MainConfig {

    @ConfigEntry(id = "enabled", translation = "config.cs.enabled")
    @Comment("", translation = "config.cs.enabled.desc")
    var enabled: Boolean = true

    @ConfigEntry(id = "appearance", translation = "config.cs.appearance")
    @ConfigOption.Draggable(value = ["SEPARATOR"])
    @Comment("", translation = "config.cs.appearance.desc")
    val appearance: Observable<Array<ScoreboardEntry>> = Observable.of(ScoreboardEntry.default)

    @ConfigEntry(id = "events", translation = "config.cs.events")
    @ConfigOption.Draggable
    @Comment("", translation = "config.cs.events.desc")
    val events: Observable<Array<ScoreboardEventEntry>> = Observable.of(ScoreboardEventEntry.entries.toTypedArray())

    @ConfigEntry(id = "title_options", translation = "config.cs.title_options")
    @Comment("", translation = "config.cs.title_options.desc")
    val title: TitleOrFooterObject = TitleOrFooterObject()

    @ConfigEntry(id = "footer_options", translation = "config.cs.footer_options")
    @Comment("", translation = "config.cs.footer_options.desc")
    val footer: TitleOrFooterObject = TitleOrFooterObject()

    @ConfigEntry(id = "number_display_format", translation = "config.cs.number_display_format")
    @Comment("", translation = "config.cs.number_display_format.desc")
    var numberDisplayFormat: CustomScoreboardRenderer.NumberDisplayFormat = CustomScoreboardRenderer.NumberDisplayFormat.TEXT_COLOR_NUMBER

    @ConfigEntry(id = "number_format", translation = "config.cs.number_format")
    @Comment("", translation = "config.cs.number_format.desc")
    var numberFormat: NumberFormatType = NumberFormatType.LONG

    @ConfigEntry(id = "vertical_alignment", translation = "config.cs.vertical_alignment")
    @Comment("", translation = "config.cs.vertical_alignment.desc")
    var verticalAlignment: VerticalAlignment = VerticalAlignment.CENTER

    @ConfigEntry(id = "horizontal_alignment", translation = "config.cs.horizontal_alignment")
    @Comment("", translation = "config.cs.horizontal_alignment.desc")
    var horizontalAlignment: HorizontalAlignment = HorizontalAlignment.RIGHT

    @ConfigEntry(id = "hide_hypixel", translation = "config.cs.hide_hypixel")
    @Comment("", translation = "config.cs.hide_hypixel.desc")
    var hideHypixelScoreboard: Boolean = true

    @ConfigEntry(id = "text_shadow", translation = "config.cs.text_shadow")
    @Comment("", translation = "config.cs.text_shadow.desc")
    var textShadow: Boolean = true

    @ConfigEntry(id = "update_notification", translation = "config.cs.update_notification")
    @Comment("", translation = "config.cs.update_notification.desc")
    var updateNotification: Boolean = true

}
