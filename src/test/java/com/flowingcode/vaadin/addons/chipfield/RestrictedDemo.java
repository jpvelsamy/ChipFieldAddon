/*-
 * #%L
 * ChipField Addon
 * %%
 * Copyright (C) 2018 - 2021 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.flowingcode.vaadin.addons.chipfield;

import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import java.util.Arrays;

@PageTitle("Restricted")
@DemoSource
@SuppressWarnings("serial")
public class RestrictedDemo extends VerticalLayout {
  public RestrictedDemo() {
    ChipField<String> chf =
        new ChipField<>("Select some planets (Restricted input, allowed pattern [a-zA-Z])");
    chf.setWidthFull();
    chf.setAvailableItems(
        Arrays.asList(
            "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
    chf.setAllowedPattern("[a-zA-Z]");
    chf.setClosable(true);

    add(chf);
  }
}
