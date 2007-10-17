/*
 *   
 *
 * Copyright  1990-2007 Sun Microsystems, Inc. All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License version
 * 2 only, as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License version 2 for more details (a copy is
 * included at /legal/license.txt).
 * 
 * You should have received a copy of the GNU General Public License
 * version 2 along with this work; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA
 * 
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa
 * Clara, CA 95054 or visit www.sun.com if you need additional
 * information or have any questions.
 */

package javax.microedition.lcdui;

/**
 * A listener type for receiving notification of commands that have been
 * invoked on {@link Item} objects.  An <code>Item</code> can have
 * <code>Commands</code> associated with
 * it.  When such a command is invoked, the application is notified by having
 * the {@link #commandAction commandAction()} method called on the
 * <code>ItemCommandListener</code> that had been set on the
 * <code>Item</code> with a call to
 * {@link Item#setItemCommandListener setItemCommandListener()}.
 * @since MIDP 2.0
 *
 */
public interface ItemCommandListener {

    /**
     * Called by the system to indicate that a command has been invoked on a 
     * particular item.
     * 
     * @param c the <code>Command</code> that was invoked
     * @param item the <code>Item</code> on which the command was invoked
     */
    public void commandAction(Command c, Item item);
}