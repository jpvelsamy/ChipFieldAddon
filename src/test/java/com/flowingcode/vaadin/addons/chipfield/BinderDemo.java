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

import java.util.Arrays;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.binder.Binder;

@SuppressWarnings("serial")
public class BinderDemo extends VerticalLayout {

	public BinderDemo() {

		Planet p = new Planet("A new planet");

		ChipField<String> chf = new ChipField<>("Choose planet features (try with: 'Rings', 'Moons', 'Water', etc.)");
		chf.setWidthFull();
		chf.setItems(Arrays.asList("Rings", "Moons", "Water", "Rocks", "Lava", "Ice", "Cold", "Heat", "Atmosphere"));
		Binder<Planet> binder = new Binder<>();
		binder.bind(chf, Planet::getFeatures, Planet::setFeatures);
		binder.setBean(p);

		chf.addValueChangeListener(
				newItem -> Notification.show("Current value: " + newItem.getValue(), 5000, Position.BOTTOM_START));

		add(chf);
		add(new Button("Show planet features",
				e -> Notification.show("Features: " + p.getFeatures(), 5000, Position.BOTTOM_START)));

	}

}
