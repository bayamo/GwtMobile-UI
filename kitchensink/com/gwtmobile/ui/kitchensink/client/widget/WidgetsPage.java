/*
 * Copyright (c) 2010 Zhihua (Dennis) Jiang
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtmobile.ui.kitchensink.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Widget;
import com.gwtmobile.ui.client.event.SelectionChangedEvent;
import com.gwtmobile.ui.client.page.Page;
import com.gwtmobile.ui.client.widgets.ListPanel;

public class WidgetsPage extends Page {

	@UiField ListPanel list;
	
	private static WidgetsPageUiBinder uiBinder = GWT
			.create(WidgetsPageUiBinder.class);

	interface WidgetsPageUiBinder extends UiBinder<Widget, WidgetsPage> {
	}

	public WidgetsPage() {
		initWidget(uiBinder.createAndBindUi(this));
	}

    @UiHandler("list")
    void onListSelectionChanged(SelectionChangedEvent e) {
    	switch (e.getSelection()) {
    	case 1:
    		CheckBoxPage checkBox = new CheckBoxPage();
    		goTo(checkBox);
    		break;
    	case 3:
    		RadioButtonPage radioButton = new RadioButtonPage();
    		goTo(radioButton);
    		break;
    	case 5:
    		TextBoxPage textBox = new TextBoxPage();
    		goTo(textBox);
    		break;
    	}
    }

}
