package server.container;

import server.HttpServlet;

import java.util.Map;

public class Context {

    public Context() {
    }

    public Context(Map<String, HttpServlet> servletMap) {
        this.servletMap = servletMap;
    }

    private Map<String, HttpServlet> servletMap;

    public Map<String, HttpServlet> getServletMap() {
        return servletMap;
    }

    public void setServletMap(Map<String, HttpServlet> servletMap) {
        this.servletMap = servletMap;
    }
}
