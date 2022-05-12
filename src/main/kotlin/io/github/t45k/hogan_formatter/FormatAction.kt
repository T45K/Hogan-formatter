package io.github.t45k.hogan_formatter

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class FormatAction : AnAction() {
	override fun actionPerformed(e: AnActionEvent) {
		Messages.showMessageDialog("テキスト", "テキスト", null)
	}
}
