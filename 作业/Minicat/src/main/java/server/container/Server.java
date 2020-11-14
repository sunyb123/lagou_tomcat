package server.container;

import java.util.Map;

public class Server {
    private Map<String, Mapper> serviceMap;

    public Server() {
    }

    public Server(Map<String, Mapper> serviceMap) {
        this.serviceMap = serviceMap;
    }

    public Map<String, Mapper> getServiceMap() {
        return serviceMap;
    }

    public void setServiceMap(Map<String, Mapper> serviceMap) {
        this.serviceMap = serviceMap;
    }
}
