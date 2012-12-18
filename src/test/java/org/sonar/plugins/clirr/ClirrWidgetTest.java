/*
 * Sonar Clirr Plugin
 * Copyright (C) 2009 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */

/*
 * Sonar is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * Sonar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Sonar; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.clirr;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class ClirrWidgetTest {
  @Test
  public void template_should_exist() {
    String path = new ClirrWidget().getTemplatePath();
    assertThat(ClirrWidget.class.getResource(path)).isNotNull();
  }

  @Test
  public void widget_should_be_declared_in_plugin() {
    assertThat(new ClirrPlugin().getExtensions()).contains(ClirrWidget.class);
  }

  @Test
  public void test_metadata() {
    assertThat(new ClirrWidget().getId()).isNotEmpty();
    assertThat(new ClirrWidget().getTitle()).isNotEmpty();
  }
}
