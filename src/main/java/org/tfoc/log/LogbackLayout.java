package org.tfoc.log;

import ch.qos.logback.classic.PatternLayout;

public class LogbackLayout
        extends PatternLayout {

    public static final String LOG_BANNER =
            """

             ████████╗██╗  ██╗███████╗    ███████╗███████╗██╗     ██╗      ██████╗ ██╗    ██╗███████╗██╗  ██╗██╗██████╗      ██████╗ ███████╗     ██████╗ ██████╗ ██████╗ ███████╗
             ╚══██╔══╝██║  ██║██╔════╝    ██╔════╝██╔════╝██║     ██║     ██╔═══██╗██║    ██║██╔════╝██║  ██║██║██╔══██╗    ██╔═══██╗██╔════╝    ██╔════╝██╔═══██╗██╔══██╗██╔════╝
                ██║   ███████║█████╗      █████╗  █████╗  ██║     ██║     ██║   ██║██║ █╗ ██║███████╗███████║██║██████╔╝    ██║   ██║█████╗      ██║     ██║   ██║██║  ██║█████╗  
                ██║   ██╔══██║██╔══╝      ██╔══╝  ██╔══╝  ██║     ██║     ██║   ██║██║███╗██║╚════██║██╔══██║██║██╔═══╝     ██║   ██║██╔══╝      ██║     ██║   ██║██║  ██║██╔══╝  
                ██║   ██║  ██║███████╗    ██║     ███████╗███████╗███████╗╚██████╔╝╚███╔███╔╝███████║██║  ██║██║██║         ╚██████╔╝██║         ╚██████╗╚██████╔╝██████╔╝███████╗
                ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚═╝     ╚══════╝╚══════╝╚══════╝ ╚═════╝  ╚══╝╚══╝ ╚══════╝╚═╝  ╚═╝╚═╝╚═╝          ╚═════╝ ╚═╝          ╚═════╝ ╚═════╝ ╚═════╝ ╚══════╝
             
             The Mirror of Galadriel: Episode #006 - Serialize and Deserialize Binary Tree

             Congratulations on running your first test!

            """;

    @Override
    public String getFileHeader() {

        return LOG_BANNER;
    }

}
