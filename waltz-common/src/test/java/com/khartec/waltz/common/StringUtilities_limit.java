/*
 *  This file is part of Waltz.
 *
 *     Waltz is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Waltz is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Waltz.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.khartec.waltz.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringUtilities_limit {

    @Test
    public void limitingNullGivesNull() {
        String result = StringUtilities.limit(null, 10);
        assertNull(result);
    }

    @Test
    public void limitingLongStringReturnsInitialPortion() {
        String result = StringUtilities.limit("hello world", 5);
        assertEquals("hello", result);
    }

    @Test
    public void limitingShortStringReturnsFullString() {
        String result = StringUtilities.limit("hello", 10);
        assertEquals("hello", result);
    }


}
