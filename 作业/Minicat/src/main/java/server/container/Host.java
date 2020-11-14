package server.container;

import java.util.Map;

public class Host {

    public Host() {
    }

    public Host(Map<String, Context> contextMap) {
        this.contextMap = contextMap;
    }

    // hHst 中的 Context
    private Map<String, Context> contextMap;

    public Map<String, Context> getContextMap() {
        return contextMap;
    }

    public void setContextMap(Map<String, Context> contextMap) {
        this.contextMap = contextMap;
    }
}
