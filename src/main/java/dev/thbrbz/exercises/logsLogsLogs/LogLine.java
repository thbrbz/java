package dev.thbrbz.exercises.logsLogsLogs;

public class LogLine {
    String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = logLine.substring(1, logLine.indexOf("]"));

        return switch(level) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return String.format("%d:%s",
            getLogLevel().getLevelNumber(),
            logLine.substring(logLine.indexOf(": ")+2)
        );
    }
}
