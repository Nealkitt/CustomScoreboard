package gay.j10a1n15.customscoreboard.utils.rendering

import net.minecraft.client.Minecraft
import net.minecraft.client.gui.Font
import net.minecraft.client.gui.GuiGraphics
import net.minecraft.network.chat.Component

typealias AlignedText = Pair<Component, Alignment>

object RenderUtils {

    private val font: Font
        get() = Minecraft.getInstance().font

    fun GuiGraphics.drawAlignedText(text: Component, x: Int, y: Int, width: Int, alignment: Alignment) {
        val textWidth = font.width(text)
        drawString(font, text, x + alignment.align(textWidth, width), y, -1)
    }

    fun GuiGraphics.drawAlignedTexts(texts: List<AlignedText>, x: Int, y: Int, width: Int) {
        var currentY = y
        texts.forEach { text ->
            drawAlignedText(text.first, x, currentY, width, text.second)
            currentY += font.lineHeight
        }
    }
}