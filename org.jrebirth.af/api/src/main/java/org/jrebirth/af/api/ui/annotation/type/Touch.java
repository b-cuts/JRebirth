/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2014
 * Contact : sebastien.bordes@jrebirth.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.af.api.ui.annotation.type;

import javafx.event.EventType;
import javafx.scene.input.TouchEvent;

import org.jrebirth.af.api.ui.annotation.EnumEventType;

/**
 * The Touch event type.<br />
 * The Touch type will be appended to method name to use.
 */
public enum Touch implements EnumEventType {

    /** Any Swipe Event. */
    Any(TouchEvent.ANY),

    /** Touch pressed event. */
    Pressed(TouchEvent.TOUCH_PRESSED),

    /** Touch released event. */
    Released(TouchEvent.TOUCH_RELEASED),

    /** Touch moved event. */
    Moved(TouchEvent.TOUCH_MOVED),

    /** Touch stationary event. */
    Stationary(TouchEvent.TOUCH_STATIONARY);

    /** The JavaFX internal api name. */
    private EventType<?> eventType;

    /**
     * Default constructor used to link the apiName.
     *
     * @param eventType the javafx event type
     */
    private Touch(final EventType<?> eventType) {
        this.eventType = eventType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventType<?> eventType() {
        return this.eventType;
    }

}
