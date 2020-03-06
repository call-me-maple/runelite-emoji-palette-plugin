package hjdarnel.emojipalette;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

@Slf4j
class EmojiPanel extends PluginPanel
{
	private static final Color TWEET_BACKGROUND = new Color(15, 15, 15);
	private static final Color OSRS_NEWS_BACKGROUND = new Color(36, 30, 19);
	private static final Color BLOG_POST_BACKGROUND = new Color(11, 30, 41);

	private static final int MAX_CONTENT_LINES = 3;
	private static final int CONTENT_WIDTH = 148;
	private static final int TIME_WIDTH = 20;


	void init()
	{

		setLayout(new BorderLayout());
		setBackground(ColorScheme.DARK_GRAY_COLOR);

		setBorder(new EmptyBorder(10, 10, 10, 10));
		setBackground(ColorScheme.DARK_GRAY_COLOR);
		JPanel emojiPanel = new JPanel();
		JLabel version = new JLabel("hi");
		emojiPanel.add(version);

		add(emojiPanel, BorderLayout.NORTH);
	}
}

/*
 * Copyright (c) 2020, Lotto <https://github.com/devLotto>
 * Copyright (c) 2020, Psikoi <https://github.com/psikoi>
 * Copyright (c) 2020, Henry Darnell <https://github.com/hjdarnel>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
//
//package hjdarnel.emojipalette;
//
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import lombok.extern.slf4j.Slf4j;
//import net.runelite.client.ui.ColorScheme;
//import net.runelite.client.ui.PluginPanel;
//import net.runelite.client.ui.components.PluginErrorPanel;
//import net.runelite.client.util.ImageUtil;
//import net.runelite.client.plugins.emojis.Emoji;
//
//@Slf4j
//class EmojiPanel extends PluginPanel
//{
//	void init()
//	{
//		setBorder(new EmptyBorder(10, 10, 10, 10));
//
//		final PluginErrorPanel errorPanel = new PluginErrorPanel();
//		errorPanel.setBorder(new EmptyBorder(10, 25, 10, 25));
//		errorPanel.setContent("Emoji Palette", "Hover over an emoji to view the text trigger");
//		add(errorPanel, BorderLayout.NORTH);
//
//		JPanel emojiPanel = new JPanel();
//		emojiPanel.setLayout(new GridLayout(11, 3));
//		emojiPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
//		emojiPanel.setBorder(new EmptyBorder(5, 0, 5, 0));
//
//		for (final Emoji emoji : Emoji.values())
//		{
//			JPanel panel = makeHiscorePanel(emoji);
//			emojiPanel.add(panel);
//		}
//
//		add(emojiPanel);
//	}
//
//	/* Builds a JPanel displaying an icon with tooltip */
//	private JPanel makeHiscorePanel(Emoji emoji)
//	{
//		JLabel label = new JLabel();
//		label.setToolTipText(EmojiPalettePlugin.unescapeTags(emoji.trigger));
//		label.setIcon(new ImageIcon(ImageUtil.getResourceStreamFromClass(Emoji.class, emoji.name().toLowerCase() + ".png")));
//
//		JPanel skillPanel = new JPanel();
//		skillPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
//		skillPanel.setBorder(new EmptyBorder(2, 0, 2, 0));
//		skillPanel.add(label);
//
//		return skillPanel;
//	}
//}