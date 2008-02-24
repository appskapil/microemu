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

package java.io;

/**
 * A data input stream lets an application write primitive Java data
 * types to an output stream in a portable way. An application can
 * then use a data input stream to read the data back in.
 *
 * @version 1.31, 12/04/99 (CLDC 1.0, Spring 2000)
 * @see     java.io.DataInputStream
 * @since   JDK1.0
 */
public
class DataOutputStream extends OutputStream implements DataOutput {

    /**
     * The output stream.
     */
    protected OutputStream out;

    /**
     * Creates a new data output stream to write data to the specified
     * underlying output stream.
     *
     * @param   out   the underlying output stream, to be saved for later
     *                use.
     */
    public DataOutputStream(OutputStream out) {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes the specified byte (the low eight bits of the argument
     * <code>b</code>) to the underlying output stream.
     * <p>
     * Implements the <code>write</code> method of <code>OutputStream</code>.
     *
     * @param      b   the <code>byte</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     */
    public void write(int b) throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes <code>len</code> bytes from the specified byte array
     * starting at offset <code>off</code> to the underlying output stream.
     *
     * @param      b     the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of bytes to write.
     * @exception  IOException  if an I/O error occurs.
     */
    public void write(byte b[], int off, int len) throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Flushes this data output stream. This forces any buffered output
     * bytes to be written out to the stream.
     * <p>
     * The <code>flush</code> method of <code>DataOutputStream</code>
     * calls the <code>flush</code> method of its underlying output stream.
     *
     * @exception  IOException  if an I/O error occurs.
     */
    public void flush() throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Closes this output stream and releases any system resources
     * associated with the stream.
     * <p>
     * The <code>close</code> method
     * calls its <code>flush</code> method, and then calls the
     * <code>close</code> method of its underlying output stream.
     *
     * @exception  IOException  if an I/O error occurs.
     */
    public void close() throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes a <code>boolean</code> to the underlying output stream as
     * a 1-byte value. The value <code>true</code> is written out as the
     * value <code>(byte)1</code>; the value <code>false</code> is
     * written out as the value <code>(byte)0</code>.
     *
     * @param      v   a <code>boolean</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     */
    public final void writeBoolean(boolean v) throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes out a <code>byte</code> to the underlying output stream as
     * a 1-byte value.
     *
     * @param      v   a <code>byte</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     */
    public final void writeByte(int v) throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes a <code>short</code> to the underlying output stream as two
     * bytes, high byte first.
     *
     * @param      v   a <code>short</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     */
    public final void writeShort(int v) throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes a <code>char</code> to the underlying output stream as a
     * 2-byte value, high byte first.
     *
     * @param      v   a <code>char</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     */
    public final void writeChar(int v) throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes an <code>int</code> to the underlying output stream as four
     * bytes, high byte first.
     *
     * @param      v   an <code>int</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     */
    public final void writeInt(int v) throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes a <code>long</code> to the underlying output stream as eight
     * bytes, high byte first.
     *
     * @param      v   a <code>long</code> to be written.
     * @exception  IOException  if an I/O error occurs.
     */
    public final void writeLong(long v) throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes a string to the underlying output stream as a sequence of
     * characters. Each character is written to the data output stream as
     * if by the <code>writeChar</code> method.
     *
     * @param      s   a <code>String</code> value to be written.
     * @exception  IOException  if an I/O error occurs.
     * @see        java.io.DataOutputStream#writeChar(int)
     */
    public final void writeChars(String s) throws IOException {
        throw new RuntimeException("STUB");
    }

    /**
     * Writes a string to the underlying output stream using UTF-8
     * encoding in a machine-independent manner.
     * <p>
     * First, two bytes are written to the output stream as if by the
     * <code>writeShort</code> method giving the number of bytes to
     * follow. This value is the number of bytes actually written out,
     * not the length of the string. Following the length, each character
     * of the string is output, in sequence, using the UTF-8 encoding
     * for the character.
     *
     * @param      str   a string to be written.
     * @exception  IOException  if an I/O error occurs.
     */
    public final void writeUTF(String str) throws IOException {
        throw new RuntimeException("STUB");
    }

}
