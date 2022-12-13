/**
 * Copyright (c) 2007, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
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
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.launcher.resources;

import java.util.ListResourceBundle;

public final class launcher_zh_CN extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "java.launcher.X.macosx.usage", "\n\u4EE5\u4E0B\u9009\u9879\u4E3A Mac OS X \u7279\u5B9A\u7684\u9009\u9879:\n    -XstartOnFirstThread\n                      \u5728\u7B2C\u4E00\u4E2A (AppKit) \u7EBF\u7A0B\u4E0A\u8FD0\u884C main() \u65B9\u6CD5\n    -Xdock:name=<\u5E94\u7528\u7A0B\u5E8F\u540D\u79F0>\n                      \u8986\u76D6\u505C\u9760\u680F\u4E2D\u663E\u793A\u7684\u9ED8\u8BA4\u5E94\u7528\u7A0B\u5E8F\u540D\u79F0\n    -Xdock:icon=<\u56FE\u6807\u6587\u4EF6\u7684\u8DEF\u5F84>\n                      \u8986\u76D6\u505C\u9760\u680F\u4E2D\u663E\u793A\u7684\u9ED8\u8BA4\u56FE\u6807\n\n" },
            { "java.launcher.X.usage", "\n    -Xbatch           \u7981\u7528\u540E\u53F0\u7F16\u8BD1\n    -Xbootclasspath/a:<\u4EE5 {0} \u5206\u9694\u7684\u76EE\u5F55\u548C zip/jar \u6587\u4EF6>\n                      \u9644\u52A0\u5728\u5F15\u5BFC\u7C7B\u8DEF\u5F84\u672B\u5C3E\n    -Xcheck:jni       \u5BF9 JNI \u51FD\u6570\u6267\u884C\u5176\u4ED6\u68C0\u67E5\n    -Xcomp            \u5728\u9996\u6B21\u8C03\u7528\u65F6\u5F3A\u5236\u7F16\u8BD1\u65B9\u6CD5\n    -Xdebug           \u4E3A\u5B9E\u73B0\u5411\u540E\u517C\u5BB9\u800C\u63D0\u4F9B\n    -Xdiag            \u663E\u793A\u9644\u52A0\u8BCA\u65AD\u6D88\u606F\n    -Xfuture          \u542F\u7528\u6700\u4E25\u683C\u7684\u68C0\u67E5\uFF0C\u9884\u671F\u5C06\u6765\u7684\u9ED8\u8BA4\u503C\n    -Xint             \u4EC5\u89E3\u91CA\u6A21\u5F0F\u6267\u884C\n    -Xinternalversion\n                      \u663E\u793A\u6BD4 -version \u9009\u9879\u66F4\u8BE6\u7EC6\u7684 JVM\n                      \u7248\u672C\u4FE1\u606F\n    -Xloggc:<\u6587\u4EF6>    \u5C06 GC \u72B6\u6001\u8BB0\u5F55\u5728\u6587\u4EF6\u4E2D\uFF08\u5E26\u65F6\u95F4\u6233\uFF09\n    -Xmixed           \u6DF7\u5408\u6A21\u5F0F\u6267\u884C\uFF08\u9ED8\u8BA4\u503C\uFF09\n    -Xmn<\u5927\u5C0F>        \u4E3A\u5E74\u8F7B\u4EE3\uFF08\u65B0\u751F\u4EE3\uFF09\u8BBE\u7F6E\u521D\u59CB\u548C\u6700\u5927\u5806\u5927\u5C0F\n                      \uFF08\u4EE5\u5B57\u8282\u4E3A\u5355\u4F4D\uFF09\n    -Xms<\u5927\u5C0F>        \u8BBE\u7F6E\u521D\u59CB Java \u5806\u5927\u5C0F\n    -Xmx<\u5927\u5C0F>        \u8BBE\u7F6E\u6700\u5927 Java \u5806\u5927\u5C0F\n    -Xnoclassgc       \u7981\u7528\u7C7B\u5783\u573E\u6536\u96C6\n    -Xrs              \u51CF\u5C11 Java/VM \u5BF9\u64CD\u4F5C\u7CFB\u7EDF\u4FE1\u53F7\u7684\u4F7F\u7528\uFF08\u8BF7\u53C2\u89C1\u6587\u6863\uFF09\n    -Xshare:auto      \u5728\u53EF\u80FD\u7684\u60C5\u51B5\u4E0B\u4F7F\u7528\u5171\u4EAB\u7C7B\u6570\u636E\uFF08\u9ED8\u8BA4\u503C\uFF09\n    -Xshare:off       \u4E0D\u5C1D\u8BD5\u4F7F\u7528\u5171\u4EAB\u7C7B\u6570\u636E\n    -Xshare:on        \u8981\u6C42\u4F7F\u7528\u5171\u4EAB\u7C7B\u6570\u636E\uFF0C\u5426\u5219\u5C06\u5931\u8D25\u3002\n    -XshowSettings    \u663E\u793A\u6240\u6709\u8BBE\u7F6E\u5E76\u7EE7\u7EED\n    -XshowSettings:all\n                      \u663E\u793A\u6240\u6709\u8BBE\u7F6E\u5E76\u7EE7\u7EED\n    -XshowSettings:locale\n                      \u663E\u793A\u6240\u6709\u4E0E\u533A\u57DF\u8BBE\u7F6E\u76F8\u5173\u7684\u8BBE\u7F6E\u5E76\u7EE7\u7EED\n    -XshowSettings:properties\n                      \u663E\u793A\u6240\u6709\u5C5E\u6027\u8BBE\u7F6E\u5E76\u7EE7\u7EED\n    -XshowSettings:vm\n                      \u663E\u793A\u6240\u6709\u4E0E vm \u76F8\u5173\u7684\u8BBE\u7F6E\u5E76\u7EE7\u7EED\n    -XshowSettings:system\n                      \uFF08\u4EC5 Linux\uFF09\u663E\u793A\u4E3B\u673A\u7CFB\u7EDF\u6216\u5BB9\u5668\n                      \u914D\u7F6E\u5E76\u7EE7\u7EED\n    -Xss<\u5927\u5C0F>        \u8BBE\u7F6E Java \u7EBF\u7A0B\u5806\u6808\u5927\u5C0F\n    -Xverify          \u8BBE\u7F6E\u5B57\u8282\u7801\u9A8C\u8BC1\u5668\u7684\u6A21\u5F0F\n    --add-reads <\u6A21\u5757>=<\u76EE\u6807\u6A21\u5757>(,<\u76EE\u6807\u6A21\u5757>)*\n                      \u66F4\u65B0 <\u6A21\u5757> \u4EE5\u8BFB\u53D6 <\u76EE\u6807\u6A21\u5757>\uFF0C\u800C\u65E0\u8BBA\n                      \u6A21\u5757\u58F0\u660E\u5982\u4F55\u3002\n                      <\u76EE\u6807\u6A21\u5757> \u53EF\u4EE5\u662F ALL-UNNAMED \u4EE5\u8BFB\u53D6\u6240\u6709\u672A\u547D\u540D\n                      \u6A21\u5757\u3002\n    --add-exports <\u6A21\u5757>/<\u7A0B\u5E8F\u5305>=<\u76EE\u6807\u6A21\u5757>(,<\u76EE\u6807\u6A21\u5757>)*\n                      \u66F4\u65B0 <\u6A21\u5757> \u4EE5\u5C06 <\u7A0B\u5E8F\u5305> \u5BFC\u51FA\u5230 <\u76EE\u6807\u6A21\u5757>\uFF0C\n                      \u800C\u65E0\u8BBA\u6A21\u5757\u58F0\u660E\u5982\u4F55\u3002\n                      <\u76EE\u6807\u6A21\u5757> \u53EF\u4EE5\u662F ALL-UNNAMED \u4EE5\u5BFC\u51FA\u5230\u6240\u6709\n                      \u672A\u547D\u540D\u6A21\u5757\u3002\n    --add-opens <\u6A21\u5757>/<\u7A0B\u5E8F\u5305>=<\u76EE\u6807\u6A21\u5757>(,<\u76EE\u6807\u6A21\u5757>)*\n                      \u66F4\u65B0 <\u6A21\u5757> \u4EE5\u5728 <\u76EE\u6807\u6A21\u5757> \u4E2D\u6253\u5F00\n                      <\u7A0B\u5E8F\u5305>\uFF0C\u800C\u65E0\u8BBA\u6A21\u5757\u58F0\u660E\u5982\u4F55\u3002\n    --illegal-access=<\u503C>\n                      \u5141\u8BB8\u6216\u62D2\u7EDD\u901A\u8FC7\u672A\u547D\u540D\u6A21\u5757\u4E2D\u7684\u4EE3\u7801\u5BF9\u547D\u540D\u6A21\u5757\u4E2D\u7684\n                      \u7C7B\u578B\u6210\u5458\u8FDB\u884C\u8BBF\u95EE\u3002\n                      <\u503C> \u4E3A \"deny\"\u3001\"permit\"\u3001\"warn\" \u6216 \"debug\" \u4E4B\u4E00\n                      \u6B64\u9009\u9879\u5C06\u5728\u672A\u6765\u53D1\u884C\u7248\u4E2D\u5220\u9664\u3002\n    --limit-modules <\u6A21\u5757\u540D>[,<\u6A21\u5757\u540D>...]\n                      \u9650\u5236\u53EF\u89C2\u5BDF\u6A21\u5757\u7684\u9886\u57DF\n    --patch-module <\u6A21\u5757>=<\u6587\u4EF6>({0}<\u6587\u4EF6>)*\n                      \u4F7F\u7528 JAR \u6587\u4EF6\u6216\u76EE\u5F55\u4E2D\u7684\u7C7B\u548C\u8D44\u6E90\n                      \u8986\u76D6\u6216\u589E\u5F3A\u6A21\u5757\u3002\n    --disable-@files  \u7981\u6B62\u8FDB\u4E00\u6B65\u6269\u5C55\u53C2\u6570\u6587\u4EF6\n    --source <\u7248\u672C>\n                      \u8BBE\u7F6E\u6E90\u6587\u4EF6\u6A21\u5F0F\u4E2D\u6E90\u7684\u7248\u672C\u3002\n\n\u8FD9\u4E9B\u989D\u5916\u9009\u9879\u5982\u6709\u66F4\u6539\uFF0C\u6055\u4E0D\u53E6\u884C\u901A\u77E5\u3002\n" },
            { "java.launcher.cls.error1", "\u9519\u8BEF: \u627E\u4E0D\u5230\u6216\u65E0\u6CD5\u52A0\u8F7D\u4E3B\u7C7B {0}\n\u539F\u56E0: {1}: {2}" },
            { "java.launcher.cls.error2", "\u9519\u8BEF: main \u65B9\u6CD5\u4E0D\u662F\u7C7B {1} \u4E2D\u7684{0}, \u8BF7\u5C06 main \u65B9\u6CD5\u5B9A\u4E49\u4E3A:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error3", "\u9519\u8BEF: main \u65B9\u6CD5\u5FC5\u987B\u8FD4\u56DE\u7C7B {0} \u4E2D\u7684\u7A7A\u7C7B\u578B\u503C, \u8BF7\n\u5C06 main \u65B9\u6CD5\u5B9A\u4E49\u4E3A:\n   public static void main(String[] args)" },
            { "java.launcher.cls.error4", "\u9519\u8BEF: \u5728\u7C7B {0} \u4E2D\u627E\u4E0D\u5230 main \u65B9\u6CD5, \u8BF7\u5C06 main \u65B9\u6CD5\u5B9A\u4E49\u4E3A:\n   public static void main(String[] args)\n\u5426\u5219 JavaFX \u5E94\u7528\u7A0B\u5E8F\u7C7B\u5FC5\u987B\u6269\u5C55{1}" },
            { "java.launcher.cls.error5", "\u9519\u8BEF: \u7F3A\u5C11 JavaFX \u8FD0\u884C\u65F6\u7EC4\u4EF6, \u9700\u8981\u4F7F\u7528\u8BE5\u7EC4\u4EF6\u6765\u8FD0\u884C\u6B64\u5E94\u7528\u7A0B\u5E8F" },
            { "java.launcher.cls.error6", "\u9519\u8BEF: \u52A0\u8F7D\u4E3B\u7C7B {0} \u65F6\u51FA\u73B0 LinkageError\n\t{1}" },
            { "java.launcher.cls.error7", "\u9519\u8BEF: \u65E0\u6CD5\u521D\u59CB\u5316\u4E3B\u7C7B {0}\n\u539F\u56E0: {1}: {2}" },
            { "java.launcher.init.error", "\u521D\u59CB\u5316\u9519\u8BEF" },
            { "java.launcher.jar.error1", "\u9519\u8BEF: \u5C1D\u8BD5\u6253\u5F00\u6587\u4EF6{0}\u65F6\u51FA\u73B0\u610F\u5916\u9519\u8BEF" },
            { "java.launcher.jar.error2", "\u5728{0}\u4E2D\u627E\u4E0D\u5230\u6E05\u5355" },
            { "java.launcher.jar.error3", "{0}\u4E2D\u6CA1\u6709\u4E3B\u6E05\u5355\u5C5E\u6027" },
            { "java.launcher.jar.error4", "\u5728 {0} \u4E2D\u52A0\u8F7D Java \u4EE3\u7406\u65F6\u51FA\u9519" },
            { "java.launcher.javafx.error1", "\u9519\u8BEF: JavaFX launchApplication \u65B9\u6CD5\u5177\u6709\u9519\u8BEF\u7684\u7B7E\u540D, \u5FC5\u987B\n\u5C06\u65B9\u6CD5\u58F0\u660E\u4E3A\u9759\u6001\u65B9\u6CD5\u5E76\u8FD4\u56DE\u7A7A\u7C7B\u578B\u7684\u503C" },
            { "java.launcher.module.error1", "\u6A21\u5757 {0} \u4E0D\u5177\u6709 ModuleMainClass \u5C5E\u6027\uFF0C\u8BF7\u4F7F\u7528 -m <\u6A21\u5757>/<\u4E3B\u7C7B>" },
            { "java.launcher.module.error2", "\u9519\u8BEF: \u5728\u6A21\u5757 {1} \u4E2D\u627E\u4E0D\u5230\u6216\u65E0\u6CD5\u52A0\u8F7D\u4E3B\u7C7B {0}" },
            { "java.launcher.module.error3", "\u9519\u8BEF: \u65E0\u6CD5\u5C06\u4E3B\u7C7B {0} \u52A0\u8F7D\u5230\u6A21\u5757 {1} \u4E2D\n\t{2}" },
            { "java.launcher.module.error4", "\u627E\u4E0D\u5230{0}" },
            { "java.launcher.module.error5", "\u9519\u8BEF: \u65E0\u6CD5\u521D\u59CB\u5316\u6A21\u5757 {1} \u4E2D\u7684\u4E3B\u7C7B {0}\n\u539F\u56E0: {1}: {2}" },
            { "java.launcher.opt.footer", "    -cp <\u76EE\u5F55\u548C zip/jar \u6587\u4EF6\u7684\u7C7B\u641C\u7D22\u8DEF\u5F84>\n    -classpath <\u76EE\u5F55\u548C zip/jar \u6587\u4EF6\u7684\u7C7B\u641C\u7D22\u8DEF\u5F84>\n    --class-path <\u76EE\u5F55\u548C zip/jar \u6587\u4EF6\u7684\u7C7B\u641C\u7D22\u8DEF\u5F84>\n                  \u4F7F\u7528 {0} \u5206\u9694\u7684, \u7528\u4E8E\u641C\u7D22\u7C7B\u6587\u4EF6\u7684\u76EE\u5F55, JAR \u6863\u6848\n                  \u548C ZIP \u6863\u6848\u5217\u8868\u3002\n    -p <\u6A21\u5757\u8DEF\u5F84>\n    --module-path <\u6A21\u5757\u8DEF\u5F84>...\n                  \u7528 {0} \u5206\u9694\u7684\u76EE\u5F55\u5217\u8868, \u6BCF\u4E2A\u76EE\u5F55\n                  \u90FD\u662F\u4E00\u4E2A\u5305\u542B\u6A21\u5757\u7684\u76EE\u5F55\u3002\n    --upgrade-module-path <\u6A21\u5757\u8DEF\u5F84>...\n                  \u7528 {0} \u5206\u9694\u7684\u76EE\u5F55\u5217\u8868, \u6BCF\u4E2A\u76EE\u5F55\n                  \u90FD\u662F\u4E00\u4E2A\u5305\u542B\u6A21\u5757\u7684\u76EE\u5F55, \u8FD9\u4E9B\u6A21\u5757\n                  \u7528\u4E8E\u66FF\u6362\u8FD0\u884C\u65F6\u6620\u50CF\u4E2D\u7684\u53EF\u5347\u7EA7\u6A21\u5757\n    --add-modules <\u6A21\u5757\u540D\u79F0>[,<\u6A21\u5757\u540D\u79F0>...]\n                  \u9664\u4E86\u521D\u59CB\u6A21\u5757\u4E4B\u5916\u8981\u89E3\u6790\u7684\u6839\u6A21\u5757\u3002\n                  <\u6A21\u5757\u540D\u79F0> \u8FD8\u53EF\u4EE5\u4E3A ALL-DEFAULT, ALL-SYSTEM,\n                  ALL-MODULE-PATH.\n    --list-modules\n                  \u5217\u51FA\u53EF\u89C2\u5BDF\u6A21\u5757\u5E76\u9000\u51FA\n    -d <module name>\n    --describe-module <\u6A21\u5757\u540D\u79F0>\n                  \u63CF\u8FF0\u6A21\u5757\u5E76\u9000\u51FA\n    --dry-run     \u521B\u5EFA VM \u5E76\u52A0\u8F7D\u4E3B\u7C7B, \u4F46\u4E0D\u6267\u884C main \u65B9\u6CD5\u3002\n                  \u6B64 --dry-run \u9009\u9879\u5BF9\u4E8E\u9A8C\u8BC1\u8BF8\u5982\n                  \u6A21\u5757\u7CFB\u7EDF\u914D\u7F6E\u8FD9\u6837\u7684\u547D\u4EE4\u884C\u9009\u9879\u53EF\u80FD\u975E\u5E38\u6709\u7528\u3002\n    --validate-modules\n                  \u9A8C\u8BC1\u6240\u6709\u6A21\u5757\u5E76\u9000\u51FA\n                  --validate-modules \u9009\u9879\u5BF9\u4E8E\u67E5\u627E\n                  \u6A21\u5757\u8DEF\u5F84\u4E2D\u6A21\u5757\u7684\u51B2\u7A81\u53CA\u5176\u4ED6\u9519\u8BEF\u53EF\u80FD\u975E\u5E38\u6709\u7528\u3002\n    -D<\u540D\u79F0>=<\u503C>\n                  \u8BBE\u7F6E\u7CFB\u7EDF\u5C5E\u6027\n    -verbose:[class|module|gc|jni]\n                  \u542F\u7528\u8BE6\u7EC6\u8F93\u51FA\n    -version      \u5C06\u4EA7\u54C1\u7248\u672C\u8F93\u51FA\u5230\u9519\u8BEF\u6D41\u5E76\u9000\u51FA\n    --version     \u5C06\u4EA7\u54C1\u7248\u672C\u8F93\u51FA\u5230\u8F93\u51FA\u6D41\u5E76\u9000\u51FA\n    -showversion  \u5C06\u4EA7\u54C1\u7248\u672C\u8F93\u51FA\u5230\u9519\u8BEF\u6D41\u5E76\u7EE7\u7EED\n    --show-version\n                  \u5C06\u4EA7\u54C1\u7248\u672C\u8F93\u51FA\u5230\u8F93\u51FA\u6D41\u5E76\u7EE7\u7EED\n    --show-module-resolution\n                  \u5728\u542F\u52A8\u8FC7\u7A0B\u4E2D\u663E\u793A\u6A21\u5757\u89E3\u6790\u8F93\u51FA\n    -? -h -help\n                  \u5C06\u6B64\u5E2E\u52A9\u6D88\u606F\u8F93\u51FA\u5230\u9519\u8BEF\u6D41\n    --help        \u5C06\u6B64\u5E2E\u52A9\u6D88\u606F\u8F93\u51FA\u5230\u8F93\u51FA\u6D41\n    -X            \u5C06\u989D\u5916\u9009\u9879\u7684\u5E2E\u52A9\u8F93\u51FA\u5230\u9519\u8BEF\u6D41\n    --help-extra  \u5C06\u989D\u5916\u9009\u9879\u7684\u5E2E\u52A9\u8F93\u51FA\u5230\u8F93\u51FA\u6D41\n    -ea[:<\u7A0B\u5E8F\u5305\u540D\u79F0>...|:<\u7C7B\u540D>]\n    -enableassertions[:<\u7A0B\u5E8F\u5305\u540D\u79F0>...|:<\u7C7B\u540D>]\n                  \u6309\u6307\u5B9A\u7684\u7C92\u5EA6\u542F\u7528\u65AD\u8A00\n    -da[:<\u7A0B\u5E8F\u5305\u540D\u79F0>...|:<\u7C7B\u540D>]\n    -disableassertions[:<\u7A0B\u5E8F\u5305\u540D\u79F0>...|:<\u7C7B\u540D>]\n                  \u6309\u6307\u5B9A\u7684\u7C92\u5EA6\u7981\u7528\u65AD\u8A00\n    -esa | -enablesystemassertions\n                  \u542F\u7528\u7CFB\u7EDF\u65AD\u8A00\n    -dsa | -disablesystemassertions\n                  \u7981\u7528\u7CFB\u7EDF\u65AD\u8A00\n    -agentlib:<\u5E93\u540D>[=<\u9009\u9879>]\n                  \u52A0\u8F7D\u672C\u673A\u4EE3\u7406\u5E93 <\u5E93\u540D>, \u4F8B\u5982 -agentlib:jdwp\n                  \u53E6\u8BF7\u53C2\u9605 -agentlib:jdwp=help\n    -agentpath:<\u8DEF\u5F84\u540D>[=<\u9009\u9879>]\n                  \u6309\u5B8C\u6574\u8DEF\u5F84\u540D\u52A0\u8F7D\u672C\u673A\u4EE3\u7406\u5E93\n    -javaagent:<jar \u8DEF\u5F84>[=<\u9009\u9879>]\n                  \u52A0\u8F7D Java \u7F16\u7A0B\u8BED\u8A00\u4EE3\u7406, \u8BF7\u53C2\u9605 java.lang.instrument\n    -splash:<\u56FE\u50CF\u8DEF\u5F84>\n                  \u4F7F\u7528\u6307\u5B9A\u7684\u56FE\u50CF\u663E\u793A\u542F\u52A8\u5C4F\u5E55\n                  \u81EA\u52A8\u652F\u6301\u548C\u4F7F\u7528 HiDPI \u7F29\u653E\u56FE\u50CF\n                  (\u5982\u679C\u53EF\u7528)\u3002\u5E94\u59CB\u7EC8\u5C06\u672A\u7F29\u653E\u7684\u56FE\u50CF\u6587\u4EF6\u540D (\u4F8B\u5982, image.ext)\n                  \u4F5C\u4E3A\u53C2\u6570\u4F20\u9012\u7ED9 -splash \u9009\u9879\u3002\n                  \u5C06\u81EA\u52A8\u9009\u53D6\u63D0\u4F9B\u7684\u6700\u5408\u9002\u7684\u7F29\u653E\n                  \u56FE\u50CF\u3002\n                  \u6709\u5173\u8BE6\u7EC6\u4FE1\u606F, \u8BF7\u53C2\u9605 SplashScreen API \u6587\u6863\n    @argument \u6587\u4EF6\n                  \u4E00\u4E2A\u6216\u591A\u4E2A\u5305\u542B\u9009\u9879\u7684\u53C2\u6570\u6587\u4EF6\n    -disable-@files\n                  \u963B\u6B62\u8FDB\u4E00\u6B65\u6269\u5C55\u53C2\u6570\u6587\u4EF6\n    --enable-preview\n                  \u5141\u8BB8\u7C7B\u4F9D\u8D56\u4E8E\u6B64\u53D1\u884C\u7248\u7684\u9884\u89C8\u529F\u80FD\n\u8981\u4E3A\u957F\u9009\u9879\u6307\u5B9A\u53C2\u6570, \u53EF\u4EE5\u4F7F\u7528 --<\u540D\u79F0>=<\u503C> \u6216\n--<\u540D\u79F0> <\u503C>\u3002\n" },
            { "java.launcher.opt.header", "\u7528\u6CD5\uFF1A{0} [options] <\u4E3B\u7C7B> [args...]\n           \uFF08\u6267\u884C\u7C7B\uFF09\n   \u6216  {0} [options] -jar <jar \u6587\u4EF6> [args...]\n           \uFF08\u6267\u884C jar \u6587\u4EF6\uFF09\n   \u6216  {0} [options] -m <\u6A21\u5757>[/<\u4E3B\u7C7B>] [args...]\n       {0} [options] --module <\u6A21\u5757>[/<\u4E3B\u7C7B>] [args...]\n           \uFF08\u6267\u884C\u6A21\u5757\u4E2D\u7684\u4E3B\u7C7B\uFF09\n   \u6216  {0} [options] <\u6E90\u6587\u4EF6> [args]\n           \uFF08\u6267\u884C\u5355\u4E2A\u6E90\u6587\u4EF6\u7A0B\u5E8F\uFF09\n\n \u5C06\u4E3B\u7C7B\u3001\u6E90\u6587\u4EF6\u3001-jar <jar \u6587\u4EF6>\u3001-m \u6216\n --module <\u6A21\u5757>/<\u4E3B\u7C7B> \u540E\u7684\u53C2\u6570\u4F5C\u4E3A\u53C2\u6570\n \u4F20\u9012\u5230\u4E3B\u7C7B\u3002\n\n \u5176\u4E2D\uFF0C\u9009\u9879\u5305\u62EC\uFF1A\n\n" },
            { "java.launcher.opt.hotspot", "    {0}\t  \u662F \"{1}\" VM \u7684\u540C\u4E49\u8BCD [\u5DF2\u8FC7\u65F6]\n" },
            { "java.launcher.opt.vmselect", "    {0}\t  \u9009\u62E9 \"{1}\" VM\n" },
        };
    }
}
