/*
 * Copyright (c) 2021 Google LLC
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Google designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Google in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package wrapper.java.io;

import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import wrapper.java.nio.channels.FileChannelConversions;

/** The wrapper class for {@link java.nio.channels.FileChannel}. */
public final class FileInputStreamWrapper {

  public static FileChannel getChannel(FileInputStream fileInputStream) {
    return FileChannelConversions.encode(fileInputStream.getChannel());
  }

  private FileInputStreamWrapper() {}
}
