package controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionRequestContent {
	private String ref;
    private Map<String, Object> reqAttr;
    private Map<String, String[]> reqParam;
    private Map<String, Object> sessionAttr;
    
    public SessionRequestContent(HttpServletRequest req) {
        sessionAttr = new HashMap<>();
        reqAttr = new HashMap<>();
        try {
            reqParam = req.getParameterMap();
            Enumeration<String> reqAttributeNames = req.getAttributeNames();
            while (reqAttributeNames.hasMoreElements()) {
                String attributeName = reqAttributeNames.nextElement();
                reqAttr.put(attributeName, req.getAttribute(attributeName));
            }
            HttpSession currentSession = req.getSession(false);
            if (currentSession != null) {
                Enumeration<String> sessionAttributeNames = currentSession.getAttributeNames();
                while (sessionAttributeNames.hasMoreElements()) {
                    String attributeName = sessionAttributeNames.nextElement();
                    sessionAttr.put(attributeName, currentSession.getAttribute(attributeName));
                }
            }
            ref = req.getHeader("Ref");
        } catch (NullPointerException npe) {
           System.out.println("there is nothing");
        }
    }

    public boolean checkRequestAttribute(String attrName) {
        return reqAttr.containsKey(attrName);
    }

    public boolean checkRequestParameter(String attrName) {
        return reqParam.containsKey(attrName);
    }

    public boolean checkSessionAttribute(String attrName) {
        return sessionAttr.containsKey(attrName);
    }

    public String getReferer() {
        return ref;
    }

    public Object getRequestAttribute(String key) {
        return reqAttr.get(key);
    }

    public String[] getRequestParameter(String key) {
        return reqParam.get(key);
    }

    public Object getSessionAttribute(String key) {
        return sessionAttr.get(key);
    }
}
